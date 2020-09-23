
public class Setup {
	// NOTE: This only makes binary trees, where each node has 2 children or none if it's a leaf.
	
	int depth = 4; // Tempt value until user interface is finished, this includes the root.
	int[] leafValues = {1,2,3,4,5,6,7,8}; // Make sure there are 2^(depth-1) values in this array
	
	double min;
	double max;
	
	double alpha = Double.NEGATIVE_INFINITY;
	double beta = Double.POSITIVE_INFINITY;
	
	MiniMax minimax = new MiniMax();
	
	minimax.BuildTree(depth, leafValues);
}