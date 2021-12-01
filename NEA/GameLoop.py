from ChessLogic import *
import math

#Start with white move
CurrentTurn = "White"

#Variable to keep the game running
Running = True

#Variables For Check and Mate
WhiteKingCheck = False
BlackKingCheck = False
WhiteKingCheckmate = False
BlackKingCheckmate = False
Stalemate = False

#Variable For Winning Team
Winner = ""

#Evaluation Function
def Evaluate(State):
    #Create A New Board
    Board= [["","","","","","","",""],
            ["","","","","","","",""],
            ["","","","","","","",""],
            ["","","","","","","",""],
            ["","","","","","","",""],
            ["","","","","","","",""],
            ["","","","","","","",""],
            ["","","","","","","",""]]
    
    #Set The Positions As Tuples Of (Piece,Team)
    for x in range(0,8):
        for y in range(0,8):
            Board[y][x] = (State[y][x].Get_Details()[0],State[y][x].Get_Details()[1])

    #White Has Positive Score Black Has Negative Score
    TeamMod = {"White":1,"Black":-1,"None":0}

    Values = open("Values.txt","r")
    
    #Pieces Have Idividual Values
    PieceValues = {"Pawn":int(Values.readline()),"Rook":int(Values.readline()),
                   "Knight":int(Values.readline()),"Bishop":int(Values.readline()),
                   "Queen":int(Values.readline()),"King":int(Values.readline()),
                   "Empty":0}
    
    Values.close()

    #Positions Have Varying Multipliers For Each Piece
    
