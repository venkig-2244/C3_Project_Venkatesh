package Hashmaps.GradedQuestions;
import java.util.*;

public class DistinctValues {
    //Method to print distinct values
    public static void printValues(Map<Integer,String> map){
        //Write your code here
        LinkedHashSet<String> list = new LinkedHashSet<> ();
        for(int key : map.keySet ()) {
            list.add (map.get (key));
        }

        Iterator value = list.iterator();
        while (value.hasNext()) {
            System.out.println(value.next());
        }
    }

    public static void main(String[] x){
        Map<Integer,String> map = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int key;
        String value;
        for(int i = 1; i <= num; i++){
            key = sc.nextInt();
            value = sc.next();
            map.put(key,value);
        }
        printValues(map);
    }
}
