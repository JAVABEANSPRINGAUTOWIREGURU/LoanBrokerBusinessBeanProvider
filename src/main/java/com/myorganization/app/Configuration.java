          
public class Configuration
{
    private DescriptorRefs descriptorRefs;

    private Archive archive;

    public DescriptorRefs getDescriptorRefs ()
    {
        return descriptorRefs;
    }

    public void setDescriptorRefs (DescriptorRefs descriptorRefs)
    {
        this.descriptorRefs = descriptorRefs;
    }

    public Archive getArchive ()
    {
        return archive;
    }

    public void setArchive (Archive archive)
    {
        this.archive = archive;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [descriptorRefs = "+descriptorRefs+", archive = "+archive+"]";
    }
}
			
		
