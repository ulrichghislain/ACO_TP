package receiver;

public class Buffer {
public StringBuffer getContent() {
		return content;
	}
	public void setContent(StringBuffer content) {
		this.content = content;
	}

private MoteurEdition_Impl roleMoteurEdition;
	
	private String zoneTravail;
	private StringBuffer content;
	
	public Buffer()
	{
		this.content = new StringBuffer();
	}
	
	public Buffer(String content)
	{
		this.content = new StringBuffer(content);
	}
	
	public void couper( )
	{
	}
	
	public void insert(int debut, int fin, String text){
		if(fin >= debut)
			content.replace(debut, fin, text);
	}
	
	public String display()
	{
		return this.content.toString();
	}
}
