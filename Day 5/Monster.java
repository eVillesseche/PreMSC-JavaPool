public abstract class Monster extends Unit{

    protected int damage = 0;
    protected int apcost = 0;

    public Monster(String name ,int hp, int ap){
        super(name, hp, ap);
    }

    public int getDamage(){
        return this.damage;
    }
    
    public int getApcost(){
        return this.apcost;
    }

    public boolean equip(Weapon weapon){
        System.out.println("Monsters are proud and fight with their own bodies.");
        return false;
    }

    public boolean attack(Fighter target){
        if(closeTo != target){
            System.out.println(this.name + ": I'm too far away from " + target.getHp() + ".");
        }
        else{
            if(ap >= apcost){
                ap -= apcost;
                target.receiveDamage(damage);
                System.out.println(name + ": attacks " + target.getName());
                return true;
            }
        }
        return false;
    }

}
