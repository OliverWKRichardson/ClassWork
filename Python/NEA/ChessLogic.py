#Class For Knight Piece
class Knight:
    def __init__(self,team,ID):
        self.Name = "Knight"
        self.Team = team
        self.ID = ID

    def UpdatePos(self,x,y):
        self.Position = (x,y)

    #Gives The Details Of The Piece
    def Get_Details(self):
        return self.Name,self.Team,self.ID

    #Gives The Valid Moves For The Piece
    def Get_Valid_Moves(self):
        self.ValidMoves = [ ]
        #Get Own Position
        self.Position = "This Piece Is Not On The Board"
        for x in range(0,8):
            for y in range(0,8):
                if Game.Get_Board()[y][x].Get_Details() != Empty().Get_Details():
                    if Game.Get_Board()[y][x].Get_Details() == self.Get_Details():
                        self.Position = (x,y)
                        break
        if self.Position != "This Piece Is Not On The Board":
            #Check Positions Top Right Quarter
            if (-1 < (self.Position[1] + 1) < 8) and (-1 < (self.Position[0] + 2) < 8):
                if Game.Get_Board()[self.Position[1] + 1][self.Position[0] + 2].Get_Details()[1] != self.Team:
                    self.ValidMoves.append((self.Position[0] + 2,self.Position[1] + 1))
            if (-1 < (self.Position[1] + 2) < 8) and (-1 < (self.Position[0] + 1) < 8):
                if Game.Get_Board()[self.Position[1] + 2][self.Position[0] + 1].Get_Details()[1] != self.Team:
                    self.ValidMoves.append((self.Position[0] + 1,self.Position[1] + 2))
            #Check Positions Bottom Right Quarter
            if (-1 < (self.Position[1] - 1) < 8) and (-1 < (self.Position[0] + 2) < 8):
                if Game.Get_Board()[self.Position[1] - 1][self.Position[0] + 2].Get_Details()[1] != self.Team:
                    self.ValidMoves.append((self.Position[0] + 2,self.Position[1] - 1))
            if (-1 < (self.Position[1] - 2) < 8) and (-1 < (self.Position[0] + 1) < 8):
                if Game.Get_Board()[self.Position[1] - 2][self.Position[0] + 1].Get_Details()[1] != self.Team:
                    self.ValidMoves.append((self.Position[0] + 1,self.Position[1] - 2))
            #Check Positions Bottom Left Quarter
            if (-1 < (self.Position[1] - 1) < 8) and (-1 < (self.Position[0] - 2) < 8):
                if Game.Get_Board()[self.Position[1] - 1][self.Position[0] - 2].Get_Details()[1] != self.Team:
                    self.ValidMoves.append((self.Position[0] - 2,self.Position[1] - 1))
            if (-1 < (self.Position[1] - 2) < 8) and (-1 < (self.Position[0] - 1) < 8):
                if Game.Get_Board()[self.Position[1] - 2][self.Position[0] - 1].Get_Details()[1] != self.Team:
                    self.ValidMoves.append((self.Position[0] - 1,self.Position[1] - 2))
            #Check Positions Top Left Quarter
            if (-1 < (self.Position[1] + 1) < 8) and (-1 < (self.Position[0] - 2) < 8):
                if Game.Get_Board()[self.Position[1] + 1][self.Position[0] - 2].Get_Details()[1] != self.Team:
                    self.ValidMoves.append((self.Position[0] - 2,self.Position[1] + 1))
            if (-1 < (self.Position[1] + 2) < 8) and (-1 < (self.Position[0] - 1) < 8):
                if Game.Get_Board()[self.Position[1] + 2][self.Position[0] - 1].Get_Details()[1] != self.Team:
                    self.ValidMoves.append((self.Position[0] - 1,self.Position[1] + 2))
        
        #Return Moves
        return self.ValidMoves

