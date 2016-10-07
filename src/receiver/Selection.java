package receiver;

public class Selection {
	
	private MoteurEdition_Impl roleMoteurEdition;

	private int debut;

	private int fin;

	public Selection(int debut, int fin)
	{
		this.debut = debut;
		this.fin = fin;
	}

	public Selection()
	{
		this.debut = 0;
		this.fin = 0;
	}
	
	public int getDebut() {
		return debut;
	}

	public void setDebut(int debut) {
		this.debut = debut;
	}

	public int getFin() {
		return fin;
	}

	public void setFin(int fin) {
		this.fin = fin;
	}

}
