package algorithm.four;

import java.util.List;

public class DepthFirstSearch {
	public static void DFS(Node node) {
		System.out.print(node.getInfo() + " ");
		
		node.setVisited(true);
		
		List<Node> neighbours = node.getNeighbours();
		
		for(int i = 0; i < neighbours.size(); i++) {
			Node w = neighbours.get(i);
			if(w != null && !w.visited)
				DFS(w);
		}
	}
	
	public static void main(String[] args) {
		Node[ ] node = new Node[6];
		
		for(int i = 0; i < 6; i++)
			node[i] = new Node(i + 1);
		
		node[0].addNeighbours(node[1]);
		node[0].addNeighbours(node[2]);
		node[0].addNeighbours(node[4]);
		node[1].addNeighbours(node[0]);
		node[1].addNeighbours(node[2]);
		node[2].addNeighbours(node[0]);
		node[2].addNeighbours(node[1]);
		node[2].addNeighbours(node[3]);
		node[2].addNeighbours(node[4]);
		node[3].addNeighbours(node[2]);
		node[3].addNeighbours(node[5]);
		node[4].addNeighbours(node[0]);
		node[4].addNeighbours(node[2]);
		node[5].addNeighbours(node[2]);
		node[5].addNeighbours(node[3]);
		
		System.out.println("재귀를 사용한 깊이 우선 탐색 실행 결과");
		DFS(node[0]);
	}
}
