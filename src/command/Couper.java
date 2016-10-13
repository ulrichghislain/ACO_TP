package command;
import receiver.MoteurEdition;

public class Couper implements Command {
	
	public MoteurEdition moteuredition ;
	
	public Couper(MoteurEdition moteuredition){
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
		 moteuredition.couper();
		 
	 }
	
	
	
	
	
	

}
