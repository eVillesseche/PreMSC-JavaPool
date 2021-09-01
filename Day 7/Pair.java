public class Pair<T, V> {
    
    private T first;
    private T second;

    public Pair(T first, T second){
        this.first = first;
        this.second = second;
    }
    public T getFirst(){
        return this.first;
    }
    
    public T getSecond(){
        return this.second;
    }

    public void display(){
        System.out.println("first: " + this.first + ", second: " + this.second + ".");
    }
}
