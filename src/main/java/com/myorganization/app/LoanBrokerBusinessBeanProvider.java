                 
public class LoanBrokerBusinessBeanProvider
{
    private Table table;

    public Table getTable ()
    {
        return table;
    }

    public void setTable (Table table)
    {
        this.table = table;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [table = "+table+"]";
    }
}
