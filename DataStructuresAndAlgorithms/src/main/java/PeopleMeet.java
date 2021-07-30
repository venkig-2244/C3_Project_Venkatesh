import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class PeopleMeet {

    static boolean checkMeet1(int p1, int s1, int p2, int s2) {
        Set<Integer> person1 = new HashSet<> ();
        Set<Integer> person2 = new HashSet<> ();

        for (int i = 0; i< 10;i++) {
            person1.add (p1);
            p1 = p1 + s1;

            person2.add (p2);
            p2 = p2 + s2;

            Set<Integer> check = new HashSet<> (person1);
            check.retainAll (person2);

            if (check.isEmpty ())
                continue;
            else {
                return true;
            }
        }

        return false;
    }

    static boolean checkMeet(int p1, int s1, int p2, int s2) {
        if (p1 < p2 && s1 < s2)
            return false;
        else if(p1 > p2 && s1 > s2)
            return false;

        if(p1 < p2) {
            int temp = p1;
            p1 = p2;
            p2 = temp;

            temp = s1;
            s1 = s2;
            s2 = temp;

        }
        while(p1 >= p2) {
            if (p1 == p2)
                return true;

            p1 = p1 + s1;
            p2 = p2 + s2;
        }

        return false;
    }

    public static void main(String[] args) {
        System.out.println (checkMeet1 (6, 3, 8, 2));
    }
}
