
/**
 * Write a description of class Bird here.
 * 
 * @author Hannah Pang
 * @version February 10, 2016
 */
public class Bird extends Vertebrate
{
    private String favoriteFood;
    private String habitat;
    private String color;
    
    public Bird (String name, String g, String s, boolean endangered, String f, String h, String c)
    {
        super(name, g, s, endangered);
        favoriteFood = f;
        habitat = h;
        color = c;
    }

    public String getHabitat()
    {
        return habitat;
    }
    
    public void setFavoriteFood(String newFood)
    {
        favoriteFood = newFood;
    }
}
