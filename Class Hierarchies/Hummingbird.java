
/**
 * Write a description of class Hummingbird here.
 * 
 * @author Hannah Pang
 * @version February 10, 2016
 */
public class Hummingbird extends Bird
{
    private String beakType;
    private int wingFlapsPerSecond;

    public Hummingbird(String name, String g, String s, boolean endangered, String f, String h, String c, String b, int w)
    {
        super(name, g, s, endangered, f, h, c);
        beakType = b;
        wingFlapsPerSecond = w;
    }

    public void setWingSpeed(int newSpeed)
    {
        wingFlapsPerSecond = newSpeed;
    }
    
    public String getBeakType()
    {
        return beakType;
    }
}
