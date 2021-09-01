public class Gecko{
    private String name;
    public static void main (String[] args) {
            Gecko arthur = new Gecko("Arthur");
            Gecko benjy = new Gecko();

            System.out.println(arthur.getName());
            System.out.println(benjy.getName());
    }
    public Gecko(){
        this.name = "Unknown";
        System.out.println("Hello!");
    }
    public Gecko(String newName){
        this.name = newName;
        System.out.println("Hello " + newName + "!");
    }
    public String getName(){
        return this.name;
    }
}