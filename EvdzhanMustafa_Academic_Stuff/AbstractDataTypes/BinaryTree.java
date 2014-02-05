package mustafa.evdzhan.AbstractDataTypes;

public class BinaryTree {

	private TreeNode root;
	
	public boolean isEmpty() {
		return root == null;
	}
	public void addNode(int key,Object data) {
		TreeNode node = new TreeNode(key,data);
		
		if(root == null) {
			
			root = node;
			
		} else {
			
			TreeNode current = root;
			
			TreeNode parent;
			
			while (true) {
				
				parent=current;
				
				if(key < current.getKey()) {
					
					current = current.getLeft();
					
					if(current == null) {
						
						parent.setLeft(node);
						return;
					}
					
			  } else {
				  
					current = current.getRight();
					
					if( current == null) {
						
						parent.setRight(node);
						return;
					}
						
						
					}
				}
			}
		}
	
    public void orderTraverse(TreeNode node) {
    	if(node != null) {
    		
    		orderTraverse(node.getLeft());
    		
    		System.out.println(node.toString());
    		
    	    orderTraverse(node.getRight());
    	
    	
    	}
    }
    public void preOrderTraverse(TreeNode node) {
    	if(node != null) {
    		
    		System.out.println(node.toString());
    		
    		preOrderTraverse(node.getLeft());
    		
    	    preOrderTraverse(node.getRight());
    	
    	 }
    }
    public void postOrderTraverse(TreeNode node ) {
if(node != null) {
	
    		preOrderTraverse(node.getLeft());
    		
    	    preOrderTraverse(node.getRight());
    	    
    	    System.out.println(node.toString());
    	
    	 }
    }

    public TreeNode getRoot(){
    	return root;
    }

    public TreeNode find(int key){
    	TreeNode current = root;
    	
    	while(current.getKey() != key) {
    		if(key < current.getKey()) {
    		current = current.getLeft();
    		} else {
    	    current = current.getRight();
    		}
    		if(current == null) {
        		return null;
        	}
    	}
    	
    	return current;
    }

}
	

