public class Project
{
    private String xmlns;

    private Build build;

    private String modelVersion;

    private String groupId;

    private String name;

    private String packaging;

    private String artifactId;

    private String version;

    private String url;

    private Properties properties;

    public String getXmlns ()
    {
        return xmlns;
    }

    public void setXmlns (String xmlns)
    {
        this.xmlns = xmlns;
    }

    public Build getBuild ()
    {
        return build;
    }

    public void setBuild (Build build)
    {
        this.build = build;
    }

    public String getModelVersion ()
    {
        return modelVersion;
    }

    public void setModelVersion (String modelVersion)
    {
        this.modelVersion = modelVersion;
    }

    public String getGroupId ()
    {
        return groupId;
    }

    public void setGroupId (String groupId)
    {
        this.groupId = groupId;
    }

    public String getName ()
    {
        return name;
    }

    public void setName (String name)
    {
        this.name = name;
    }

    public String getPackaging ()
    {
        return packaging;
    }

    public void setPackaging (String packaging)
    {
        this.packaging = packaging;
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

    public String getUrl ()
    {
        return url;
    }

    public void setUrl (String url)
    {
        this.url = url;
    }

    public Properties getProperties ()
    {
        return properties;
    }

    public void setProperties (Properties properties)
    {
        this.properties = properties;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [xmlns = "+xmlns+", build = "+build+", modelVersion = "+modelVersion+", groupId = "+groupId+", name = "+name+", packaging = "+packaging+", artifactId = "+artifactId+", version = "+version+", url = "+url+", properties = "+properties+"]";
    }
}
