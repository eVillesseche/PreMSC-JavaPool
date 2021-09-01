import java.util.ArrayList;
import java.util.List;

public abstract class Sandwich implements Food {
    
    protected float price;
    protected int calories;
    protected boolean vegetarian = false;
    protected List<String> ingredients = new ArrayList<String>();

    public Sandwich(float price, int calories) {
        this.price = price;
        this.calories = calories;
	}

	public boolean isVegetarian(){
        return this.vegetarian;
    }

    public List<String> getIngredients(){
        return this.ingredients;
    }

    public float getPrice(){
        return this.price;
    }
    public int getCalories(){
        return this.calories;
    }

}
