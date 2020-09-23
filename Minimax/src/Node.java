import java.util.List;

public class Node {
	int value;
	boolean isMaxPlayer;
	List<Node> children;
	
	public Node( int value, boolean isMaxPlayer, List<Node> children) {
		this.value = value;
		this.isMaxPlayer = isMaxPlayer;
		this.children = children;
	}
	
	public int getValue() {
		return value;
	}
	
	public boolean getIsMaxPlayer() {
		return isMaxPlayer;
	}
	
	public List<Node> getChildren() {
		return children;
	}
	
	public void setValue(int value) {
		this.value = value;
	}
	
	public void setIsMaxPlayer(boolean isMaxPlayer) {
		this.isMaxPlayer = isMaxPlayer;
	}
	
	public void setChildren(List<Node> children) {
		this.children = children;
	}
}
