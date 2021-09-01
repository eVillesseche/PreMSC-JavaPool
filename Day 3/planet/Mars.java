package planet;

public class Mars{
    private String landingSite;
    private int id;
    private static int nbId = 0;

    public Mars(String landingSite){
        this.landingSite= landingSite;
        this.id = nbId;
        nbId ++;
    }

    public int getId(){
        return this.id;
    }
    public String getLandingSite(){
        return this.landingSite;
    }

}