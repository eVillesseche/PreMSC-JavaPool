public class Gecko{
    public String name;
    public static void main (String[] args) {
            Gecko arthur = new Gecko("Arthur");
            Gecko benjy = new Gecko();

            System.out.println(arthur.name);
            System.out.println(benjy.name);
    }
    public Gecko(){
        this.name = "Unknown";
        System.out.println("Hello!");
    }
    public Gecko(String newName){
        this.name = newName;
        System.out.println("Hello " + newName + "!");
    }
    
}