#Class For Queen Piece
class Queen:
    def __init__(self,team,ID):
        self.Name = "Queen"
        self.Team = team
        self.ID = ID

    def UpdatePos(self,x,y):
        self.Position = (x,y)

    #Gives The Details Of The Piece
    def Get_Details(self):
        return self.Name,self.Team,self.ID

    #Gives The Valid Moves For The Piece
    def Get_Valid_Moves(self):
        self.ValidMoves = [ ]
        #Get Own Position
        self.Position = "This Piece Is Not On The Board"
        for x in range(0,8):
            for y in range(0,8):
                if Game.Get_Board()[y][x].Get_Details() != Empty().Get_Details():
                    if Game.Get_Board()[y][x].Get_Details() == self.Get_Details():
                        self.Position = (x,y)
                        break
        if self.Position != "This Piece Is Not On The Board":
            #Check Line To The Top Right Of Piece
            if (8 - self.Position[0]) > (8 - self.Position[1]):
                for Up in range(1,8 - self.Position[1]):
                        if Game.Get_Board()[self.Position[1] + Up][self.Position[0] + Up].Get_Details() == Empty().Get_Details():
                            self.ValidMoves.append((self.Position[0] + Up,self.Position[1] + Up))
                        elif Game.Get_Board()[self.Position[1] + Up][self.Position[0] + Up].Get_Details()[1] != self.Team:
                            self.ValidMoves.append((self.Position[0] + Up,self.Position[1] + Up))
                        else:
                            break
            else:
                for Right in range(1,8 - self.Position[0]):
                        if Game.Get_Board()[self.Position[1] + Right][self.Position[0] + Right].Get_Details() == Empty().Get_Details():
                            self.ValidMoves.append((self.Position[0] + Right,self.Position[1] + Right))
                        elif Game.Get_Board()[self.Position[1] + Right][self.Position[0] + Right].Get_Details()[1] != self.Team:
                            self.ValidMoves.append((self.Position[0] + Right,self.Position[1] + Right))
                        else:
                            break
            #Check Line To The Top Left Of Piece
            if (self.Position[0] + 1) > (8 - self.Position[1]):
                for Up in range(1,8 - self.Position[1]):
                    try:
                        if Game.Get_Board()[self.Position[1] + Up][self.Position[0] + Up].Get_Details() == Empty().Get_Details():
                            self.ValidMoves.append((self.Position[0] + Up,self.Position[1] + Up))
                        elif Game.Get_Board()[self.Position[1] + Up][self.Position[0] + Up].Get_Details()[1] != self.Team:
                            self.ValidMoves.append((self.Position[0] + Up,self.Position[1] + Up))
                        else:
                            break
                    except IndexError:
                        pass
            else:
                for Left in range(1,self.Position[0] + 1):
                        if Game.Get_Board()[self.Position[1] + Left][self.Position[0] - Left].Get_Details() == Empty().Get_Details():
                            self.ValidMoves.append((self.Position[0] - Left,self.Position[1] + Left))
                        elif Game.Get_Board()[self.Position[1] + Left][self.Position[0] - Left].Get_Details()[1] != self.Team:
                            self.ValidMoves.append((self.Position[0] - Left,self.Position[1] + Left))
                        else:
                            break
            #Check Line To The Bottom Right Of Piece
            if (8 - self.Position[0]) > (self.Position[1] + 1):
                for Down in range(1,self.Position[1] + 1):
                        if Game.Get_Board()[self.Position[1] - Down][self.Position[0] + Down].Get_Details() == Empty().Get_Details():
                            self.ValidMoves.append((self.Position[0] + Down,self.Position[1] - Down))
                        elif Game.Get_Board()[self.Position[1] - Down][self.Position[0] + Down].Get_Details()[1] != self.Team:
                            self.ValidMoves.append((self.Position[0] + Down,self.Position[1] - Down))
                        else:
                            break
            else:
                for Right in range(1,8 - self.Position[0]):
                        if Game.Get_Board()[self.Position[1] - Right][self.Position[0] + Right].Get_Details() == Empty().Get_Details():
                            self.ValidMoves.append((self.Position[0] + Right,self.Position[1] - Right))
                        elif Game.Get_Board()[self.Position[1] - Right][self.Position[0] + Right].Get_Details()[1] != self.Team:
                            self.ValidMoves.append((self.Position[0] + Right,self.Position[1] - Right))
                        else:
                            break
            #Check Line To The Bottom Left Of Piece
            if (self.Position[0] + 1) > (self.Position[1] + 1):
                for Down in range(1,self.Position[1] + 1):
                        if Game.Get_Board()[self.Position[1] - Down][self.Position[0] - Down].Get_Details() == Empty().Get_Details():
                            self.ValidMoves.append((self.Position[0] - Down,self.Position[1] - Down))
                        elif Game.Get_Board()[self.Position[1] - Down][self.Position[0] - Down].Get_Details()[1] != self.Team:
                            self.ValidMoves.append((self.Position[0] - Down,self.Position[1] - Down))
                        else:
                            break
            else:
                for Right in range(1,self.Position[0] + 1):
                        if Game.Get_Board()[self.Position[1] - Right][self.Position[0] - Right].Get_Details() == Empty().Get_Details():
                            self.ValidMoves.append((self.Position[0] - Right,self.Position[1] - Right))
                        elif Game.Get_Board()[self.Position[1] - Right][self.Position[0] - Right].Get_Details()[1] != self.Team:
                            self.ValidMoves.append((self.Position[0] - Right,self.Position[1] - Right))
                        else:
                            break
            #Check Line Above Piece
            for Up in range(1,8 - self.Position[1]):
                if Game.Get_Board()[self.Position[1] + Up][self.Position[0]].Get_Details() == Empty().Get_Details():
                    self.ValidMoves.append((self.Position[0],self.Position[1] + Up))
                elif Game.Get_Board()[self.Position[1] + Up][self.Position[0]].Get_Details()[1] != self.Team:
                    self.ValidMoves.append((self.Position[0],self.Position[1] + Up))
                    break
                else:
                    break
            #Check Line Below Piece
            for Down in range(1,self.Position[1] + 1):
                if Game.Get_Board()[self.Position[1] - Down][self.Position[0]].Get_Details() == Empty().Get_Details():
                    self.ValidMoves.append((self.Position[0],self.Position[1] - Down))
                elif Game.Get_Board()[self.Position[1] - Down][self.Position[0]].Get_Details()[1] != self.Team:
                    self.ValidMoves.append((self.Position[0],self.Position[1] - Down))
                    break
                else:
                    break
            #Check Line Left Of Piece
            for Left in range(1,self.Position[0] + 1):
                if Game.Get_Board()[self.Position[1]][self.Position[0] - Left].Get_Details() == Empty().Get_Details():
                    self.ValidMoves.append((self.Position[0] - Left,self.Position[1]))
                elif Game.Get_Board()[self.Position[1]][self.Position[0] - Left].Get_Details()[1] != self.Team:
                    self.ValidMoves.append((self.Position[0] - Left,self.Position[1]))
                    break
                else:
                    break
            #Check Line Right Of Piece
            for Right in range(1,8 - self.Position[0]):
                if Game.Get_Board()[self.Position[1]][self.Position[0] + Right].Get_Details() == Empty().Get_Details():
                    self.ValidMoves.append((self.Position[0] + Right,self.Position[1]))
                elif Game.Get_Board()[self.Position[1]][self.Position[0] + Right].Get_Details()[1] != self.Team:
                    self.ValidMoves.append((self.Position[0] + Right,self.Position[1]))
                    break
                else:
                    break
        #Return Moves
        return self.ValidMoves

