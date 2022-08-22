package algorithm.four;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BreadthFirstSearch {
	private Queue<Node> queue;
	
	public BreadthFirstSearch() {
		queue = new LinkedList<Node>();
	}
	
	public void BFS(Node v) {
		v.setVisited(true);
		queue.add(v);
		
		while(!queue.isEmpty()) {
			Node element = queue.remove();
			System.out.print(element.getInfo() + " ");
			
			List<Node> neighbours = element.getNeighbours();
			
			for(int i = 0; i < neighbours.size(); i++) {
				Node w = neighbours.get(i);
				
				if(w != null && !w.visited) {
					w.setVisited(true);
					queue.add(w);
				}
			}
		}
	}
	
	public static void main(String[] args) {
		Node node1 = new Node(1);
		Node node2 = new Node(2);
		Node node3 = new Node(3);
		Node node4 = new Node(4);
		Node node5 = new Node(5);
		Node node6 = new Node(6);
		
		node1.addNeighbours(node2);
		node1.addNeighbours(node3);
		node1.addNeighbours(node5);
		node2.addNeighbours(node1);
		node2.addNeighbours(node3);
		node3.addNeighbours(node1);
		node3.addNeighbours(node2);
		node3.addNeighbours(node4);
		node3.addNeighbours(node5);
		node4.addNeighbours(node3);
		node4.addNeighbours(node6);
		node5.addNeighbours(node1);
		node5.addNeighbours(node3);
		node6.addNeighbours(node3);
		node6.addNeighbours(node4);
		
		BreadthFirstSearch bfsExample = new BreadthFirstSearch();
		
		System.out.println("너비 우선 탐색 실행 결과");
		bfsExample.BFS(node1);
	}
}
