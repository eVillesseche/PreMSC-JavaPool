import java.util.ArrayList;

public class Team{

    private String name;

    private ArrayList<Astronaut> members = new ArrayList<Astronaut>();
    
    public Team(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void add(Astronaut newMember){
        members.add(newMember);
    }
    public void remove(Astronaut member){
        members.remove(member);
    }
    public int countMembers(){
        return members.size();
    }
    public void showMembers(){
        System.out.print(this.name + ": ");
        for(int i = 0; i < members.size(); i++){
           
            if (members.get(i).getDestination() == null){
                System.out.print(members.get(i).getName() + " on standby");
            }
            else{
                System.out.print(members.get(i).getName()+ " on mission");
            }

            if(i == members.size() -1 ){
                System.out.print(".");
            }
            else {
                System.out.print(", ");   
            }
        }
    }

    public void doAction(){
        System.out.println(this.name + "Nothing to do.");
    }

    public void doAction(planet.Mars action){
        for(int i = 0; i < members.size(); i++){
            members.get(i).doActions(action);
        }
    }


    public void doAction(planet.moon.Phobos action){
        for(int i = 0; i < members.size(); i++){
            members.get(i).doActions(action);
        }
    }

    public void doAction(chocolate.Mars snake){
        for(int i = 0; i < members.size(); i++){
            members.get(i).doActions(snake);
        }
    }

}