#    [[0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0], Players Side Of Board
#     [0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0],
#     [0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0],
#     [0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0],
#     [0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0],
#     [0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0],
#     [0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0],
#     [0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0]] Opponents Side Of Board

    PositonValues = {"Pawn":[[0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0],
                             [0.1,0.1,0.1,0.1,0.1,0.1,0.1,0.1],
                             [0.1,0.1,0.3,0.3,0.3,0.3,0.1,0.1],
                             [0.1,0.3,0.6,0.8,0.8,0.6,0.3,0.1],
                             [0.3,0.6,0.8,0.8,0.8,0.8,0.6,0.3],
                             [0.6,0.8,0.8,0.8,0.8,0.8,0.8,0.6],
                             [0.8,0.9,0.9,0.9,0.9,0.9,0.9,0.8],
                             [1.0,1.0,1.0,1.0,1.0,1.0,1.0,1.0]]
                     ,"Rook":[[1.0,1.0,1.0,1.0,1.0,1.0,1.0,1.0],
                              [1.0,1.0,1.0,1.0,1.0,1.0,1.0,1.0],
                              [1.0,1.0,1.0,1.0,1.0,1.0,1.0,1.0],
                              [1.0,1.0,1.0,1.0,1.0,1.0,1.0,1.0],
                              [1.0,1.0,1.0,1.0,1.0,1.0,1.0,1.0],
                              [1.0,1.0,1.0,1.0,1.0,1.0,1.0,1.0],
                              [1.0,1.0,1.0,1.0,1.0,1.0,1.0,1.0],
                              [1.0,1.0,1.0,1.0,1.0,1.0,1.0,1.0]]
                     ,"Knight":[[0.1,0.1,0.1,0.1,0.1,0.1,0.1,0.1],
                                [0.1,0.2,0.2,0.2,0.2,0.2,0.2,0.1],
                                [0.1,0.2,0.6,0.6,0.6,0.6,0.2,0.1],
                                [0.1,0.2,0.6,0.8,0.8,0.6,0.2,0.1],
                                [0.1,0.2,0.6,0.8,0.8,0.6,0.2,0.1],
                                [0.1,0.2,0.6,0.6,0.6,0.6,0.2,0.1],
                                [0.1,0.2,0.2,0.2,0.2,0.2,0.2,0.1],
                                [0.1,0.1,0.1,0.1,0.1,0.1,0.1,0.1]]
                     ,"Bishop":[[1.0,1.0,1.0,1.0,1.0,1.0,1.0,1.0],
                                [1.0,1.0,1.0,1.0,1.0,1.0,1.0,1.0],
                                [1.0,1.0,1.0,1.0,1.0,1.0,1.0,1.0],
                                [1.0,1.0,1.0,1.0,1.0,1.0,1.0,1.0],
                                [1.0,1.0,1.0,1.0,1.0,1.0,1.0,1.0],
                                [1.0,1.0,1.0,1.0,1.0,1.0,1.0,1.0],
                                [1.0,1.0,1.0,1.0,1.0,1.0,1.0,1.0],
                                [1.0,1.0,1.0,1.0,1.0,1.0,1.0,1.0]]
                     ,"Queen":[[1.0,1.0,1.0,1.0,1.0,1.0,1.0,1.0],
                               [1.0,1.0,1.0,1.0,1.0,1.0,1.0,1.0],
                               [1.0,1.0,1.0,1.0,1.0,1.0,1.0,1.0],
                               [1.0,1.0,1.0,1.0,1.0,1.0,1.0,1.0],
                               [1.0,1.0,1.0,1.0,1.0,1.0,1.0,1.0],
                               [1.0,1.0,1.0,1.0,1.0,1.0,1.0,1.0],
                               [1.0,1.0,1.0,1.0,1.0,1.0,1.0,1.0],
                               [1.0,1.0,1.0,1.0,1.0,1.0,1.0,1.0]]
                     ,"King":[[1.0,1.0,1.0,1.0,1.0,1.0,1.0,1.0],
                              [0.5,0.5,0.5,0.5,0.5,0.5,0.5,0.5],
                              [0.3,0.3,0.3,0.3,0.3,0.3,0.3,0.3],
                              [0.1,0.1,0.1,0.1,0.1,0.1,0.1,0.1],
                              [0.1,0.1,0.1,0.1,0.1,0.1,0.1,0.1],
                              [0.1,0.1,0.1,0.1,0.1,0.1,0.1,0.1],
                              [0.1,0.1,0.1,0.1,0.1,0.1,0.1,0.1],
                              [0.1,0.1,0.1,0.1,0.1,0.1,0.1,0.1]]
                     ,"Empty":[[0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0],
                               [0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0],
                               [0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0],
                               [0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0],
                               [0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0],
                               [0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0],
                               [0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0],
                               [0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0]]}
    
    #Replace Pieces With Their Values
    for x in range(0,8):
        for y in range(0,8):
            if Board[y][x][1] == "White":
                Board[y][x] = PieceValues[Board[y][x][0]] * PositonValues[Board[y][x][0]][y][x] * TeamMod[Board[y][x][1]]
            elif Board[y][x][1] == "Black":
                Board[y][x] = PieceValues[Board[y][x][0]] * PositonValues[Board[y][x][0]][7 - y][x] * TeamMod[Board[y][x][1]]
                
    #Sum Values
    FinalValue = 0
    for x in range(0,8):
        for y in range(0,8):
            try:
                FinalValue = FinalValue + Board[y][x]
            except TypeError:
                pass
    if WhiteKingCheckmate == True:
        FinalValue = -math.inf
    elif BlackKingCheckmate == True:
        FinalValue = math.inf
    return FinalValue

