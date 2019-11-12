public class Plugins
{
    private Plugin plugin;

    public Plugin getPlugin ()
    {
        return plugin;
    }

    public void setPlugin (Plugin plugin)
    {
        this.plugin = plugin;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [plugin = "+plugin+"]";
    }
}
			
