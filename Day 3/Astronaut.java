public class Astronaut{
    private String name;
    private int snacks = 0;
    private String destination;
    private int id;
    private static int nbId = 0;

    public static void main(String[] args){
        Astronaut mutta = new Astronaut("Mutta");
        Astronaut hibito = new Astronaut("Hibito");

        System.out.println(mutta.getId());
        System.out.println(hibito.getId());
    }

    public Astronaut(String newName){
        this.id = nbId;
        nbId ++;
        this.name = newName;
        System.out.println(this.name + " ready for launch!");
    }

    public String getName(){
        return this.name;
    }

    public int getSnacks(){
        return this.snacks;
    }

    public String getDestination(){
        return this.destination;
    }

    public int getId(){
        return this.id;
    }

    public void doActions(){
        System.out.println(this.name + ": Nothing to do.");
        if(this.destination == null){
            System.out.println(this.name + ": I may have done nothing, but I have " + this.snacks + " Mars to eat at least!");
        }
    }

    public void doActions(planet.Mars planet){
        System.out.println(this.name + ": Started a mission!");
        this.destination = planet.getLandingSite();
    }

    public void doActions(planet.moon.Phobos moon){
        System.out.println(this.name + ": Started a mission!");
        this.destination = moon.getLandingSite();
    }    

    public void doActions(chocolate.Mars mars){
        System.out.println(this.name + ": Thanks for this mars number " + mars.getId());
        this.snacks++;
        if(this.destination == null){
            System.out.println(this.name + ": I may have done nothing, but I have " + this.snacks + " Mars to eat at least!");
        }
    }


}