#Class For Bishop Piece
class Bishop:
    def __init__(self,team,ID):
        self.Name = "Bishop"
        self.Team = team
        self.ID = ID

    def UpdatePos(self,x,y):
        self.Position = (x,y)

    #Gives The Details Of The Piece
    def Get_Details(self):
        return self.Name,self.Team,self.ID

    #Gives The Valid Moves For The Piece
    def Get_Valid_Moves(self):
        self.ValidMoves = [ ]
        #Get Own Position
        self.Position = "This Piece Is Not On The Board"
        for x in range(0,8):
            for y in range(0,8):
                if Game.Get_Board()[y][x].Get_Details() != Empty().Get_Details():
                    if Game.Get_Board()[y][x].Get_Details() == self.Get_Details():
                        self.Position = (x,y)
                        break
        if self.Position != "This Piece Is Not On The Board":
            #Check Line To The Top Right Of Piece
            if (8 - self.Position[0]) > (8 - self.Position[1]):
                for Up in range(1,8 - self.Position[1]):
                        if Game.Get_Board()[self.Position[1] + Up][self.Position[0] + Up].Get_Details() == Empty().Get_Details():
                            self.ValidMoves.append((self.Position[0] + Up,self.Position[1] + Up))
                        elif Game.Get_Board()[self.Position[1] + Up][self.Position[0] + Up].Get_Details()[1] != self.Team:
                            self.ValidMoves.append((self.Position[0] + Up,self.Position[1] + Up))
                        else:
                            break
            else:
                for Right in range(1,8 - self.Position[0]):
                        if Game.Get_Board()[self.Position[1] + Right][self.Position[0] + Right].Get_Details() == Empty().Get_Details():
                            self.ValidMoves.append((self.Position[0] + Right,self.Position[1] + Right))
                        elif Game.Get_Board()[self.Position[1] + Right][self.Position[0] + Right].Get_Details()[1] != self.Team:
                            self.ValidMoves.append((self.Position[0] + Right,self.Position[1] + Right))
                        else:
                            break
            #Check Line To The Top Left Of Piece
            if (self.Position[0] + 1) > (8 - self.Position[1]):
                for Up in range(1,8 - self.Position[1]):
                    try:
                        if Game.Get_Board()[self.Position[1] + Up][self.Position[0] + Up].Get_Details() == Empty().Get_Details():
                            self.ValidMoves.append((self.Position[0] - Up,self.Position[1] + Up))
                        elif Game.Get_Board()[self.Position[1] + Up][self.Position[0] + Up].Get_Details()[1] != self.Team:
                            self.ValidMoves.append((self.Position[0] - Up,self.Position[1] + Up))
                        else:
                            break
                    except IndexError:
                        pass
            else:
                for Left in range(1,self.Position[0] + 1):
                        if Game.Get_Board()[self.Position[1] + Left][self.Position[0] - Left].Get_Details() == Empty().Get_Details():
                            self.ValidMoves.append((self.Position[0] - Left,self.Position[1] + Left))
                        elif Game.Get_Board()[self.Position[1] + Left][self.Position[0] - Left].Get_Details()[1] != self.Team:
                            self.ValidMoves.append((self.Position[0] - Left,self.Position[1] + Left))
                        else:
                            break
            #Check Line To The Bottom Right Of Piece
            if (8 - self.Position[0]) > (self.Position[1] + 1):
                for Down in range(1,self.Position[1] + 1):
                        if Game.Get_Board()[self.Position[1] - Down][self.Position[0] + Down].Get_Details() == Empty().Get_Details():
                            self.ValidMoves.append((self.Position[0] + Down,self.Position[1] - Down))
                        elif Game.Get_Board()[self.Position[1] - Down][self.Position[0] + Down].Get_Details()[1] != self.Team:
                            self.ValidMoves.append((self.Position[0] + Down,self.Position[1] - Down))
                        else:
                            break
            else:
                for Right in range(1,8 - self.Position[0]):
                        if Game.Get_Board()[self.Position[1] - Right][self.Position[0] + Right].Get_Details() == Empty().Get_Details():
                            self.ValidMoves.append((self.Position[0] + Right,self.Position[1] - Right))
                        elif Game.Get_Board()[self.Position[1] - Right][self.Position[0] + Right].Get_Details()[1] != self.Team:
                            self.ValidMoves.append((self.Position[0] + Right,self.Position[1] - Right))
                        else:
                            break
            #Check Line To The Bottom Left Of Piece
            if (self.Position[0] + 1) > (self.Position[1] + 1):
                for Down in range(1,self.Position[1] + 1):
                        if Game.Get_Board()[self.Position[1] - Down][self.Position[0] - Down].Get_Details() == Empty().Get_Details():
                            self.ValidMoves.append((self.Position[0] - Down,self.Position[1] - Down))
                        elif Game.Get_Board()[self.Position[1] - Down][self.Position[0] - Down].Get_Details()[1] != self.Team:
                            self.ValidMoves.append((self.Position[0] - Down,self.Position[1] - Down))
                        else:
                            break
            else:
                for Right in range(1,self.Position[0] + 1):
                        if Game.Get_Board()[self.Position[1] - Right][self.Position[0] - Right].Get_Details() == Empty().Get_Details():
                            self.ValidMoves.append((self.Position[0] - Right,self.Position[1] - Right))
                        elif Game.Get_Board()[self.Position[1] - Right][self.Position[0] - Right].Get_Details()[1] != self.Team:
                            self.ValidMoves.append((self.Position[0] - Right,self.Position[1] - Right))
                        else:
                            break
        #Return Moves
        return self.ValidMoves
    
