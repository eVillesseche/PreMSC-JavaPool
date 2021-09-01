public abstract class SpaceMarine extends Unit{

    protected Weapon weapon;


    public SpaceMarine(String name ,int hp, int apcost){
        super(name, hp, apcost);
    }

    public Weapon getWeapon(){
        return this.weapon;
    }

    public boolean equip(Weapon weapon){
        if(weapon.isEquipped()){
            return false;
        }
        else
        {
            System.out.println(this.name + " has been equipped with a "+ weapon.getName() + ".");
            return true;
        }
    }

    public boolean attack(Fighter target){
        if(weapon == null){
            System.out.println(this.name + ": Hey, this is crazy. I'm not going to fight this empty-handed.");
            return false;
        }
        else if(closeTo != target && weapon.isMelee()) {
            System.out.println(this.name + ": I'm too far away from " + target.getName() + ".");    
            return false;
        }
        else if (this.ap >= weapon.getApcost()){
            System.out.println(this.name + " attacks " + target.getName() + " with a " + weapon.getName() + ".");
            weapon.attack();
            target.receiveDamage(weapon.getDamage());
            this.ap -= weapon.getApcost();
            return true;
        }
        else{
            return false;
        }
    }
    @Override
    public void recoverAP(){
        if( this.ap > 43){
            this.ap = 50;
        }
        else{
            this.ap += 7;
        }
    }
}
