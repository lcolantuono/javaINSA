package binaryTree;

public class Node {
	int value;
	Node father;
	Node lhs;
	Node rhs;
	
	public Node(int value) {
		this.value = value;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	public Node getLhs() {
		return lhs;
	}
	public void setLhs(Node lhs) {
		this.lhs = lhs;
	}
	public Node getRhs() {
		return rhs;
	}
	public void setRhs(Node rhs) {
		this.rhs = rhs;
	}
	public Node getFather() {
		return father;
	}
	public void setFather(Node father) {
		this.father = father;
	}
	
}
