                 
public class SpringBeanAdapterFactoryImplementingRequiredBusinessFunctionalityForVersionableDataAccessor
{
    private Letter letter;

    public Letter getLetter ()
    {
        return letter;
    }

    public void setLetter (Letter letter)
    {
        this.letter = letter;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [letter = "+letter+"]";
    }
    
     private Address[] address;

    private String signature;

    private String weblink;

    private Logo logo;

    private Salutation salutation;

    private String[] text;

    private Greetings greetings;

    private Title[] title;

    public Address[] getAddress ()
    {
        return address;
    }

    public void setAddress (Address[] address)
    {
        this.address = address;
    }

    public String getSignature ()
    {
        return signature;
    }

    public void setSignature (String signature)
    {
        this.signature = signature;
    }

    public String getWeblink ()
    {
        return weblink;
    }

    public void setWeblink (String weblink)
    {
        this.weblink = weblink;
    }

    public Logo getLogo ()
    {
        return logo;
    }

    public void setLogo (Logo logo)
    {
        this.logo = logo;
    }

    public Salutation getSalutation ()
    {
        return salutation;
    }

    public void setSalutation (Salutation salutation)
    {
        this.salutation = salutation;
    }

    public String[] getText ()
    {
        return text;
    }

    public void setText (String[] text)
    {
        this.text = text;
    }

    public Greetings getGreetings ()
    {
        return greetings;
    }

    public void setGreetings (Greetings greetings)
    {
        this.greetings = greetings;
    }

    public Title[] getTitle ()
    {
        return title;
    }

    public void setTitle (Title[] title)
    {
        this.title = title;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [address = "+address+", signature = "+signature+", weblink = "+weblink+", logo = "+logo+", salutation = "+salutation+", text = "+text+", greetings = "+greetings+", title = "+title+"]";
    }
}
			
			
