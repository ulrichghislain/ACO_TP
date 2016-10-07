package receiver;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestMoteurEdition_Impl {

	//@Test
	public void testCouper() {
		Buffer buffer = new Buffer("miage");
		Selection selection = new Selection(1, 3);
		MoteurEdition_Impl moteur = new MoteurEdition_Impl();
		moteur.setRoleBuffer(buffer);
		moteur.setRoleSelection(selection);
		moteur.couper();
		PressePapier pp = moteur.getRolePressePapier();
		System.out.println("presse papier -> "+pp.getConteneurpp());
		assertTrue(pp.getConteneurpp().contentEquals("ia"));
		System.out.println("buffer -> "+buffer.getContent().toString());
		assertTrue(buffer.display().contentEquals("mge"));
	}



	@Test
	public void testColler() {
		Buffer buffer = new Buffer("miage");
		System.out.println("buffer av. -> "+buffer.getContent().toString());
		PressePapier pp = new PressePapier("rennes");
		Selection selection = new Selection(1, 1);
		MoteurEdition_Impl moteur = new MoteurEdition_Impl();
		moteur.setRoleBuffer(buffer);
		moteur.setRoleSelection(selection);
		moteur.setRolePressePapier(pp);
		moteur.coller();
		System.out.println("buffer apr.-> "+buffer.getContent().toString());
		assertTrue(buffer.display().contentEquals("miagerennes"));
	}

	
	
	//@Test
	public void testInsererTexte()
	{
		MoteurEdition_Impl moteur = new MoteurEdition_Impl();
		String str = "miage";
		moteur.insererTexte(str);
		Buffer buffer = moteur.getRoleBuffer();
		assertTrue(buffer.display().contentEquals(str));
		
		Selection selection = new Selection(3,0);
		moteur.setRoleSelection(selection);
		String str2 = "test";
		moteur.insererTexte(str2);
		System.out.println("buffer -> "+buffer.display());
		assertTrue(buffer.display().contentEquals("miage"));
	}
	
	//@Test
	public void testCopier(){
		Buffer buffer = new Buffer("miage");
		Selection selection = new Selection(1, 3);
		MoteurEdition_Impl moteur = new MoteurEdition_Impl();
		moteur.setRoleBuffer(buffer);
		moteur.setRoleSelection(selection);
		moteur.copier();
		PressePapier pp = moteur.getRolePressePapier();
		System.out.println("presse papier -> "+pp.getConteneurpp());
		assertTrue(pp.getConteneurpp().contentEquals("ia"));
	}
}
