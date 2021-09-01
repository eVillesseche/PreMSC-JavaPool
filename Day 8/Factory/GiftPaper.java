package Factory;
public class GiftPaper {
    
    private Toy gift;

    public GiftPaper(){

    }

    public void wrap(Toy gift){
        this.gift = gift;
    }

    public Toy unwrap(){
        if (this.gift.getTitle() == "TeddyBear"){
            this.gift = null;
            return new TeddyBear();
        }
        else{
            this.gift = null;
            return new Gameboy();
        }
    }
}
