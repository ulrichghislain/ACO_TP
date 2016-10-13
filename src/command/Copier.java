package command;
import receiver.MoteurEdition;

public class Copier implements Command {
	
	public MoteurEdition moteuredition ;
	
	public Copier(MoteurEdition moteuredition){
		this.moteuredition = moteuredition;
	}
	/**
	 * Getteur
	 * @return moteuredition
	 */
	public MoteurEdition getMoteurEdition() {
		return moteuredition;
	}

	/**
	 * Setteur
	 * @param moteuredition : moteur
	 */
	public void setMoteurEdition(MoteurEdition moteuredition) {
		this.moteuredition = moteuredition;
	}
	  void execute (){
		 moteuredition.copier();
		 
	 }
	
	
	
	
	
	

}
