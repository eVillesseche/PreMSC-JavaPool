package Factory;
public class NoSuchToyException extends Exception{

    private static final long serialVersionUID = -577703004527150342L;

    NoSuchToyException(String name){
        super("No such toy: " + name + ".");
    }
    
}
