public class Table
{
    private T[] T;

    private String ID;

    public T[] getT ()
    {
        return T;
    }

    public void setT (T[] T)
    {
        this.T = T;
    }

    public String getID ()
    {
        return ID;
    }

    public void setID (String ID)
    {
        this.ID = ID;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [T = "+T+", ID = "+ID+"]";
    }
}
