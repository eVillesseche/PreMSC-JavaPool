public class Panini extends Sandwich{

    public Panini(){
        super((float) 3.5, 120);
        this.vegetarian = true;
        this.ingredients.add("tomato");
        this.ingredients.add("salad");
        this.ingredients.add("cucumber");
        this.ingredients.add("avocado");
        this.ingredients.add("cheese");
    }
    
}
