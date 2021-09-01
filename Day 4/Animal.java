public class Animal {
    private static int numberOfAnimals = 0;
    private static int numberOfMammals = 0;
    private static int numberOfFish = 0;
    private static int numberOfBirds = 0;
    protected String name;
    protected int legs;
    protected Type type;

    protected enum Type{
        MAMMAL, FISH, BIRD
    }

    protected Animal(String name,int legs, Type race){
        countType(race);
        this.name = name;
        this.legs = legs;
        this.type = race;
        System.out.println("My name is " + name + " and I am a " + this.getType() + "!");

    }

    private static void countType(Type race){
        switch (race) {
            case MAMMAL:
                numberOfMammals++;
                break;
            case FISH:
                numberOfFish++;
                break;
            case BIRD:
                numberOfBirds++;
                break;
        }
        numberOfAnimals++;
    }

    public String getName(){
        return this.name;
    }
    
    public void setName(String name){
        this.name = name;
    }

    public int getLegs(){
        return this.legs;
    }
    
    public String getType(){
        return this.type.toString().toLowerCase();
    }

    public static int getNumberOfAnimals(){
        if(numberOfAnimals != 1 ){
            System.out.println("There are currently " + numberOfAnimals + " animals in our world.");
        }
        else{
            System.out.println("There is currently " + numberOfAnimals + " animal in our world.");    
        }
        return numberOfAnimals;
    }

    public static int getNumberOfMammals(){
        if(numberOfMammals != 1 ){
            System.out.println("There are currently " + numberOfMammals + " mammals in our world.");
        }
        else{
            System.out.println("There is currently " + numberOfMammals + " mammal in our world.");    
        }
        return numberOfMammals;
    }
    
    public static int getNumberOfFish(){
        if(numberOfFish != 1 ){
            System.out.println("There are currently " + numberOfFish + " fish in our world.");
        }
        else{
            System.out.println("There is currently " + numberOfFish + " fish in our world.");    
        }
        return numberOfFish;
    } 
    
    public static int getNumberOfBirds(){
        if(numberOfBirds != 1 ){
            System.out.println("There are currently " + numberOfBirds + " birds in our world.");
        }
        else{
            System.out.println("There is currently " + numberOfBirds + " bird in our world.");    
        }
        return numberOfBirds;
    }
}