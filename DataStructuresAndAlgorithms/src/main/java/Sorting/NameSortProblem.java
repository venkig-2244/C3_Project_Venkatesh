package Sorting;

/*
There is a total of N students in Professor X’s school for mutants. Each student has a first name as well as a last name, maintained separately in two separate database columns. One day, Professor X asks a student named Logan to copy the items of both these columns in two separate arrays and sort them using insertion sort. However, the first names should be in ascending order and the last names in descending order. Logan never used insertion sort on an array of strings, so he’s seeking for help. Write a function that takes an array of strings as input and returns the sorted array as output. Assume that the names can only be in lowercase.

Input:
      1. The first line will be 'n', the size of the two arrays.
      2. The next 'n' lines are the first name of the students.
      3. The next 'n' lines are the last name of the students.

Output:
       1. The first 'n' lines are first names arranged in ascending order.
       2. The next 'n' lines are the last names arranged in descending order.

HINT: You can use the compareTo() method to compare two strings lexically.
 */
public class NameSortProblem {
    private static String[] performSortFirstName(String[] names) {
        for (int i = 0; i < names.length-1; i++) {
            for(int j = i+1; j > 0; j--) {
//                System.out.println (names[j] + " " + names[j-1] + " " + names[j].compareTo (names[j-1]));
                if(names[j].compareTo (names[j-1]) < 0) {
                    String temp = names[j];
                    names[j] = names[j-1];
                    names[j-1] = temp;
                }
            }
        }


        return names;
    }

    private static String[] performSortLastName(String[] names) {
        for (int i = 0; i < names.length-1; i++) {
            for(int j = i+1; j > 0; j--) {
//                System.out.println (names[j] + " " + names[j-1] + " " + names[j].compareTo (names[j-1]));
                if(names[j].compareTo (names[j-1]) > 0) {
                    String temp = names[j];
                    names[j] = names[j-1];
                    names[j-1] = temp;
                }
            }
        }

        return names;
    }

    public static void main(String[] args) {
        String[] firstNames = {"logan", "jean"};
        String[] lastNames = {"gray", "wolverine"};



        String[] sortedNames = NameSortProblem.performSortFirstName (firstNames);
        for (String name : sortedNames) {
            System.out.println (name);
        }
        String[] sortedLastNames = NameSortProblem.performSortLastName (lastNames);
        for (String name : sortedLastNames) {
            System.out.println (name);
        }
    }
}
