
/**
 This class represents a space on the game board.
 @author Max Klot
 */
public class Space
{
    public boolean containsShip;
    public boolean containsMiss;
    public boolean containsHit;
    public String val = "   ";

    /**
     Constructor for space
     @param val string value for tostring
     */
    public Space(String val)
    {
        this.val = val;
    }


    public Space(boolean val)
    {
        this.containsShip = val;
    }

    /**
     Default Constructor for space
     */
    public Space()
    {

    }

    /**
     sets containsHit to true and toString to red
     */
    public void hit()
    {
        val = ConsoleColors.RED_BACKGROUND + "   " + ConsoleColors.RESET;
        containsHit = true;
    }

    /**
     sets containsMiss to true and toString to white
     */
    public void miss()
    {
        val = ConsoleColors.WHITE_BACKGROUND + "   " + ConsoleColors.RESET;
        containsMiss = true;
    }

    public String toString()
    {
        return val;
    }
}