#Class For Rook Piece
class Rook:
    def __init__(self,team,ID,firstMove):
        self.Name = "Rook"
        self.Team = team
        self.ID = ID
        self.FirstMove = firstMove

    def UpdatePos(self,x,y):
        self.Position = (x,y)

    #First Move Value Change
    def Moved(self):
        self.FirstMove = False

    #Gives The Details Of The Piece
    def Get_Details(self):
        return self.Name,self.Team,self.ID

    #Gives The Valid Moves For The Piece
    def Get_Valid_Moves(self):
        self.ValidMoves = [ ]
        #Get Own Position
        self.Position = "This Piece Is Not On The Board"
        for x in range(0,8):
            for y in range(0,8):
                if Game.Get_Board()[y][x].Get_Details() != Empty().Get_Details():
                    if Game.Get_Board()[y][x].Get_Details() == self.Get_Details():
                        self.Position = (x,y)
                        break
        if self.Position != "This Piece Is Not On The Board":
            #Check Line Above Piece
            for Up in range(1,8 - self.Position[1]):
                if Game.Get_Board()[self.Position[1] + Up][self.Position[0]].Get_Details() == Empty().Get_Details():
                    self.ValidMoves.append((self.Position[0],self.Position[1] + Up))
                elif Game.Get_Board()[self.Position[1] + Up][self.Position[0]].Get_Details()[1] != self.Team:
                    self.ValidMoves.append((self.Position[0],self.Position[1] + Up))
                    break
                else:
                    break
            #Check Line Below Piece
            for Down in range(1,self.Position[1] + 1):
                if Game.Get_Board()[self.Position[1] - Down][self.Position[0]].Get_Details() == Empty().Get_Details():
                    self.ValidMoves.append((self.Position[0],self.Position[1] - Down))
                elif Game.Get_Board()[self.Position[1] - Down][self.Position[0]].Get_Details()[1] != self.Team:
                    self.ValidMoves.append((self.Position[0],self.Position[1] - Down))
                    break
                else:
                    break
            #Check Line Left Of Piece
            for Left in range(1,self.Position[0] + 1):
                if Game.Get_Board()[self.Position[1]][self.Position[0] - Left].Get_Details() == Empty().Get_Details():
                    self.ValidMoves.append((self.Position[0] - Left,self.Position[1]))
                elif Game.Get_Board()[self.Position[1]][self.Position[0] - Left].Get_Details()[1] != self.Team:
                    self.ValidMoves.append((self.Position[0] - Left,self.Position[1]))
                    break
                else:
                    break
            #Check Line Right Of Piece
            for Right in range(1,8 - self.Position[0]):
                if Game.Get_Board()[self.Position[1]][self.Position[0] + Right].Get_Details() == Empty().Get_Details():
                    self.ValidMoves.append((self.Position[0] + Right,self.Position[1]))
                elif Game.Get_Board()[self.Position[1]][self.Position[0] + Right].Get_Details()[1] != self.Team:
                    self.ValidMoves.append((self.Position[0] + Right,self.Position[1]))
                    break
                else:
                    break
        #Return Moves
        return self.ValidMoves

