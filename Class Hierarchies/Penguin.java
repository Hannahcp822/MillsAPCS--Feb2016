
/**
 * Write a description of class Penguin here.
 * 
 * @author Hannah Pang
 * @version February 10, 2016
 */
public class Penguin extends Bird
{
    private boolean canFly;
    private boolean canSwim;
    private int minUnderwater;

    public Penguin(String name, String g, String s, boolean endangered, String f, String h, String c, int min)
    {
        super(name, g, s, endangered, c, f, h);
        canFly = false;
        canSwim = true;
        minUnderwater = min;
    }

    public int getMinUnderwater()
    {
        return minUnderwater;
    }
    
    public void printMinUnderwater()
    {
        System.out.println("I can stay underwater for " + minUnderwater + " minutes!");
    }
}
