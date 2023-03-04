package Lec_Grapg;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Graph {
//HashMap<V1,Nbr>
//	HashMap<V1,HashMap<V2,Edge Wt of V1 to V2>

	HashMap<Integer, HashMap<Integer, Integer>> HM;

	public Graph(int Total_Nodes) {
//		 TODO Auto-generated constructor stub
		HM = new HashMap<>();
		for (int i = 1; i <= Total_Nodes; i++) {
			HM.put(i, new HashMap<>());
		}
	}

	public void addEdge(int v1, int v2, int cost) {
//		v1 ke nbrs (v2,c)
		HM.get(v1).put(v2, cost);
//		v2 ke nbrs (v1,c)
		HM.get(v2).put(v1, cost);
	}

	public boolean containsEdge(int v1, int v2) {
		return HM.get(v1).containsKey(v2);
	}

	public int getEdge(int v1, int v2) {
		return HM.get(v1).get(v2);
	}

	public void removeEdge(int v1, int v2) {
		HM.get(v1).remove(v2);
		HM.get(v2).remove(v1);
	}

//	Number of edge ? 
	public int numOfEdges() {
		int ans = 0;
		for (int V : HM.keySet()) {
			ans = ans + HM.get(V).size();
		}
		return ans / 2;
	}

	public boolean hasPath(int src, int dest) {
		return hasPath(src, dest, new HashSet<Integer>());
	}

	private boolean hasPath(int src, int dest, HashSet<Integer> Visited) {
		if (src == dest) {
			return true;
		}
		if (Visited.contains(src)) {
			return false;
		}

		HashMap<Integer, Integer> Nbrs_HM = HM.get(src);
		Visited.add(src);
		boolean ans = false;
		for (int Nbr : Nbrs_HM.keySet()) {

			boolean sp = hasPath(Nbr, dest, Visited);
			ans = ans || sp;
		}
		return ans;
	}

	public void allPath(int src, int dest) {
		allPath(src, dest, "", new HashSet<>());
	}

	private void allPath(int src, int dest, String path, HashSet<Integer> Visited) {
		if (src == dest) {
			System.out.println(path + "-" + src);
			return;
		}
		if (Visited.contains(src)) {
			return;
		}
		HashMap<Integer, Integer> Nbrs_HM = HM.get(src);
		Visited.add(src);
		boolean ans = false;
		for (int Nbr : Nbrs_HM.keySet()) {
			allPath(Nbr, dest, path + "-" + src, Visited);
		}
		Visited.remove(src);
	}

	public void BFS(int src) {
		Queue<Integer> Q = new LinkedList<>();
		HashSet<Integer> Visited = new HashSet<>();
		Q.add(src);
		while (!Q.isEmpty()) {
			int curr = Q.poll();
			System.out.println(curr);
			if (Visited.contains(curr)) {
				System.out.println("CYCLE!!!!!!!");
				continue;
			}
			Visited.add(curr);

			for (int nbr : HM.get(curr).keySet()) {
				if (!Visited.contains(nbr)) {
					Q.add(nbr);
				}
			}

		}
	}

	public void BFT() {
		int num_comp = 0;
		HashSet<Integer> Visited = new HashSet<>();
		for (int V : HM.keySet()) {
			if (Visited.contains(V)) {
				continue;
			}
			num_comp++;
			Queue<Integer> Q = new LinkedList<>();
			Q.add(V);
			while (!Q.isEmpty()) {
				int curr = Q.poll();
				System.out.println(curr);
				if (Visited.contains(curr)) {
					System.out.println("CYCLE!!!!!!!");
					continue;
				}
				Visited.add(curr);

				for (int nbr : HM.get(curr).keySet()) {
					if (!Visited.contains(nbr)) {
						Q.add(nbr);
					}
				}
			}
		}
		System.out.println("num=" + num_comp);
	}

	class dijPair implements Comparable<dijPair> {
		public dijPair(int i, int j, String str) {
			V = i;
			cost = j;
			path = str;
		}

		int V;
		int cost;
		String path;

		@Override
		public int compareTo(dijPair o) {
			return this.cost - o.cost;
		}
	}

	public void Dijkstra(int src) {
		PriorityQueue<dijPair> Q = new PriorityQueue<>();
		Q.add(new dijPair(src, 0, "" + src));
		HashSet<Integer> Visited = new HashSet<>();
		while (!Q.isEmpty()) {
			dijPair curr = Q.poll();
			int V = curr.V;

			System.out.println(curr.V + " => " + curr.cost);

			Visited.add(V);
			for (int nbr : HM.get(V).keySet()) {
				if (!Visited.contains(nbr)) {
					int E = getEdge(V, nbr);

					Q.add(new dijPair(nbr, curr.cost + E, curr.path + " " + nbr));
				}
			}
		}

	}
	public int SSSP(int src, int dest) {
		return SSSP(src, dest, HM.size()-1);
	}
//	Bellman ford
	private int SSSP(int src, int dest, int n) {
//		
		if(src==dest) {
			return 0;
		}
		if(n==0) {
			return 9999999;
		}
		int sp = SSSP(src, dest, n - 1);
		for (int nbr : HM.get(src).keySet()) {
			int E = getEdge(src, nbr);
			int sp_nbr = E + SSSP(nbr, dest, n - 1);
			sp = Math.min(sp, sp_nbr);
		}
		return sp;
	}

}