#Minimax Function
def minimax(State,depth,Maximizing,Alpha,Beta):
    if depth == 0: #When At Given Depth Return Value OF Position
        return [Evaluate(State),State] #Evaluate Current Position

    #Clear Valid Moves
    tempvalidmoves = {}
    #Make List Of Valid Moves
    for x in range(0,8):
            for y in range(0,8):
                if State[y][x].Get_Details()[1] == CurrentTurn:
                    tempvalidmoves.update({(x,y):State[y][x].Get_Valid_Moves()})

    if Maximizing: #Maximise
        MaxBestValue = (-math.inf,'Error') # Set Best Value As -Infinity
        for InitialPosition,NewPositions in tempvalidmoves.items():
            for NewPositionIndex in range(0,len(NewPositions),1):
                #Create A Copy Of The Game Board To Use
                tempBoard = Board()
                for x in range(0,8):
                    for y in range(0,8):
                        tempBoard.board[y][x] = State[y][x]
                #Make The Moves One By One
                tempBoard.Move(InitialPosition,NewPositions[NewPositionIndex])
                Value = minimax(tempBoard.Get_Board(),depth - 1, False, Alpha, Beta) #Iterate Minimax
                if Value[0] >= MaxBestValue[0]:#Get Largest Value
                    MaxBestValue = (Value[0],tempBoard.Get_Board()) 
                    Alpha = max(Alpha,Value[0]) #Alpha Value Set
                #Alpha-Beta Pruning
                if Beta <= Alpha:
                    break
            if Beta <= Alpha:
                    break
        return MaxBestValue #Return Value And Child It Is From

    else: #Minimise
        MinBestValue = (math.inf,'Error') # Set Best Value As Infinity
        for InitialPosition,NewPositions in tempvalidmoves.items():
            for NewPositionIndex in range(0,len(NewPositions),1):
                #Create A Copy Of The Game Board To Use
                tempBoard = Board()
                for x in range(0,8):
                    for y in range(0,8):
                        tempBoard.board[y][x] = State[y][x]
                #Make The Moves One By One
                tempBoard.Move(InitialPosition,NewPositions[NewPositionIndex])
                Value = minimax(tempBoard.Get_Board(),depth - 1,True, Alpha, Beta) #Iterate Minimax
                if Value[0] <= MinBestValue[0]:#Get Smallest Value
                    MinBestValue = (Value[0],tempBoard.Get_Board()) 
                    Beta = min(Beta,Value[0]) #Beta Value Set
                #Alpha-Beta Pruning
                if Beta <= Alpha:
                    break
            if Beta <= Alpha:
                    break
        return MinBestValue #Return Value And Child It Is From

