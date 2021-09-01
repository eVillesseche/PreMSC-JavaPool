public abstract class Bread implements Food {

    protected float price;
    protected int calories;
    protected int bakingTime = 0;

    public Bread(float price, int calories){
        this.price = price;
        this.calories = calories;
    }


    public float getPrice(){
        return this.price;
    }
    public int getCalories(){
        return this.calories;
    }

    public int getBakingTime(){
        return this.bakingTime;
    }

    
}
