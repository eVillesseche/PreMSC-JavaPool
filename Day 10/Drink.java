public abstract class Drink implements Food{
    
    protected float price;
    protected int calories;
    protected boolean aCan = false;

    public Drink(float price, int calories){
        this.price = price;
        this.calories = calories;
    }

    public boolean isACan(){
        return aCan;
    }

    public float getPrice(){
        return this.price;
    }
    public int getCalories(){
        return this.calories;
    }

}
