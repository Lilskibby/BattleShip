public class Space
{
    public boolean containsShip;
    public boolean containsMiss;
    public boolean containsHit;
    public String val = "   ";


    public Space(String val)
    {
        this.val = val;
    }

    public Space(boolean val)
    {
        this.containsShip = val;
    }

    public Space()
    {

    }

    public void hit()
    {
        val = ConsoleColors.RED_BACKGROUND + "   " + ConsoleColors.RESET;
        containsHit = true;
    }

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
