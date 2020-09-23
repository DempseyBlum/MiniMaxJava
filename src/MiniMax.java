import java.util.ArrayList;

public class MiniMax {
	// Builds a binary tree then performs a min max algorithm on it.
	Tree tree;
	int maxDepth;
	
	public void BuildTree(int depth, ArrayList<Integer> leafValues) {
		// This builds the tree by generating two children per node (up to the depth)
		this.maxDepth = depth;
		
		Node rootNode = new Node(true);
		
		Node childOne = BuildTree(false, 1, leafValues);
		Node childTwo = BuildTree(false, 1, leafValues);
		
		rootNode.setChildren(childOne, childTwo);
		
		tree = new Tree(rootNode);
	}
	
	public Node BuildTree(boolean isMaxNode, int currDepth, ArrayList<Integer> leafValues) {
		// The recusrive version of the above function.
		if (currDepth >= maxDepth) {
			Node node = new Node(isMaxNode);
			
			node.setValue(leafValues.get(0));
			
			if(leafValues.size() > 1) {
				leafValues.remove(0);
			}
			
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
	
	public int SerachTree() {
		// Begins the search of the binary tree, by getting the recursive value of the child nodes
		Node root = tree.root;
		int value;
		
		int childOneValue = SearchNode(root.childOne, 1);
		int childTwoValue = SearchNode(root.childTwo, 1);
		
		value = Math.max(childOneValue, childTwoValue);
		
		return value;
	}
	
	public int SearchNode(Node node, int currDepth) {
		// This gets the values by doing some recursive stuff.
		if(currDepth >= maxDepth) {
			return node.value;
		}
		
		int value;
		
		int childOneValue = SearchNode(node.childOne, currDepth+1);
		int childTwoValue = SearchNode(node.childTwo, currDepth+1);
		
		if (node.isMaxPlayer) {
			value = Math.max(childOneValue, childTwoValue);
		} else {
			value = Math.max(childOneValue, childTwoValue);
		}
		
		return value;
	}
	
}