#Class For Pawn Piece
class Pawn:
    def __init__(self,team,ID,firstMove):
        self.Name = "Pawn"
        self.Team = team
        self.ID = ID
        self.FirstMove = firstMove

    def UpdatePos(self,x,y):
        self.Position = (x,y)

    #First Move Value Change
    def Moved(self):
        self.FirstMove = False

    #Gives The Details Of The Piece
    def Get_Details(self):
        return self.Name,self.Team,self.ID

    #Gives The Valid Moves For The Piece
    def Get_Valid_Moves(self):
        self.ValidMoves = [ ]
        #Get Own Position
        self.Position = "This Piece Is Not On The Board"
        for x in range(0,8):
            for y in range(0,8):
                if Game.Get_Board()[y][x].Get_Details() != Empty().Get_Details():
                    if Game.Get_Board()[y][x].Get_Details() == self.Get_Details():
                        self.Position = (x,y)
                        break
        if self.Position != "This Piece Is Not On The Board":
            #Check Spaces Ahead Of Piece
            if self.Team == "White":
                #Basic Move
                if -1 < (self.Position[1] + 1) < 8:
                    if Game.Get_Board()[self.Position[1] + 1][self.Position[0]].Get_Details() == Empty().Get_Details():
                        self.ValidMoves.append((self.Position[0],self.Position[1] + 1))
                #Double First Move
                if self.FirstMove == True:
                    if -1 < (self.Position[1] + 2) < 8:
                        if Game.Get_Board()[self.Position[1] + 2][self.Position[0]].Get_Details() == Empty().Get_Details():
                            self.ValidMoves.append((self.Position[0],self.Position[1] + 2))
                #Attacking Moves
                if (-1 < (self.Position[1] + 1) < 8) and (-1 < (self.Position[0] + 1) < 8):
                    if Game.Get_Board()[self.Position[1] + 1][self.Position[0] + 1].Get_Details()[1] == "Black":
                        self.ValidMoves.append((self.Position[0] + 1,self.Position[1] + 1))
                if (-1 < (self.Position[1] + 1) < 8) and (-1 < (self.Position[0] - 1) < 8):
                    if Game.Get_Board()[self.Position[1] + 1][self.Position[0] - 1].Get_Details()[1] == "Black":
                        self.ValidMoves.append((self.Position[0] - 1,self.Position[1] + 1))
            elif self.Team == "Black":
                #Basic Move
                if -1 < (self.Position[1] - 1) < 8:
                    if Game.Get_Board()[self.Position[1] - 1][self.Position[0]].Get_Details() == Empty().Get_Details():
                        self.ValidMoves.append((self.Position[0],self.Position[1] - 1))
                #Double First Move
                if self.FirstMove == True:
                    if -1 < (self.Position[1] - 2) < 8:
                        if Game.Get_Board()[self.Position[1] - 2][self.Position[0]].Get_Details() == Empty().Get_Details():
                            self.ValidMoves.append((self.Position[0],self.Position[1] - 2))
                #Attacking Moves
                if (-1 < (self.Position[1] - 1) < 8) and (-1 < (self.Position[0] + 1) < 8):
                    if Game.Get_Board()[self.Position[1] - 1][self.Position[0] + 1].Get_Details()[1] == "White":
                        self.ValidMoves.append((self.Position[0] + 1,self.Position[1] - 1))
                if (-1 < (self.Position[1] - 1) < 8) and (-1 < (self.Position[0] - 1) < 8):
                    if Game.Get_Board()[self.Position[1] - 1][self.Position[0] - 1].Get_Details()[1] == "White":
                        self.ValidMoves.append((self.Position[0] - 1,self.Position[1] - 1))
        #Return Moves
        return self.ValidMoves

