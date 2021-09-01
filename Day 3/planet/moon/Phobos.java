package planet.moon;

import planet.*;

public class Phobos{

    private Mars mars;
    private String landingSite;

    public Phobos(Mars mars, String landing){
        this.mars = mars;
        this.landingSite = landing;
        System.out.println("Phobos placed in orbit.");
    }

    public Phobos(chocolate.Mars snaks){
        System.out.println("No planet given.");
    }

    public Mars getMars(){
        return this.mars;
    }

    public String getLandingSite(){
        return this.landingSite;
    }
}