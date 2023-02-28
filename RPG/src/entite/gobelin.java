package entite;


public class gobelin {
    
    private static int hp;
    private static int maxHp;
    private static int attack;
    private static int defence;
    private static int speed;

    public gobelin() {
        hp = 25;
        maxHp = 25;
        attack = 8;
        defence = 5;
        speed = 5;
    }


    public static int getHp() {
        return hp;
    }

    
    public static void setHp(int hp) {
        gobelin.hp = hp;
    }
    
    
    public static int getMaxHp() {
        return maxHp;
    }


    public static void setMaxHp(int maxHp) {
    	gobelin.maxHp = maxHp;
    }


    public static int getAttack() {
        return attack;
    }

    
    public static void setAttack(int attack) {
    	gobelin.attack = attack;
    }

    
    public static int getDefence() {
        return defence;
    }

    
    public static void setDefence(int defence) {
    	gobelin.defence = defence;
    }

    
    public static int getSpeed() {
        return speed;
    }

    
    public static void setSpeed(int speed) {
    	gobelin.speed = speed;
    }

    
    
    public String toString() {
        return "Health : "+hp+"/"+maxHp;
    }
    
    

}