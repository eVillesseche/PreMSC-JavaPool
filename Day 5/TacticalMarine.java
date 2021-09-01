public class TacticalMarine extends SpaceMarine{

    public TacticalMarine(String name){
        super(name, 100, 20);

        System.out.println(this.name + " on duty.");
        this.weapon = new PlasmaRifle(); 
    }

    public void recoverAP(){
        if( this.ap > 38){
            this.ap = 50;
        }
        else{
            this.ap += 12;
        }
    }
    
}
