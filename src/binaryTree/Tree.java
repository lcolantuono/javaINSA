package binaryTree;

public class Tree {
	Node root;
	
    public Tree(){
    	
    }
    public Tree(int value) {
        this.root = new Node(value);
    }
    public Tree(Node root) {
        this.root = root;
    }
    public Node getRoot() {
        return root;
    }
    public void setRoot(Node root) {
        this.root = root;
    }
    
    private void addNode(Node node, Node root) {
        if (root == null){
        	root = node;
        }else{
            if (node.getValue() <= root.getValue()){
                addNode(node , root.getLhs());
            }else{
                addNode(node, root.getRhs());
            }
        }
    }
    
    public void addNode(Node node) {
        this.addNode(node , this.root);
    }
    
    public boolean removeNodo(Node node) {
        boolean hasRhs = node.getRhs() != null ? true : false;
        boolean hasLhs = node.getLhs() != null ? true : false;
        // Without children
        if (!hasRhs && !hasLhs) {
            return removeNodeWithoutChildren(node);
        }
        return false;
    }
    
    private boolean removeNodeWithoutChildren(Node node) {
    	Node left = node.getFather().getLhs();
    	Node right = node.getFather().getRhs();
 
        if (left == node) {
        	node.getFather().setLhs(null);;
            return true;
        }else if (right == node) {
        	node.getFather().setRhs(null);;
            return true;
        }else{
        	return false;
        }
    }
    
	public Node search(int value){
		Node n = new Node(2);
		return n;
	}
}
