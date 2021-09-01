public class Duet<T> {
    
    public static <T> T min(T first, T second) {
        if( ((Comparable<T>) first).compareTo(second) < 0) {
            return first;
        }
        else{
            return second;
        }

    }

    public static <T> T max(T first, T second){
        if( ((Comparable<T>) first).compareTo(second) > 0) {
            return first;
        }
        else{
            return second;
        }
    }
}
