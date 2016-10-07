package receiver;

public class MoteurEdition_Impl implements MoteurEdition
{
	public PressePapier getRolePressePapier() {
		return rolePressePapier;
	}

	public void setRolePressePapier(PressePapier rolePressePapier) {
		this.rolePressePapier = rolePressePapier;
	}

	public Buffer getRoleBuffer() {
		return roleBuffer;
	}

	public void setRoleBuffer(Buffer roleBuffer) {
		this.roleBuffer = roleBuffer;
	}

	public Selection getRoleSelection() {
		return roleSelection;
	}

	public void setRoleSelection(Selection roleSelection) {
		this.roleSelection = roleSelection;
	}

	private PressePapier rolePressePapier;

	private Buffer roleBuffer;

	private Selection roleSelection;

	public MoteurEdition_Impl()
	{
		this.roleBuffer = new Buffer();
		this.roleSelection = new Selection();
		this.rolePressePapier = new PressePapier();
	}
	
	public void couper( )
	{
		copier();
		this.roleBuffer.getContent().delete(
				this.roleSelection.getDebut(), 
				this.roleSelection.getFin()
				);
	}

	public void copier()
	{
		int deb = this.roleSelection.getDebut();
		int fin = this.roleSelection.getFin();
		String subStr = this.roleBuffer.getContent().substring(deb, fin);
		this.rolePressePapier.setConteneurpp(subStr);
	}

	public void coller( )
	{
		String content = this.rolePressePapier.getConteneurpp();
		if(content != null)
			this.insererTexte(content);
	}

	public void insererTexte(String text)
	{
		int deb = this.roleSelection.getDebut();
		int fin = this.roleSelection.getFin();
		this.roleBuffer.insert(deb, fin, text);
	}

	/*public void selection( )
	{

	}*/
}
