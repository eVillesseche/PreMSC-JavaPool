public class GreatWhite  extends Shark{

    public GreatWhite(String name){
        super(name);
    }

    @Override
    public void eat(Animal prey){
        if(prey instanceof Canary){
            System.out.println(this.name + ": Next Time you try to give me that to eat , I'll eat yoy instead");
        }
        else if(!canEat(prey) && prey != this){
            System.out.println(this.name + ": ate a " + prey.getType() + " named " + prey.getName() + ".");
            this.frenzy = false;
        }
        else if(canEat(prey) && prey instanceof Shark && prey != this){
            System.out.println(this.name + ": The best meal one could wish for.");
        }
        else{
            System.out.println(this.name + ": It's not worth my time.");
        }
    }
}
