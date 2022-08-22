package algorithm.four;

import java.util.ArrayList;
import java.util.List;

public class Node {
	int info; 					// 정점에 대응된 데이터
	boolean visited;			// 방문 여부
	// List 사용 이유는 한 노드가 여러 노드와 연결될 수 있기 때문에 리스트를 사용(여러 링크를 관리)
	List<Node> neighbours;		// 정점에 인접한 정점들의 연결 목록

	public Node(int info) {
		this.info = info;
		this.visited = false;
		this.neighbours = new ArrayList<>();
	}
	
	public void addNeighbours(Node neighboursNode) {
		this.neighbours.add(neighboursNode);
	}
	
	public int getInfo() {
		return info;
	}

	public void setInfo(int info) {
		this.info = info;
	}

	public boolean isVisited() {
		return visited;
	}

	public void setVisited(boolean visited) {
		this.visited = visited;
	}
	
	public List<Node> getNeighbours() {
		return neighbours;
	}
	
	public void setNeighbours(List<Node> neighbours) {
		this.neighbours = neighbours;
	}
	
	public String toString() {
		return "" + info;
	}
}
