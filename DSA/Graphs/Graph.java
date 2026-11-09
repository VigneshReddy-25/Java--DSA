package Graphs;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class Graph {
    int adjMatrix[][];
    int vertices;

    public Graph(int vertices){
        this.vertices=vertices;
        adjMatrix=new int[vertices+1][vertices+1];
    }
    public  void addEdge(int i,int j){
        adjMatrix[i][j]=1;
        adjMatrix[j][i]=1;
    }
    public void removeEdge(int i,int j){
        adjMatrix[i][j]=0;
        adjMatrix[j][i]=0;
    }
    public void addVertex() {
        int newAdjMatrix[][] = new int[vertices+1][vertices+1];
        for(int i=0;i<vertices;i++){
            for(int j=0;j<vertices;j++){
                newAdjMatrix[i][j]=adjMatrix[i][j];
            }
            adjMatrix=newAdjMatrix;
            vertices++;
        }
    }
    public void removeVertex(int v){
        int newAdjMatrix[][] = 
    }
    public void bfsSearch(int start) {
		Queue<Integer> q=new LinkedList<>();
		Set<Integer> vis=new HashSet<>();
		q.add(start);
		vis.add(start);
		while(!q.isEmpty()) {
			int curr=q.poll();
			System.out.println(curr+"  ");
			
			for(int i=0;i<vertices;i++) {
				if(adjMatrix[curr][i]==1 && !vis.contains(i)) {
					q.add(i);
					vis.add(i);
				}
			}
		}
		
	}
    public void display() {
        for(int i=0;i<vertices;i++){
            for(int j=0;j<vertices;j++){
                System.out.println(adjMatrix[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Graph g=new Graph(5);
        g.addEdge( 0,1);
        g.addEdge(0, 2);
        g.addEdge(1, 3);
        g.addEdge(2, 3);
        g.addEdge(2, 4);
        System.out.println("Display the details of the graph");
    }
}
