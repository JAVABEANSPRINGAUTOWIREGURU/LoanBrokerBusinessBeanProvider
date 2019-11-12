                
public class Plugin
{
    private Executions executions;

    private Configuration configuration;

    private String groupId;

    private String artifactId;

    private String version;

    public Executions getExecutions ()
    {
        return executions;
    }

    public void setExecutions (Executions executions)
    {
        this.executions = executions;
    }

    public Configuration getConfiguration ()
    {
        return configuration;
    }

    public void setConfiguration (Configuration configuration)
    {
        this.configuration = configuration;
    }

    public String getGroupId ()
    {
        return groupId;
    }

    public void setGroupId (String groupId)
    {
        this.groupId = groupId;
    }

    public String getArtifactId ()
    {
        return artifactId;
    }

    public void setArtifactId (String artifactId)
    {
        this.artifactId = artifactId;
    }

    public String getVersion ()
    {
        return version;
    }

    public void setVersion (String version)
    {
        this.version = version;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [executions = "+executions+", configuration = "+configuration+", groupId = "+groupId+", artifactId = "+artifactId+", version = "+version+"]";
    }
}
