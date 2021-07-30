import java.util.ArrayList;
import java.util.Optional;

public class PrimeNumbers {

    static void sieveOfEratosthenes(int num) {
        boolean prime[] = new boolean[num+1];
        for (int i = 0; i <= num; i++) {
            prime[i] = true;
        }
        for(int p = 2; p*p <=num; p++)
        {
            // If prime[p] is not changed, then it is a prime
            if(prime[p] == true)
            {
                // Update all multiples of p
                for(int i = p*p; i <= num; i += p)
                    prime[i] = false;
            }
        }
        // Print all prime numbers
        for(int i = 2; i <= num; i++)
        {
            if(prime[i] == true)
                System.out.print(i + " ");
        }

    }

    // using Sieve of Eratosthenes
    private static void findPrimeNumber(int num) {

        ArrayList<Integer> numbers = new ArrayList<> ();
        ArrayList<Integer> unmarked = new ArrayList<> ();
        ArrayList<Integer> marked = new ArrayList<> ();

        for (int i = 2; i <= num; i++) {
            numbers.add (i);
        }
        unmarked.add (2);
        int current = 0;
        //int index = 0;

        while (numbers.size () > 0) {
            for (int i = 0; i < numbers.size (); i++) {
                int val = numbers.get (i);
                if (val % unmarked.get (current) == 0) {
                    marked.add (val);
                } else {
                    unmarked.add (val);
                }
            }
            for(int i = 0; i < marked.size (); i++) {
                for(int j = 0; j < numbers.size (); j++) {
                    if (marked.get (i) == numbers.get (j))
                        numbers.remove (j);
                        numbers.trimToSize ();
                }
            }
            current++;
        }
    }

    private static boolean isPrime(int num) {
        for (int index = 2; index < num; index++){
            if(num % index == 0) {
                return false;
            }
        }
        return true;
    }

    private static void printPrime(int n) {
        ArrayList<Integer> primeNumbers = new ArrayList<Integer> ();

        for (int i = 2; i <= n; i++) {
            if (PrimeNumbers.isPrime (i))
                primeNumbers.add (i);
        }

        for (int num : primeNumbers) {
            System.out.println (num);
        }
    }
    public static void main(String[] args) {
        //PrimeNumbers.printPrime (100);
        PrimeNumbers.sieveOfEratosthenes (19);

    }
}
