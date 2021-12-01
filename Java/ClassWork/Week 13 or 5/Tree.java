
public class Tree
{
    public Square trunk;
    public Triangle leaves;
    public boolean drawn;

    /**
     * Constructor for objects of class Picture
     */
    public Tree()
    {
        trunk = new Square();
        leaves = new Triangle();  
        drawn = false;
        setup();
    }

    public void setup()
    {
        if (!drawn)
        {
            drawTrunk();
            
            drawLeaves();
            
            drawn = true;
        }
    }
    
    public void drawTrunk()
    {
        trunk.changeColor("black");
        trunk.moveHorizontal(-110);
        trunk.moveVertical(15);
        trunk.changeSize(20);
        trunk.makeVisible();
    }
    
    public void drawLeaves()
    {
        leaves.changeColor("green");
        leaves.moveHorizontal(0);
        leaves.moveVertical(-80);
        leaves.changeSize(80,60);
        leaves.makeVisible();
    }
}
