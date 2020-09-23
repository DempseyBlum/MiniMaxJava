import java.util.List;

public class Node {
	int value;
	boolean isMaxPlayer;
	Node childOne;
	Node childTwo;
	
	public Node(boolean isMaxPlayer) {
		this.isMaxPlayer = isMaxPlayer;
	}
	
	public int getValue() {
		return value;
	}
	
	public boolean getIsMaxPlayer() {
		return isMaxPlayer;
	}
	
	public Node getChildOne() {
		return childOne;
	}
	
	public Node getChildTwo() {
		return childTwo;
	}
	
	public void setValue(int value) {
		this.value = value;
	}
	
	public void setIsMaxPlayer(boolean isMaxPlayer) {
		this.isMaxPlayer = isMaxPlayer;
	}
	
	public void setChildren(Node childOne, Node childTwo) {
		this.childOne = childOne;
		this.childTwo = childTwo;
	}
}
