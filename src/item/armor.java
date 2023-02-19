package item;

public class armor {
    private int defense;
    
    public armor (String nom, int defense, int durabilite) {
        this.defense = defense;
    }
    public int getDefense() {
        return defense;
    }
    
    public void setDefense(int defense) {
        this.defense = defense;
    }
}