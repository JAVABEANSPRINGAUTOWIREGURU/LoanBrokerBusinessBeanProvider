                 
public class DescriptorRefs
{
    private String descriptorRef;

    public String getDescriptorRef ()
    {
        return descriptorRef;
    }

    public void setDescriptorRef (String descriptorRef)
    {
        this.descriptorRef = descriptorRef;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [descriptorRef = "+descriptorRef+"]";
    }
}
