import java.util.List;

public class Node {
	// It's a noode of a tree, contains two children or none if it's a leaf
	
	int value; // Only has a value if it is a leaf
	boolean isMaxPlayer;
	Node childOne; // Does not have a value if this node is a leaf
	Node childTwo; // Does not have a value if this node is a leaf
	
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
