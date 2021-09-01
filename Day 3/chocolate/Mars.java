package chocolate;

public class Mars{
    private int id;
    private static int nbId = 0;

    public Mars(){
        this.id = nbId;
        nbId ++;
    }

    public int getId(){
        return this.id;
    }
}