package Factory;
import java.util.List;

public class Elf {
    
    private Toy toy;
    private List<GiftPaper> papers;
    private Factory factory;

    public Elf(Factory factory){
        this.factory = factory;
    }
    
    public boolean pickToy(String toy){
        if(this.toy != null){
            System.out.println("Minute please?! I'm not that fast.");
            return false;
        }
        try{
            this.toy = factory.create(toy);
            System.out.println("What a nice one! I would have likedto keep it...");
            return true;
        } catch (NoSuchToyExeption e){
            System.out.println("I didn't find any " + toy + ".");
            System.out.println(e.getMessage());
            return false;
        }
    }
    
    public boolean pickPaper(int n){
        papers = factory.getPapers(n);
        return true;
    }

    public GiftPaper pack(){
        if ( toy == null && papers != null ){
            System.out.println("I don't have any toy, but hey at least it's paper.");
            return null;
        }
        else if ( papers == null && toy !=null){
            System.out.println("Wait... I can't pack it with my shirt.");
            return null;
        }
        else{
            papers.get(papers.size() -1).wrap(toy);
            System.out.println("And another kid will be happy!");
            return papers.get(papers.size() -1);
        }
    }
}
