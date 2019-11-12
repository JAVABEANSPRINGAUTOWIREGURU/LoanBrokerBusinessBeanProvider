                 
public class BusinessComponent
{
    private String translate;

    private String content;

    public String getTranslate ()
    {
        return translate;
    }

    public void setTranslate (String translate)
    {
        this.translate = translate;
    }

    public String getContent ()
    {
        return content;
    }

    public void setContent (String content)
    {
        this.content = content;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [translate = "+translate+", content = "+content+"]";
    }
}
