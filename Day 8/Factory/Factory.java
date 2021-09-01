package Factory;
import java.util.ArrayList;
import java.util.List;

public class Factory {
    
    public Toy create(String toy)throws NoSuchToyException{
        if( toy == "teddy"){
            return new TeddyBear();
        }
        else if ( toy == "gameboy"){
            return new Gameboy();
        }
        else{  
            throw new NoSuchToyException(toy);
        }
    }

    public List<GiftPaper> getPapers(int n){
        List<GiftPaper> list = new ArrayList<GiftPaper>();
        for( int i = 0; i < n ; i++ ){
            list.add(new GiftPaper());
        }
        return list;
    }
}
