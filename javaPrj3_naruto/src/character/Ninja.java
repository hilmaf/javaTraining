package character;

public class Ninja {
	public Ninja() {
		
	}
	
	public Ninja(String name, int hp, int atk) {
		this.name = name;
		this.hp = hp;
		this.atk = atk;
	}
	
	private String name;
	private int hp;
	private int atk;
	private int def;
	private String mainSkill;
	
	
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

	public String getMainSkill() {
		return mainSkill;
	}

	public void setMainSkill(String mainSkill) {
		this.mainSkill = mainSkill;
	}

	public String toString() {
		return "Ninja [name=" + name + ", hp=" + hp + ", atk=" + atk + ", def=" + def + ", mainSkill=" + mainSkill
				+ "]";
	}

	
	
}