#Class For King Piece
class King:
    def __init__(self,team,firstMove):
        self.Name = "King"
        self.Team = team
        self.FirstMove = firstMove

    def UpdatePos(self,x,y):
        self.Position = (x,y)

    #First Move Value Change
    def Moved(self):
        self.FirstMove = False

    #Gives The Details Of The Piece
    def Get_Details(self):
        return self.Name,self.Team,self.FirstMove

    #Find Out If This Position Under Attack In This Board State 
    def Under_Attack(self,x,y):
        UnderAttack = False
        #Rook Detector (With Bits Of The Queen Detection)
        #Check Above
        for Up in range(1,8 - y):
            if Game.Get_Board()[y + Up][x].Get_Details() == Empty().Get_Details():
                pass
            elif (Game.Get_Board()[y + Up][x].Get_Details()[0] == ("Rook" or "Queen")) and (Game.Get_Board()[y + Up][x].Get_Details()[1] != self.Team):
                UnderAttack = True
            else:
                break
        #Check Below
        for Down in range(1,y):
            if Game.Get_Board()[y - Down][x].Get_Details() == Empty().Get_Details():
                pass
            elif (Game.Get_Board()[y - Down][x].Get_Details()[0] == ("Rook" or "Queen")) and (Game.Get_Board()[y - Down][x].Get_Details()[1] != self.Team):
                UnderAttack = True
            else:
                break
        #Check Right
        for Right in range(1,8 - x):
            if Game.Get_Board()[y][x + Right].Get_Details() == Empty().Get_Details():
                pass
            elif (Game.Get_Board()[y][x + Right].Get_Details()[0] == ("Rook" or "Queen")) and (Game.Get_Board()[y][x + Right].Get_Details()[1] != self.Team):
                UnderAttack = True
            else:
                break
        #Check Left
        for Left in range(1,x):
            if Game.Get_Board()[y][x - Left].Get_Details() == Empty().Get_Details():
                pass
            elif (Game.Get_Board()[y][x - Left].Get_Details()[0] == ("Rook" or "Queen")) and (Game.Get_Board()[y][x - Left].Get_Details()[1] != self.Team):
                UnderAttack = True
            else:
                break
        #Bishop Detector (With Bits Of The Queen Detection)
        #Check Top Right
        if (8 - x) > (8 - y):
            for Up in range(1,8 - y):
                    if Game.Get_Board()[y + Up][x + Up].Get_Details() == Empty().Get_Details():
                        pass
                    elif (Game.Get_Board()[y + Up][x + Up].Get_Details()[0] == ("Bishop" or "Queen")) and (Game.Get_Board()[y + Up][x + Up].Get_Details()[1] != self.Team):
                        UnderAttack = True
                    else:
                        break
        else:
            for Right in range(1,8 - x):
                    if Game.Get_Board()[y + Right][x + Right].Get_Details() == Empty().Get_Details():
                        pass
                    elif (Game.Get_Board()[y + Right][x + Right].Get_Details()[0] == ("Bishop" or "Queen")) and (Game.Get_Board()[y + Right][x + Right].Get_Details()[1] != self.Team):
                        UnderAttack = True
                    else:
                        break
        #Check Top Left
        if x > (8 - y):
            for Up in range(1,8 - y):
                    if Game.Get_Board()[y + Up][x - Up].Get_Details() == Empty().Get_Details():
                        pass
                    elif (Game.Get_Board()[y + Up][x - Up].Get_Details()[0] == ("Bishop" or "Queen")) and (Game.Get_Board()[y + Up][x - Up].Get_Details()[1] != self.Team):
                        UnderAttack = True
                    else:
                        break
        else:
            for Left in range(1,x):
                    if Game.Get_Board()[y + Left][x - Left].Get_Details() == Empty().Get_Details():
                        pass
                    elif (Game.Get_Board()[y + Left][x - Left].Get_Details()[0] == ("Bishop" or "Queen")) and (Game.Get_Board()[y + Left][x - Left].Get_Details()[1] != self.Team):
                        UnderAttack = True
                    else:
                        break
        #Bottom Right
        if (8 - x) > y:
            for Down in range(1,y):
                    if Game.Get_Board()[y - Down][x + Down].Get_Details() == Empty().Get_Details():
                        pass
                    elif (Game.Get_Board()[y - Down][x + Down].Get_Details()[0] == ("Bishop" or "Queen")) and (Game.Get_Board()[y - Down][x + Down].Get_Details()[1] != self.Team):
                        UnderAttack = True
                    else:
                        break
        else:
            for Right in range(1,8 - x):
                    if Game.Get_Board()[y - Right][x + Right].Get_Details() == Empty().Get_Details():
                        pass
                    elif (Game.Get_Board()[y - Right][x + Right].Get_Details()[0] == ("Bishop" or "Queen")) and (Game.Get_Board()[y - Right][x + Right].Get_Details()[1] != self.Team):
                        UnderAttack = True
                    else:
                        break
        #Bottom Left
        if x > y:
            for Down in range(1,y):
                    if Game.Get_Board()[y - Down][x - Down].Get_Details() == Empty().Get_Details():
                        pass
                    elif (Game.Get_Board()[y - Down][x - Down].Get_Details()[0] == ("Bishop" or "Queen")) and (Game.Get_Board()[y - Down][x - Down].Get_Details()[1] != self.Team):
                        UnderAttack = True
                    else:
                        break
        else:
            for Left in range(1,x):
                    if Game.Get_Board()[y - Left][x - Left].Get_Details() == Empty().Get_Details():
                        pass
                    elif (Game.Get_Board()[y - Left][x - Left].Get_Details()[0] == ("Bishop" or "Queen")) and (Game.Get_Board()[y - Left][x - Left].Get_Details()[1] != self.Team):
                        UnderAttack = True
                    else:
                        break
        #Knight Detector
        #Check Top Right Quarter
        if (-1 < (y + 1) < 8) and (-1 < (x + 2) < 8):
            if (Game.Get_Board()[y + 1][x + 2].Get_Details()[0] == "Knight") and (Game.Get_Board()[y + 1][x + 2].Get_Details()[1] != self.Team):
                UnderAttack = True
        if (-1 < (y + 2) < 8) and (-1 < (x + 1) < 8):
            if (Game.Get_Board()[y + 2][x + 1].Get_Details()[0] == "Knight") and (Game.Get_Board()[y + 2][x + 1].Get_Details()[1] != self.Team):
                UnderAttack = True
        #Check Top Left Quarter
        if (-1 < (y + 1) < 8) and (-1 < (x - 2) < 8):
            if (Game.Get_Board()[y + 1][x - 2].Get_Details()[0] == "Knight") and (Game.Get_Board()[y + 1][x - 2].Get_Details()[1] != self.Team):
                UnderAttack = True
        if (-1 < (y + 2) < 8) and (-1 < (x - 1) < 8):
            if (Game.Get_Board()[y + 2][x - 1].Get_Details()[0] == "Knight") and (Game.Get_Board()[y + 2][x - 1].Get_Details()[1] != self.Team):
                UnderAttack = True
        #Check Bottom Left Quarter
        if (-1 < (y - 1) < 8) and (-1 < (x - 2) < 8):
            if (Game.Get_Board()[y - 1][x - 2].Get_Details()[0] == "Knight") and (Game.Get_Board()[y - 1][x - 2].Get_Details()[1] != self.Team):
                UnderAttack = True
        if (-1 < (y - 2) < 8) and (-1 < (x - 1) < 8):
            if (Game.Get_Board()[y - 2][x - 1].Get_Details()[0] == "Knight") and (Game.Get_Board()[y - 2][x - 1].Get_Details()[1] != self.Team):
                UnderAttack = True
        #Check Bottom Right Quarter
        if (-1 < (y - 1) < 8) and (-1 < (x + 2) < 8):
            if (Game.Get_Board()[y - 1][x + 2].Get_Details()[0] == "Knight") and (Game.Get_Board()[y - 1][x + 2].Get_Details()[1] != self.Team):
                UnderAttack = True
        if (-1 < (y - 2) < 8) and (-1 < (x + 1) < 8):
            if (Game.Get_Board()[y - 2][x + 1].Get_Details()[0] == "Knight") and (Game.Get_Board()[y - 2][x + 1].Get_Details()[1] != self.Team):
                UnderAttack = True
        #Pawn Detector
        if self.Team == "White":
            if (-1 < (y + 1) < 8) and (-1 < (x + 1) < 8):
                if (Game.Get_Board()[y + 1][x + 1].Get_Details()[0] == "Pawn") and (Game.Get_Board()[y + 1][x + 1].Get_Details()[1] != self.Team):
                    UnderAttack = True
            if (-1 < (y + 1) < 8) and (-1 < (x - 1) < 8):
                if (Game.Get_Board()[y + 1][x - 1].Get_Details()[0] == "Pawn") and (Game.Get_Board()[y + 1][x - 1].Get_Details()[1] != self.Team):
                    UnderAttack = True
        if self.Team == "Black":
            if (-1 < (y - 1) < 8) and (-1 < (x + 1) < 8):
                if (Game.Get_Board()[y - 1][x + 1].Get_Details()[0] == "Pawn") and (Game.Get_Board()[y - 1][x + 1].Get_Details()[1] != self.Team):
                    UnderAttack = True
            if (-1 < (y - 1) < 8) and (-1 < (x - 1) < 8):
                if (Game.Get_Board()[y - 1][x - 1].Get_Details()[0] == "Pawn") and (Game.Get_Board()[y - 1][x - 1].Get_Details()[1] != self.Team):
                    UnderAttack = True
        #Return UnderAttack Value
        return UnderAttack
        
    #Gives The Valid Moves For The Piece
    def Get_Valid_Moves(self):
        self.ValidMoves = [ ]
        #Get Own Position
        self.Position = "This Piece Is Not On The Board"
        for x in range(0,8):
            for y in range(0,8):
                if Game.Get_Board()[y][x].Get_Details() != Empty().Get_Details():
                    if Game.Get_Board()[y][x].Get_Details() == self.Get_Details():
                        self.Position = (x,y)
                        break
        #Get Moves
        if self.Position != "This Piece Is Not On The Board":
            #Up Move
            if -1 < (self.Position[1] + 1) < 8:
                if Game.Get_Board()[self.Position[1] + 1][self.Position[0]].Get_Details()[1] != self.Team:
                    self.ValidMoves.append((self.Position[0],self.Position[1] + 1))
            #Down Move
            if -1 < (self.Position[1] - 1) < 8:
                if Game.Get_Board()[self.Position[1] - 1][self.Position[0]].Get_Details()[1] != self.Team:
                    self.ValidMoves.append((self.Position[0],self.Position[1] - 1))
            #Right Move
            if -1 < (self.Position[0] + 1) < 8:
                if Game.Get_Board()[self.Position[1]][self.Position[0] + 1].Get_Details()[1] != self.Team:
                    self.ValidMoves.append((self.Position[0] + 1,self.Position[1]))
            #Left Move
            if -1 < (self.Position[0] - 1) < 8:
                if Game.Get_Board()[self.Position[1]][self.Position[0] - 1].Get_Details()[1] != self.Team:
                    self.ValidMoves.append((self.Position[0] - 1,self.Position[1]))
            #Up Right Move
            if (-1 < (self.Position[1] + 1) < 8) and (-1 < (self.Position[0] + 1) < 8):
                if Game.Get_Board()[self.Position[1] + 1][self.Position[0] + 1].Get_Details()[1] != self.Team:
                    self.ValidMoves.append((self.Position[0] + 1,self.Position[1] + 1))
            #Up Left Move
            if (-1 < (self.Position[1] + 1) < 8) and (-1 < (self.Position[0] - 1) < 8):
                if Game.Get_Board()[self.Position[1] + 1][self.Position[0] - 1].Get_Details()[1] != self.Team:
                    self.ValidMoves.append((self.Position[0] - 1,self.Position[1] + 1))
            #Down Right Move
            if (-1 < (self.Position[1] - 1) < 8) and (-1 < (self.Position[0] + 1) < 8):
                if Game.Get_Board()[self.Position[1] - 1][self.Position[0] + 1].Get_Details()[1] != self.Team:
                    self.ValidMoves.append((self.Position[0] + 1,self.Position[1] - 1))
            #Down Left Move
            if (-1 < (self.Position[1] - 1) < 8) and (-1 < (self.Position[0] - 1) < 8):
                if Game.Get_Board()[self.Position[1] - 1][self.Position[0] - 1].Get_Details()[1] != self.Team:
                    self.ValidMoves.append((self.Position[0] - 1,self.Position[1] - 1))
            #Remove Invalid (Self Checkmating) Moves
            Index = 0
            for (x,y) in self.ValidMoves:
                if self.Under_Attack(x,y) == True:
                    del self.ValidMoves[Index]
                Index = Index + 1
            #Castling Moves
            if self.FirstMove == True:
                InLine = False
                for Right in range(1,8 - self.Position[0]):
                    if Game.Get_Board()[self.Position[1]][self.Position[0] + Right].Get_Details() == Empty().Get_Details():
                        pass
                    elif (Game.Get_Board()[self.Position[1]][self.Position[0] + Right].Get_Details()[1] == self.Team) and (Game.Get_Board()[self.Position[1]][self.Position[0] + Right].Get_Details()[0] == "Rook"):
                        InLine = True
                    else:
                        break
                for Left in range(1,self.Position[0]):
                    if Game.Get_Board()[self.Position[1]][self.Position[0] - Left].Get_Details() == Empty().Get_Details():
                        pass
                    elif (Game.Get_Board()[self.Position[1]][self.Position[0] - Left].Get_Details()[1] == self.Team) and (Game.Get_Board()[self.Position[1]][self.Position[0] - Left].Get_Details()[0] == "Rook"):
                        InLine = True
                    else:
                        break
                if InLine == True:
                    try:
                        if Game.Get_Board()[self.Position[1]][0].Get_Details()[2] == True:
                            self.ValidMoves.append("CL")
                        if Game.Get_Board()[self.Position[1]][7].Get_Details()[2] == True:
                            self.ValidMoves.append("CR")
                    except IndexError:
                        pass
        #Return Moves
        return self.ValidMoves

