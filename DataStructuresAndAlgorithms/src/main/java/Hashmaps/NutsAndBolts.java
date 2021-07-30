package Hashmaps;

import java.util.*;

public class NutsAndBolts {
    public static void main(String[] args) {
        char keys[] = {'@', '#', '$', '%', '^', '&'};
        char locks[] = {'$', '%', '&', '^', '@', '#'};

        LinkedHashMap<Character, Character> hash = new LinkedHashMap<> ();
        for (int i = 0; i < keys.length; i++) {
            hash.put (keys[i], '0');
        }
        for (int i = 0; i < locks.length; i++) {
            if (hash.containsKey (locks[i])) {
                hash.put (locks[i], locks[i]);
            } else {
                System.out.println ("Not possible");
                break;
            }
        }
        for (char k : hash.keySet ()) {
            System.out.println (k + " " + hash.get (k));
        }
    }
}
