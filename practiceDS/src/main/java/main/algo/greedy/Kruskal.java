package main.algo.greedy;

public class Kruskal {
}


class Graph {
    class Edge implements Comparable<Edge> {
        int src, dest, weight;

        public int compareTo(Edge compareEdge) {
            return this.weight - compareEdge.weight;
        }

    }

    ;

    class Subset {
        int parent, rank;
    };
    int V,E;
    Edge edge[];
    Graph(int v, int e)
    {
        V = v;
        E = e;
        edge = new Edge[E];
        for(int i = 0;i< e; ++i)
        {
            edge[i] = new Edge();
        }
    }
}