package Graphs;


 // graph = [[1,2],[3],[3],[]]

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.Scanner;

// A directed graph using
// adjacency list representation
class Graph {

    // No. of vertices in graph
    private int v;

    // adjacency list
    private ArrayList<Integer>[] adjList;

    private int pathCount;

    public int getPathCount() {
        return pathCount;
    }

    // Constructor
    public Graph(int vertices) {

        // initialise vertex count
        this.v = vertices;


        // initialise adjacency list
        initAdjList ();

        this.pathCount = 0;
    }

    // utility method to initialise
    // adjacency list
    @SuppressWarnings("unchecked")
    private void initAdjList() {
        adjList = new ArrayList[v];

        for (int i = 0; i < v; i++) {
            adjList[i] = new ArrayList<> ();
        }
    }

    // add edge from u to v
    public void addEdge(int u, int v) {
        // Add v to u's list.
        adjList[u].add (v);
    }

    // Prints all paths from
    // 's' to 'd'
    public void printAllPaths(int s, int d) {
        boolean[] isVisited = new boolean[v];
        ArrayList<Integer> pathList = new ArrayList<> ();

        // add source to path[]
        pathList.add (s);

        // Call recursive utility
        printAllPathsUtil (s, d, isVisited, pathList);
    }

    // A recursive function to print
    // all paths from 'u' to 'd'.
    // isVisited[] keeps track of
    // vertices in current path.
    // localPathList<> stores actual
    // vertices in the current path
    private void printAllPathsUtil(Integer u, Integer d,
                                   boolean[] isVisited,
                                   List<Integer> localPathList) {

        if (u.equals (d)) {
//            System.out.println (localPathList);
            // if match found then no need to traverse more till depth
            this.pathCount++;
            return;
        }

        // Mark the current node
        isVisited[u] = true;

        // Recur for all the vertices
        // adjacent to current vertex
        for (Integer i : adjList[u]) {
            if (!isVisited[i]) {
                // store current node
                // in path[]
                localPathList.add (i);
                printAllPathsUtil (i, d, isVisited, localPathList);

                // remove current node
                // in path[]
                localPathList.remove (i);
            }
        }

        // Mark the current node
        isVisited[u] = false;
    }
}
public class PrintPath {


    public static void main(String[] args) {


        //int[][] arr = { {1,2}, {3}, {3},{} };

        //String str = "[[1,2],[3],[3],[]]";
        Scanner sc = new Scanner (System.in);
        String str = sc.next ();
        String[] spStr = str.split("],");
        int arr[][] = new int[5][5];

        for(int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                arr[i][j] = -1;
            }
        }
        int index = 0;
        for(String st : spStr) {

            st = st.replace("[","");
            st = st.replace("]","");
            st.trim();
//            System.out.println(st);

            if(!st.isEmpty()) {
                String[] strarr = st.split(",");

                for(int num = 0; num < strarr.length; num++) {
                    arr[index][num] = Integer.parseInt(strarr[num]);
                }
            }
            index += 1;

        }
//        for(int i = 0; i < arr.length;i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                System.out.print(arr[i][j] + " ");
//            }
//            System.out.println("");
//        }

        Graph g = new Graph (arr.length);

        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i].length; j++) {
                //System.out.print (arr[i][j] + " ");
                if (arr[i][j] != -1)
                    g.addEdge (i, arr[i][j]);
            }
        }
        g.printAllPaths (0 , 3);
        System.out.println (g.getPathCount ());



}

}
