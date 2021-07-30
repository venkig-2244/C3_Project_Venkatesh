package Graphs;

import java.util.ArrayList;

public class FirstGraph {

    private static void addEdge(ArrayList<ArrayList<Integer>>  adj, int u, int v) {
        adj.get(u).add(v);
        adj.get(v).add(u);
    }

    private static void printGraph(ArrayList<ArrayList<Integer>> adj) {
        for(int i = 0; i < adj.size (); i++) {
            System.out.println ("Adjacency list of vertex " + i);
            for(int j=0; j < adj.get (i).size (); j++) {
                System.out.print (" -> " + adj.get (i).get (j));
            }
            System.out.println ();

        }
    }


    public static void main(String[] args) {
        int v = 5;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<> ();

        for (int index = 0; index < v; index++) {
            adj.add (new ArrayList<Integer> ());
        }
        addEdge (adj, 0, 1);
        addEdge (adj, 0, 4);
        addEdge (adj, 1, 2);
        addEdge (adj, 1, 3);
        addEdge (adj, 1, 4);
        addEdge (adj, 2, 3);
        addEdge (adj, 3, 4);

        printGraph (adj);

        System.out.println (adj.get(1).size ());
    }
}
