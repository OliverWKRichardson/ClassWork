
/**
 * Class BlueTree
 *
 * @author Oliver Richardson
 * @version 0.0
 */
public class BlueTree extends Tree
{
    //Instantiate Variables

    public BlueTree()
    {
        //Init
    }

    public void drawLeaves()
    {
        leaves.changeColor("blue");
        leaves.moveHorizontal(0);
        leaves.moveVertical(-80);
        leaves.changeSize(80,60);
        leaves.makeVisible();
    }
}