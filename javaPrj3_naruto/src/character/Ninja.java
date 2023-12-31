package character;

public class Ninja {
	
	public Ninja() {
		
	}
	
	public Ninja(String name, int hp, int atk, int def, String signatureSkill) {
		super();
		this.name = name;
		this.hp = hp;
		this.atk = atk;
		this.def = def;
		this.signatureSkill = signatureSkill;
	}

	private String name;
	private int hp;
	private int atk;
	private int def;
	private String signatureSkill;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	public int getAtk() {
		return atk;
	}
	public void setAtk(int atk) {
		this.atk = atk;
	}
	public int getDef() {
		return def;
	}
	public void setDef(int def) {
		this.def = def;
	}
	public String getSignatureSkill() {
		return signatureSkill;
	}
	public void setSignatureSkill(String signatureSkill) {
		this.signatureSkill = signatureSkill;
	}
	
	public String toString() {
		return "Ninja [name=" + name + ", hp=" + hp + ", atk=" + atk + ", def=" + def + ", signatureSkill="
				+ signatureSkill + "]";
	}
	
	
}
