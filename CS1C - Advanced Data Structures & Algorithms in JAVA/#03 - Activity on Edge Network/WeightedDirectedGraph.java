/*****************************************************************
Project: Activity on Edge Network
Authur: Chi Hon Law, Man Yu Mandy Wong
 *****************************************************************/

import java.util.Arrays;
import java.util.List;

public class WeightedDirectedGraph {

	private int V;
	private int E;
	private int[][] adj;

	// Missing Code

	public WeightedDirectedGraph(int n) {
		V = n;
		E = 0;
		adj = new int[n][n];
		for (int i = 0; i < n; i++){
			for (int j = 0; j < n; j++){
				adj[i][j] = -1;
			}
		}
		// Missing Code

	}

	public void addEdge(int source, int target, int weight) {
		adj[source][target] = weight;
		E++;

		// Missing Code
	}

	public int getWeight(int source, int target) {
		// return -1; // Missing Code. return -1 in order to make the project
		// compile
		return adj[source][target];
	}

	public boolean isEdge(int source, int target) {
		// return false ;// Missing Code. return boolean
		// in order to make the project compile
		return (adj[source][target] != -1);
	}

	public int[] getSuccesors(int vertex) {
		// return null ; // Missing Code
		int[] succesors;
		int i = 0;
		for (int j = 0; j < V; j++) {
			if (isEdge(vertex, j))
				i++;
		}
		succesors = new int[i];
		i = 0;
		for (int j = 0; j < V; j++) {
			if (isEdge(vertex, j))
				succesors[i++] = j;
		}

		return succesors;

	}

	public int[] getPredecessors(int vertex) {
		// Missing Code

		int[] predecessors;
		int i = 0;
		for (int j = 0; j < V; j++) {
			if (isEdge(j, vertex))
				i++;
		}
		predecessors = new int[i];
		i = 0;
		for (int j = 0; j < V; j++){
			if (isEdge(j, vertex))
				predecessors[i++] = j;
		}
		return predecessors;
	}
}