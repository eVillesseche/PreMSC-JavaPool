abstract class Character implements Movable{

    protected final String RPGClass;
    protected String name;
    protected int life = 50;
    protected int agility = 2;
    protected int strength = 2;
    protected int wit = 2;

    public Character(String name, String RPGClass){
        this.name = name;
        this.RPGClass = RPGClass;
    }

    public Character(String name){
        this.name = name;
        this.RPGClass = "Character";
    }

    public String getRPGClass(){
        return this.RPGClass;
    }

    public String getName(){
        return this.name;
    }

    public int getLife(){
        return this.life;
    }
    
    public int getAgility(){
        return this.agility;
    }

    public int getStrength(){
        return this.strength;
    }

    public int getWit(){
        return this.wit;
    }

    public void attack(String weapon){
        System.out.println(this.name + ": Rrrrrrrrr....");
    }

    public void moveRight(){
        System.out.println(this.name + ": moves right");
    }


    public void moveLeft(){
        System.out.println(this.name + ": moves left");
    }

    public void moveForward(){
        System.out.println(this.name + ": moves back");
    }
    public void moveBack(){
        System.out.println(this.name + ": moves forward");
    }

    public final void unsheathe(){
        System.out.println(this.name + ": unsheathes his weapon.");
    }
}