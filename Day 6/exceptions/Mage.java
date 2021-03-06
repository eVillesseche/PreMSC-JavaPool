public class Mage extends Character{

    public Mage(String name){
        super(name, "Mage");
        this.life = 70;
        this.strength = 3;
        this.agility = 10;
        this.wit = 10;
        System.out.println(this.name + ": May the gods be with me.");
    }

    public void attack(String weapon)throws WeaponException{
        if(weapon == "magic" || weapon == "wand"){
            System.out.println(this.name + ": Rrrrrrrrr....");
            System.out.println(this.name + ": Feel the power of my " + weapon + "!");
        }
        else if (weapon == null || weapon == ""){
            throw new WeaponException(this.name + ": I refuse to fight with my bare hands.");
        }
        else{ 
            throw new WeaponException(this.name + ": I don't need this stupid " + weapon + "! Don't misjudge my powers!");            
        }
    }

    public void moveRight(){
        System.out.println(this.name + ": moves right furtively.");
    }


    public void moveLeft(){
        System.out.println(this.name + ": moves left furtively.");
    }

    public void moveForward(){
        System.out.println(this.name + ": moves forward furtively.");
    }
    public void moveBack(){
        System.out.println(this.name + ": moves back furtively.");
    }
    
}
