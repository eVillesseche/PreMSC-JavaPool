public abstract class Dessert implements Food{
    
    protected float price;
    protected int calories;

    public Dessert(float price, int calories){
        this.price = price;
        this.calories = calories;
    }


    public float getPrice(){
        return this.price;
    }
    public int getCalories(){
        return this.calories;
    }

}