#Loop For Gameplay
while Running == True:
    #Display Board ///TEMP/// Prints The Board
    for y in range(7, -1, -1):
        temp = ""
        for x in range(0, 8):
            temp = temp + str(Game.Display()[y][x])
        print(temp)

    #Update self.position
    for x in range(0,8):
        for y in range(0,8):
            Game.Get_Board()[y][x].UpdatePos(x,y)

    #Clear Valid Moves
    ValidMoves = {}

    #Make List Of Valid Moves
    for x in range(0,8):
            for y in range(0,8):
                if Game.Get_Board()[y][x].Get_Details()[1] == CurrentTurn:
                    ValidMoves.update({(x,y):Game.Get_Board()[y][x].Get_Valid_Moves()})
        
    #Look For Check
        
    #- White
    if CurrentTurn == "White":
        #Get King Position
        for x in range(0,8):
            for y in range(0,8):
                #Check Not Empty
                if Game.Get_Board()[y][x].Get_Details() != Empty().Get_Details():
                    #Check Is A King
                    if Game.Get_Board()[y][x].Get_Details()[0] == "King":
                        #Check Is White Team
                        if Game.Get_Board()[y][x].Get_Details()[1] == "White":
                            #Set Position
                            WhiteKingPosition = (x,y)
                            break
        #Check if king is under attack
        try:         
            if Game.Get_Board()[WhiteKingPosition[1]][WhiteKingPosition[0]].Under_Attack(WhiteKingPosition[0],WhiteKingPosition[1]) == True:
                WhiteKingCheck = True
            else:
                WhiteKingCheck = False
        except AttributeError:
            WhiteKingCheckmate = True
            
    #- Black
    elif CurrentTurn == "Black":
        #Get King Position
        for x in range(0,8):
            for y in range(0,8):
                #Check Not Empty
                if Game.Get_Board()[y][x].Get_Details() != Empty().Get_Details():
                    #Check Is A King
                    if Game.Get_Board()[y][x].Get_Details()[0] == "King":
                        #Check Is Black Team
                        if Game.Get_Board()[y][x].Get_Details()[1] == "Black":
                            #Set Position
                            BlackKingPosition = (x,y)
                            break
        #Check if king is under attack
        try:
            if Game.Get_Board()[BlackKingPosition[1]][BlackKingPosition[0]].Under_Attack(BlackKingPosition[0],BlackKingPosition[1]) == True:
                BlackKingCheck = True
            else:
                BlackKingCheck = False
        except AttributeError:
            BlackKingCheckmate = True
                    
    #- Limit Moves If check
    TempValidMoves = ValidMoves.copy()
    for InitialPosition,NewPositions in ValidMoves.items():
        TempNewPositions = NewPositions # Make A Copy Of Current New Positions
        for NewPositionIndex in range(0,len(NewPositions)):
            tempBoard = Board()
            for y in range(0,8):
                for x in range(0,8):
                    #Create A Board For Each Possible Game State
                    tempBoard.board[y][x] = Game.board[y][x]
            try:
                tempBoard.Move(InitialPosition,NewPositions[NewPositionIndex])
            except IndexError:
                pass
            #Look For Check
            updatedwhite = False
            updatedblack = False
            #- White
            if CurrentTurn == "White":
                #Get King Position
                for x in range(0,8):
                    for y in range(0,8):
                        #Check Not Empty
                        if tempBoard.Get_Board()[y][x].Get_Details() != Empty().Get_Details():
                            #Check Is A King
                            if tempBoard.Get_Board()[y][x].Get_Details()[0] == "King":
                                #Check Is White Team
                                if tempBoard.Get_Board()[y][x].Get_Details()[1] == "White":
                                    #Set Position
                                    KingPosition = (x,y)
                                    updatedwhite = True
                                    break
            #- Black
            elif CurrentTurn == "Black":
                #Get King Position
                for x in range(0,8):
                    for y in range(0,8):
                        #Check Not Empty
                        if tempBoard.Get_Board()[y][x].Get_Details() != Empty().Get_Details():
                            #Check Is A King
                            if tempBoard.Get_Board()[y][x].Get_Details()[0] == "King":
                                #Check Is Black Team
                                if tempBoard.Get_Board()[y][x].Get_Details()[1] == "Black":
                                    #Set Position
                                    KingPosition = (x,y)
                                    updatedblack = True
                                    break
            #- Check If King Is Under Attack In New Board State
            try:
                if tempBoard.Get_Board()[KingPosition[1]][KingPosition[0]].Under_Attack(KingPosition[0],KingPosition[1]) == True:
                    #Eliminate Current Move From Valid Moves Dict Values
                    TempNewPositions.remove(NewPositions[NewPositionIndex])
                    ValidMoves.update({InitialPosition:TempNewPositions})
            except IndexError:
                pass
        #Delete Empty Keys From Valid Moves Dict
        if TempValidMoves[InitialPosition] == ("" or '' or None or []):
            TempValidMoves.pop(InitialPosition)    
    ValidMoves = TempValidMoves.copy()
    if (updatedwhite == False) and (CurrentTurn == "White"):
        print("!Game Couldn't Find The White King")
        WhiteKingCheckmate = True
    elif (updatedblack == False) and (CurrentTurn == "Black"):
        print("!Game Couldn't Find The Black King")
        BlackKingCheckmate = True
               
    print(ValidMoves) # ///TEMP/// Prints Available Moves
    print(CurrentTurn) # ///TEMP/// Prints Current Turn 

    #Human Move
    if CurrentTurn == "White":
        #Get The Users Move 
        Wait = True
        Error = False
        while Wait == True:
            UsersInitialPosition = input("Enter The Coordinates Of The Piece You Wish To Move(xy):  ")
            #Reformats Moves
            try:
                UsersInitialPositionX = int(UsersInitialPosition[0])
                UsersInitialPositionY = int(UsersInitialPosition[1])
            except ValueError:
                print("Enter The Coordinates In Numerical Form")
                Error = True
            #Check There Is A Piece In That Position
            if Error == False:
                if Game.board[UsersInitialPositionY][UsersInitialPositionX].Get_Details()[1] == "None":
                    print("There Is No Piece In That Position")
                    Error = True
                #Check The Piece Belongs To The Current Player
                elif Game.board[UsersInitialPositionY][UsersInitialPositionX].Get_Details()[1] != CurrentTurn:
                    print("That Piece Does Not Belong To You")
                    Error = True
                # Turn The Coords Into A Tuple
                UsersInitialPosition = (UsersInitialPositionX,UsersInitialPositionY)
            if Error == False:
                # Print The New Coords For The Piece
                try:
                    print("Pick A New Position: ",ValidMoves[UsersInitialPosition])
                except KeyError:
                    #Check The Piece Can Be Moved
                    print("That Piece Cannot Be Moved")
                    Error = True
                if Error == False:
                    #Get New Position
                    UsersNewPosition = input("(xy):  ")
                    #Reformats Moves
                    try:
                        UsersNewPositionX = int(UsersNewPosition[0])
                        UsersNewPositionY = int(UsersNewPosition[1])
                    except IndexError:
                        #Index Error Exception
                        Error = True
                    #Turn It Into A Tuple
                    UsersNewPosition = (UsersNewPositionX,UsersNewPositionY)
                    if (UsersNewPosition in ValidMoves[UsersInitialPosition]) and Error != True:
                        #Reformats Moves
                        UsersNewPosition = str(UsersNewPositionX) + str(UsersNewPositionY)
                        UsersInitialPosition = str(UsersInitialPositionX) + str(UsersInitialPositionY)
                        #Makes The Move
                        Game.Move(UsersInitialPosition,UsersNewPosition)
                        #Clear The First Move Variable From Applicable Pieces If Moved
                        print(Game.board[UsersNewPositionY][UsersNewPositionX].Get_Details()[0])
                        if Game.board[UsersNewPositionY][UsersNewPositionX].Get_Details()[0] == "Pawn":
                            Game.board[UsersNewPositionY][UsersNewPositionX].Moved()
                        elif Game.board[UsersNewPositionY][UsersNewPositionX].Get_Details()[0] == "Rook":
                            Game.board[UsersNewPositionY][UsersNewPositionX].Moved()
                        elif Game.board[UsersNewPositionY][UsersNewPositionX].Get_Details()[0] == "King":
                            Game.board[UsersNewPositionY][UsersNewPositionX].Moved()
                    else:
                        print("That Is An Invalid Move")
                        Error = True
            #If There Have Been No Errors End The Loop
            if Error == False:
                Wait = False
            #Else Reset Error Tracker And Restart Loop
            else:
                Error = False
    #AI Move                
    elif CurrentTurn == "Black":
        #Change Depth To Change Skill Level minimax(State,Depth,WhiteTeam,Alpha,Beta)
        M = minimax(Game.board,4,False,-math.inf,math.inf)
        print("Value Of AI Move:",M[0]*-1)
        for y in range(0,8):
                for x in range(0,8):
                    Game.board[y][x] = M[1][y][x]

    #Pawn Promotions
    #- Check Turn
    #-- If White Team
    if CurrentTurn == "White":
        #Check Top Of The Board
        PromoteY = 7
    #-- If Black Team         
    elif CurrentTurn == "Black":
        #Check Bottom Of The Board
        PromoteY = 0
    #-- Check All X Coordinates For Given End Of Board
    for x in range(0,8,1):
        #Check The Board For Pawns
        if Game.board[PromoteY][x].Get_Details()[0] == "Pawn":
            #Make Them Queens
            PromoteName,PromoteTeam,PromoteID = Game.board[PromoteY][x].Get_Details()
            Game.board[PromoteY][x] = Queen(PromoteTeam,PromoteID)

    #Change Turn
    if CurrentTurn == "White":
        CurrentTurn = "Black"
    elif CurrentTurn == "Black":
        CurrentTurn = "White"

    #Look For Checkmate

    #- White
    #-- If In Check        
    if WhiteKingCheck == True:
        #If No Valid Moves
        if ValidMoves == {}:
            #Checkmate
            WhiteKingCheckmate = True

    #- Black
    #-- If In Check 
    elif BlackKingCheck == True:
        #If No Valid Moves
        if ValidMoves == {}:
            #Checkmate
            BlackKingCheckmate = True

    #- Stalemate
    #-- If No Valid Moves    
    elif ValidMoves == {}:
        #Stalemate
        Stalemate = True

    
    #End If Checkmate
    if BlackKingCheckmate == True:
        Running = False
        Winner = "White"
    elif WhiteKingCheckmate == True:
        Running = False
        Winner = "Black"
    elif Stalemate == True:
        Running = False
        Winner= "Draw"

if Winner == "White":
    print("White Wins!")
elif Winner == "Black":
    print("Black Wins!")
elif Winner == "Draw":
    print("Stalemate! No Winner!")
else:
    print("An Error Occured Whilst The Game Was Running")











            
    
