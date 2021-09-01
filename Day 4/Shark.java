public class Shark extends Animal {
    protected boolean frenzy = false;
    
    public Shark(String name){
        super(name, 0, Type.FISH);
        System.out.println("A KILLER IS BORN");
    }

    public void smellBlood(boolean bool){
        this.frenzy = bool;
    }

    public void status(){
        if(frenzy){
            System.out.println(this.name + " is smelling blood and wants to kill.");
        }
        else{
            System.out.println(this.name + " is swimming peacfully.");    
        }
    }

    public boolean canEat(Animal prey){
        return this != prey;
    }

    public void eat(Animal prey){
        if(canEat(prey)){
            System.out.println(this.name + " ate a " + prey.getType() + " named " + prey.getName() + ".");
            this.frenzy = false;
        }
        else{
            System.out.println(this.name + ": It's not worth my time.");
        }
    }

}
