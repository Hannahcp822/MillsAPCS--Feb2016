
/**
 * Write a description of class Vertebrate here.
 * 
 * @author Hannah Pang
 * @version February 10, 2016
 */

public class Vertebrate
{
    private String commonName;
    private String genus;
    private String species;
    private boolean isEndangered;

    public Vertebrate(String name, String g, String s, boolean endangered)
    {
        commonName = name;
        genus = g.substring(0,1).toUpperCase() + g.substring(1,g.length());
        species = s;
        isEndangered = endangered;
    }

    public void printScientificName()
    {
        System.out.println("Scientific name: " + genus + " " + species);
    }
    
    public void setEndangeredStatus(boolean newStatus) 
    {
        isEndangered = newStatus;
    }
}