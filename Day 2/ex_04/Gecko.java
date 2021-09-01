public class Gecko{
    private String name;
    private int age;
    public static void main (String[] args) {
            Gecko arthur = new Gecko("Arthur");
            Gecko benjy = new Gecko();

            System.out.println(arthur.getName());
            System.out.println(benjy.getName());

            arthur.setAge(5);
            arthur.status();
    }
    public Gecko(){
        this.name = "Unknown";
        System.out.println("Hello!");
    }
    public Gecko(String newName){
        this.name = newName;
        System.out.println("Hello " + newName + "!");
    }

    public Gecko(String newName, int newAge){
        this.name = newName;
        this.age = newAge;
        System.out.println("Hello " + newName + "!");
    }

    public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }
    
    public void setAge(int newAge){
        this.age = newAge;
    }
    public void status(){
        switch (this.age) {
            case 0:
                System.out.println("Unborn Gecko");
                break;
            case 1: case 2:
                System.out.println("Baby Gecko");
                break;
            case 3: case 4: case 5: case 6: case 7: case 8: case 9: case 10:
                System.out.println("Adult Gecko");
                break;
            case 11: case 12: case 13:
                System.out.println("Old Gecko");
                break;
            default:
                System.out.println("Impossible Gecko");
                break;
        }
    }
}