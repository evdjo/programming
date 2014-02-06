package abstractDataTypes;

public class BoundedStack{

    private Object[] stack;
	private int nextFree;
	private static int DEFAULT_MAX_SIZE=5;
	public BoundedStack() {
		this(DEFAULT_MAX_SIZE);
	}
	public BoundedStack(int SIZE) {
		stack = new Object[SIZE];
		nextFree=0;
	}
	public void push(Object object) {
		if(stack.length == nextFree) {
			throw new Error("Stack full.");
		}
		stack[nextFree++]=object;
	}
	public Object pop(){
		if(nextFree == 0) {
			throw new Error("Stack empty.");
		}
		return stack[--nextFree];
	}
	public int sizeOf(){
		return nextFree;
	}

}