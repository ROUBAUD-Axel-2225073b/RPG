package item;

public class armor {
    private int defense;
    
    public armor (String nom, int defense) {
        this.defense = defense;
    }
    public int getDefense() {
        return defense;
    }
    
    public void setDefense(int defense) {
        this.defense = defense;
    }
}