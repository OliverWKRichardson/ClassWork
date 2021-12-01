import math

##Constants
G = 0.0000000000667408

##Modulus Function
def Mod(X):
    if X < 0:
        X = -X
    return X

##Mass Class
class PointMass:
    ##Init
    def __init__(self,X,Y,Z,M):
        self._X = int(X)
        self._Y = int(Y)
        self._Z = int(Z)
        self._Mass = int(M)

    ##Getters        
    def GetX(self):
        return self._X
    def GetY(self):
        return self._Y
    def GetZ(self):
        return self._Z
    def GetMass(self):
        return self._Mass

    ##Calculations
    def GetDistanceTo(self,X,Y,Z):
        LengthX = Mod(self._X - X)
        LengthY = Mod(self._Y - Y)
        LengthZ = Mod(self._Z - Z)
        Distance = math.sqrt(LengthX**2 + LengthY**2 + LengthZ**2)
        return Distance,LengthX,LengthY,LengthZ
    def ForceVectorFromObject(self,Object):
        R,X,Y,Z = self.GetDistanceTo(Object.GetX(),Object.GetY(),Object.GetZ())
        M1 = self.GetMass()
        M2 = Object.GetMass()
        Force = G*((M1*M2)/(R**2))
        return Force

##Menu
while True:
    ##Create Objects
    ObjectCount = int(input("How Many Objects: "))
    Objects = []
    for i in range(1,ObjectCount + 1):
        print("Object",i)
        Objects.append(PointMass(input("X:"),input("Y:"),input("Z:"),input("Mass:")))
        print("")
    ##Find Forces
    for i in range(0,ObjectCount):
        print("")
        print("Object"+str(i+1),":"
              ,"\nPosition:",Objects[i].GetX(),Objects[i].GetY(),Objects[i].GetZ()
              ,"\nMass:",Objects[i].GetMass())
        ForceBool = False
        for j in range(0,ObjectCount):
            if i != j:
                ForceBool = True
                Force = Objects[i].ForceVectorFromObject(Objects[j])
                print("Force:",str(Force)+" Towards Object"+str(j+1)+".")
        if ForceBool == False:
            print("No Forces Acting On This Object")
