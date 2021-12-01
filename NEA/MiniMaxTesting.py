import math
from ChessLogic import *

CurrentTurn = "White"

#Minimax
def minimax(State,depth,Maximizing,Alpha,Beta):
    if depth == 0: #When At Given Depth Return Value OF Position
        return (Evaluate(State),State) #Evaluate Current Position

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
                MaxBestValue = (max(MaxBestValue[0], Value[0]),tempBoard.Get_Board()) #Get Largest Value
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
                MinBestValue = (min(MinBestValue[0], Value[0]),tempBoard.Get_Board()) #Get Smallest Value
                Beta = min(Beta,Value[0]) #Beta Value Set
                #Alpha-Beta Pruning
                if Beta <= Alpha:
                    break
            if Beta <= Alpha:
                    break
        return MinBestValue #Return Value And Child It Is From

#Evaluation
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
        
    return FinalValue



print(minimax(Game.board,3,False,-math.inf,math.inf))
