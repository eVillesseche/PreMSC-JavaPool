public class RadScorpion extends Monster {
    private static int id;

    public RadScorpion(){
        super( "RadScorpion #" + id, 80, 50);
        id++;
        this.damage = 25;
        this.apcost = 8;
        System.out.println(this.name + ": Crrr!");
    }

    public boolean attack(Fighter target){
        if(closeTo != target){
            System.out.println(this.name + ": I'm too far away from " + target.getHp() + ".");
        }
        else{
            if(ap >= apcost){
                ap -= apcost;
                if (target instanceof AssaultTerminator){
                    target.receiveDamage(damage);
                }
                else{
                    target.receiveDamage(damage*2);
                }
                System.out.println(name + ": attacks " + target.getName());
                return true;
            }
        }
        return false;
    }
}
