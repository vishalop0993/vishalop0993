package main.ds.graph;

import java.util.Stack;

public class DFSAdjencyMatrix {
    public static void main(String args[])
    {
        Graph graph = new Graph();
        graph.addVertex('A');
        graph.addVertex('B');
        graph.addVertex('C');
        graph.addVertex('D');

        graph.addEdge(0,1);
        graph.addEdge(1,2);
        graph.dfs();

    }
}
class Vertex
{
    char label;
    boolean isVisited;

    public Vertex(char label) {
        this.label = label;
        this.isVisited = false;
    }
}

class Graph
{
    private final int MAX_VERTS = 20;
    private Vertex vertexList[];
    private int adjMat[][];
    private int nVerts;
    private Stack<Integer> s;

    public Graph() {
        this.vertexList = new Vertex[MAX_VERTS];
        this.adjMat = new int[MAX_VERTS][MAX_VERTS];
        this.nVerts = 0;
        this.s = new Stack<Integer>();
    }
    public void addVertex(char lab)
    {
        vertexList[nVerts++] = new Vertex(lab);
    }
    public void addEdge(int start, int end)
    {
        adjMat[start][end] = 1;
        adjMat[end][start] = 1;

    }
    public void displayVertex(int v)
    {
               System.out.println(vertexList[v].label + " ");
    }

    public int getAdjUnvisitedVertex(int v)
    {
        for(int j = 0;j<nVerts;j++)
        {
            if(adjMat[j][v] ==1 && vertexList[j].isVisited == false )
                return j;

        }
        return -1;
    }

    public void dfs()
    {
        vertexList[0].isVisited = true;
        displayVertex(0);
        s.push(0);
        while (!s.isEmpty())
        {
            int v = getAdjUnvisitedVertex(s.peek());
            if(v == -1)
                s.pop();
            else
            {
                vertexList[v].isVisited = true;
                displayVertex(v);
                s.push(v);
            }
        }
    }
}