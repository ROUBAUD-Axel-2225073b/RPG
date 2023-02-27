package entite;


public class gobelin {
	private int X;
	private int Y;
	private int HP;
	private int XP;
	private int baseAttack;
	private int baseDefense;
	
	
	public gobelin (int x,int y, int xp, int baseAttack,int baseDefense) {
		this.X = x;
		this.Y = y;
		this.HP = 50;
		this.baseAttack = 10;
		this.baseDefense = 5;
	}




	public int getX() {
		return X;
	}


	public void setX(int x) {
		X = x;
	}


	public int getY() {
		return Y;
	}


	public void setY(int y) {
		Y = y;
	}


	public int getHP() {
		return HP;
	}


	public void setHP(int hP) {
		HP = hP;
	}


	public int getXP() {
		return XP;
	}


	public void setXP(int xP) {
		XP = xP;
	}


	public int getBaseAttack() {
		return baseAttack;
	}


	public void setBaseAttack(int baseAttack) {
		this.baseAttack = baseAttack;
	}


	public int getBaseDefense() {
		return baseDefense;
	}


	public void setBaseDefense(int baseDefense) {
		this.baseDefense = baseDefense;
	}
}