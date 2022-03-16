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

    public String toString()
    {
        return val;
    }
}
