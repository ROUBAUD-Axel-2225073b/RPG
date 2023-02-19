package entite;
import item.*; 
import carte.*;

public class Hero {
    private int X;
    private int Y;
    private int HP;
    private int XP;
    private int baseAttack;
    private int baseDefense;
    private int baseSpeed;
    private item.armor armure;
  
    
        
    public Hero(int x, int y, int hP,int xp, int baseAttack, int baseDefense, int baseSpeed ,item.armor armure) {
        super();
        X = x;
        Y = y;
        HP = hP;
        this.XP = xp;
        this.baseAttack = baseAttack;
        this.baseDefense = baseDefense;
        this.baseSpeed = baseSpeed;
        this.armure = armure;
    }
    
    public int getXP() {
		return XP;
	}

	public void setXP(int xP) {
		XP = xP;
	}

	public item.armor getArmure() {
		return armure;
	}

	public void setArmure(item.armor armure) {
		this.armure = armure;
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
    public int getBaseSpeed() {
        return baseSpeed;
    }
    public void setBaseSpeed(int baseSpeed) {
        this.baseSpeed = baseSpeed;
    }
} 