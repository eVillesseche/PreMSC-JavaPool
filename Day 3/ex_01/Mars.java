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

    public static void main(String[] args){
        Mars didier = new Mars();
        Mars joseph = new Mars();
        Mars aaaaaa = new Mars();

        System.out.println(didier.getId());
        System.out.println(joseph.getId());
        System.out.println(aaaaaa.getId());
    }
}