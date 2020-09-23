import java.util.ArrayList;

public class MiniMax {
	// Builds a binary tree then performs a min max algorithm on it.
	Tree tree;
	int maxDepth;
	
	public void BuildTree(int depth, ArrayList<Integer> leafValues) {
		this.maxDepth = depth;
		
		Node rootNode = new Node(true);
		
		Node childOne = BuildTree(false, 1, leafValues);
		Node childTwo = BuildTree(false, 1, leafValues);
		
		rootNode.setChildren(childOne, childTwo);
		
		tree = new Tree(rootNode);
	}
	
	public Node BuildTree(boolean isMaxNode, int currDepth, ArrayList<Integer> leafValues) {
		if (currDepth >= maxDepth) {
			Node node = new Node(isMaxNode);
			
			node.setValue(leafValues.get(0));
			
			System.out.print(node.getValue());
			
			return node;
		}
		
		// Create node and it's children.
		Node node = new Node(isMaxNode);
		
		Node childOne = BuildTree(!isMaxNode, currDepth+1, leafValues);
		Node childTwo = BuildTree(!isMaxNode, currDepth+1, leafValues);
		
		node.setChildren(childOne, childTwo);
		
		return node;
		
	}
	
	public void SerachTree() {
		
	}

//	public boolean checkWin(Node node) {
//		Node childOne = node.getChildOne();
//		Node childTwo = node.getChildTwo();
//		
//		
//	}
	
}
