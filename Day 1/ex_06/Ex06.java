import java.util.ArrayList;

public class Ex06{
    public static void main(String[] args){
        sequence(0);
        sequence(1);
        sequence(2);
        sequence(3);
        sequence(4);
        sequence(5);
        sequence(6);
    }

    public static void sequence(int nbr){
        if (nbr < 0){}
        else {
            conway(nbr);
        }
    }
    public static String conway(int iteration){
        String result = "1";
        System.out.println(result);
        for ( int i = 0; i < iteration ; i++){
            result = nextConway(result);
            System.out.println(result);
        }
        return result;
    }
    public static  String nextConway(String previousConway) {
        String nextConway = "";
        ArrayList<String> myArray = new ArrayList<String>();
        myArray = slipConway(previousConway);
        for(int i = 0; i < myArray.size(); i++){
            String splitSequence = myArray.get(i);
            nextConway += splitSequence.length() + "" + splitSequence.charAt(0);
        }
        return nextConway;
    }

    public static ArrayList<String> slipConway(String conway) {
        ArrayList<String> myArray = new ArrayList<String>();
        String[] split = conway.split("0+|(?<=([1-9]))(?=[1-9])(?!\\1)"); 
        for(int i = 0; i < split.length; i++){
            myArray.add(split[i]);
        }
      return myArray;
    }
}