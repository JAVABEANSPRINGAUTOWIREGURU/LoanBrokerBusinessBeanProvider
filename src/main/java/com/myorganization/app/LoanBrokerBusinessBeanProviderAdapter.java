public class LoanBrokerBusinessBeanProviderAdapter
{
    private Project project;

    public Project getProject ()
    {
        return project;
    }

    public void setProject (Project project)
    {
        this.project = project;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [project = "+project+"]";
    }
}
			
