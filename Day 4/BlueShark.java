public class BlueShark extends Shark{

    public BlueShark(String name){
        super(name);
    }

    @Override
    public boolean canEat(Animal prey){
        if (this == prey){
            return false;
        }  
        else if(prey.type == Type.FISH){
            return true; 
        }
        else{
            return false;
        }
    }

    
}
