public class Snake{
    private String name;
    private int age;
    private int energy = 100;
    public static void main (String[] args) {
            Snake arthur = new Snake("Arthur");
            Snake benjy = new Snake();

            System.out.println(arthur.getName());
            System.out.println(benjy.getName());

            arthur.setAge(5);
            arthur.status();
    }
    public Snake(){
        this.name = "Unknown";
        System.out.println("Hello !");
    }
    public Snake(String newName){
        this.name = newName;
        System.out.println("Hello " + newName + "!");
    }

    public Snake(String newName, int newAge){
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
                System.out.println("Unborn Snake");
                break;
            case 1: case 2:
                System.out.println("Baby Snake");
                break;
            case 3: case 4: case 5: case 6: case 7: case 8: case 9: case 10:
                System.out.println("Adult Snake");
                break;
            case 11: case 12: case 13:
                System.out.println("Old Snake");
                break;
            default:
                System.out.println("Imposible Snake");
                break;
        }
    }
    public void hello(String text){
        System.out.println("Hello "+ text + ", I'm " + this.name + "!");
    }
    public void hello(int nbr){
        for( int i = 0 ; i < nbr ; i++){
            System.out.println("Hello, I'm " + this.name + "!");
        }
    }
    public void eat(String food){
        food = food.toLowerCase();
        switch (food) {
            case "meat":
                System.out.println("Yummy!");
                if ( 90 <= this.energy && this.energy >= 100){
                    this.energy = 100;
                }
                else{
                    this.energy += 100;
                }
                break;
            case "vegetable":
                System.out.println("Erk!");
                if (  this.energy >= 0 && this.energy <= 10){
                    this.energy = 0;
                }
                else{
                    this.energy -= 100;
                }
                break;
            default:
                System.out.println("I can't eat this!");
                break;
        }
    }

    public int getEnergy(){
        return this.energy;
    }
    public void setEnergy(int newEnergy){
        if(newEnergy < 0) {
            this.energy= 0;
        }
        else if ( newEnergy > 100){
            this.energy= 100;
        }
        else{
        this.energy = newEnergy;
        }
    }
    public void work(){
        if( this.energy >= 25){
            System.out.println("I'm working T.T");
            this.energy -= 9;
        }
        else{
            System.out.println("Heyy I'm too sleep, better take a nap!");
            this.energy =+ 50;
        }
    }
    public void fraternize(Snake friend){
        if (this.energy >= 30 && friend.energy >= 30){
            System.out.println("I'm going to drink with " + friend.name + "!");
        }
        else if (this.energy <30 && friend.energy  >= 30){
            System.out.println("Sorry" + friend.name +", I'm too tired to go out tonoght.");
            System.out.println("Oh! That's too bad, another time then!");
        }
        else if (friend.energy < 30 && this.energy >= 30){
            System.out.println("Sorry" + this.name +", I'm too tired to go out tonoght.");
            System.out.println("Oh! That's too bad, another time then!");
        }
        else{ 
            System.out.println("Not today!");
        }
    }


}