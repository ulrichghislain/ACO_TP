package receiver;

public class PressePapier {
	
	private MoteurEdition_Impl roleMoteurEditon;

	private String conteneurpp;

	public String getConteneurpp() {
		return conteneurpp;
	}

	public void setConteneurpp(String conteneurpp) {
		this.conteneurpp = conteneurpp;
	}
	
	public PressePapier(String content)
	{
		this.conteneurpp = content;
	}
	
	public PressePapier()
	{

	}
	
}
