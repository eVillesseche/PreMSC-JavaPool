public abstract class Menu <T extends Food, V extends Food>{

    protected T drink;
    protected V meal;

    public Menu(T drink, V meal){
        this.drink = drink;
        this.meal = meal;
    }

    public T getDrink(){
        return this.drink;
    }

    public V getMeal(){
        return this.meal;
    }

    public float getPrice(){
        return (float) Math.round((((this.drink).getPrice() + (this.meal).getPrice()) * 0.9 )*100)/100;
    }

    public int getCalories(){
        return (int) ((this.drink).getCalories() + (this.meal).getCalories());
    }

}