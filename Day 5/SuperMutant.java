public class SuperMutant extends Monster{
    private static int id;

    public SuperMutant(){
        super( "SuperMutant #" + id,170, 20);
        this.damage = 60;
        this.apcost = 20;
        id++;
        System.out.println(this.name + ": Roaarrr!");
    }

    public void recoverAP(){
        if( this.ap > 30){
            this.ap = 50;
        }
        else{
            this.ap += 9;
        }
        if ( this.hp > 160){
            this.hp = 170;
        }
        else{
            this.hp += 10;
        }
    }
    
}