#Class For Empty Space
class Empty:
    def __init__(self):
        self.Name = "Empty"
        self.Team = "None"

    def UpdatePos(self,x,y):
        pass

    #Gives The Details Of The Piece
    def Get_Details(self):
        return self.Name,self.Team

    #Gives The Valid Moves For The Piece
    def Get_Valid_Moves(self):
        self.ValidMoves = [ ]
        return self.ValidMoves

#Class For The Game Board
class Board:
    def __init__(self):
        #Initialise a new chess board.

        self.board = [[Empty()]*8 for _ in range(8)]

        #White Piece Initialisation
        #self.board[y][x] = piece
        self.board[0][7] = Rook("White",1,True)
        self.board[0][6] = Knight("White",1)
        self.board[0][5] = Bishop("White",1)
        self.board[0][4] = King("White",True)
        self.board[0][3] = Queen("White",0)
        self.board[0][2] = Bishop("White",0)
        self.board[0][1] = Knight("White",0)
        self.board[0][0] = Rook("White",0,True)

        self.board[1][7] = Pawn("White",8,True)
        self.board[1][6] = Pawn("White",7,True)
        self.board[1][5] = Pawn("White",6,True)
        self.board[1][4] = Pawn("White",5,True)
        self.board[1][3] = Pawn("White",4,True)
        self.board[1][2] = Pawn("White",3,True)
        self.board[1][1] = Pawn("White",2,True)
        self.board[1][0] = Pawn("White",1,True)

        #White Piece Initialisation
        #self.board[y][x] = piece
        self.board[7][7] = Rook("Black",1,True)
        self.board[7][6] = Knight("Black",1)
        self.board[7][5] = Bishop("Black",1)
        self.board[7][3] = King("Black",True)
        self.board[7][4] = Queen("Black",0)
        self.board[7][2] = Bishop("Black",0)
        self.board[7][1] = Knight("Black",0)
        self.board[7][0] = Rook("Black",0,True)

        self.board[6][7] = Pawn("Black",8,True)
        self.board[6][6] = Pawn("Black",7,True)
        self.board[6][5] = Pawn("Black",6,True)
        self.board[6][4] = Pawn("Black",5,True)
        self.board[6][3] = Pawn("Black",4,True)
        self.board[6][2] = Pawn("Black",3,True)
        self.board[6][1] = Pawn("Black",2,True)
        self.board[6][0] = Pawn("Black",1,True)

    #Returns The Board State
    def Get_Board(self):
        return self.board

    #Display Board
    def Display(self):
        Output = [["."]*8 for _ in range(8)]
        for y in range(0,8):
            for x in range(0,8):
                Output[y][x] = (self.board[y][x].Get_Details()[1] , self.board[y][x].Get_Details()[0])
        return Output

    #Move Pieces Around
    def Move(self,oldpos,newpos):
        try:
            newpos = (int(newpos[0]),int(newpos[1]))
            oldpos = (int(oldpos[0]),int(oldpos[1]))
        except ValueError:
            pass #Exception for castling move 
        if newpos == ("CR" or "CL"):
            #Right Castle
            if newpos == "CR":
                #Move Castle
                self.board[int(oldpos[1])][5] = self.board[int(oldpos[1])][7]
                self.board[int(oldpos[1])][7] = Empty()
                #Move King
                self.board[int(oldpos[1])][6] = self.board[int(oldpos[1])][int(oldpos[0])]
                self.board[int(oldpos[1])][int(oldpos[0])] = Empty()
            #Left Castle
            if newpos == "CL":
                #Move Castle
                self.board[int(oldpos[1])][2] = self.board[int(oldpos[1])][0]
                self.board[int(oldpos[1])][0] = Empty()
                #Move King
                self.board[int(oldpos[1])][1] = self.board[int(oldpos[1])][int(oldpos[0])]
                self.board[int(oldpos[1])][int(oldpos[0])] = Empty()
        #Regular Move
        elif newpos in self.board[oldpos[1]][oldpos[0]].Get_Valid_Moves():
            self.board[newpos[1]][newpos[0]] = self.board[oldpos[1]][oldpos[0]]
            self.board[oldpos[1]][oldpos[0]] = Empty()
            

#Create Board Under Name "Game"
Game = Board()
#Gets The Moves Of Piece At Position (x,y)
#Game.board[y][x].Get_Valid_Moves()
#Gets The Details Of Piece At Position (x,y)
#Game.board[y][x].Get_Details()
#Moves The Pieces Around
#Game.Move("oldpos","newpos")
#Display Board
#for y in range(7,-1,-1):
    #print(Game.Display()[y])
