import java.util.ArrayList;
import java.util.List;

public class Battalion {

    List<Character> characters;

    public Battalion(){
        this.characters = new ArrayList<>();
    }

    
    public void add(List<?> list){
        for( int i =0; i< list.size() ;i++){
            if(list instanceof Mage){
                this.characters.add((Mage)list.get(i));
            }
            else if(list instanceof Warrior){
                this.characters.add((Warrior)list.get(i));
            }
            else{
                this.characters.add((Character)list.get(i));
            }
        }
    }

    public void display(){
        for (int i = 0; i < characters.size() ; i++){
            System.out.println(characters.get(i));
        }
    }


}
