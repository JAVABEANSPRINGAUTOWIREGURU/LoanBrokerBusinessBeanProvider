public class Properties
{
    private String java-version;

    private String project.build.sourceEncoding;

    public String getJava-version ()
    {
        return java-version;
    }

    public void setJava-version (String java-version)
    {
        this.java-version = java-version;
    }

    public String getProject.build.sourceEncoding ()
    {
        return project.build.sourceEncoding;
    }

    public void setProject.build.sourceEncoding (String project.build.sourceEncoding)
    {
        this.project.build.sourceEncoding = project.build.sourceEncoding;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [java-version = "+java-version+", project.build.sourceEncoding = "+project.build.sourceEncoding+"]";
    }
}
			
		
