import java.util.ArrayList;

public class Setup {
	// NOTE: This only makes binary trees, where each node has 2 children or none if it's a leaf.
	
	double alpha = Double.NEGATIVE_INFINITY;
	double beta = Double.POSITIVE_INFINITY;

	public static void main (String[] args) {
		int depth = 3; // Tempt value until user interface is finished, this includes the root.
		ArrayList LeafValues = new ArrayList<Integer>();
		LeafValues.add(1); // I
		LeafValues.add(2); // hate
		LeafValues.add(3); // arrays
		LeafValues.add(4); // in
		LeafValues.add(5); // java
		LeafValues.add(6);
		LeafValues.add(7);
		LeafValues.add(8);
		// Make sure there are 2^(depth-1) values in this array
		

		MiniMax minimax = new MiniMax();
		
		minimax.BuildTree(depth, LeafValues);
		
		int minimaxValue = minimax.SerachTree();
		
		System.out.println("MinMax value is: " + minimaxValue);
    }
	
}