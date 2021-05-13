package ;

public class ExpressionTree {
	public String infix;
	public String posf;
	public Node r;
	
	public ExpressionTree(String in){
		infix = in;
	}
	
	public void convert(){
		Converter a = new Converter(infix);
		posf = a.toPostFix();
		posconvert(posf);
		System.out.println("converted to postfix:"+posf);
		
	}
	
	public Node posconvert(String x){
		String[] res = x.split(" ");
		ArrayStack<Node> stack = new ArrayStack<>();
		for (int i = 0; i<res.length;i++){
			if (res[i].matches("[0-9]*")){
				double result = Double.parseDouble(res[i]);
				Node s = new Node(Double.toString(result)+" ");
				stack.push(s);
			}else{
				Node right = stack.pop();
				Node left = stack.pop();
				Node y = new Node(res[i]+ " ",left,right);
				stack.push(y);
			}
		}
		r = stack.pop();
		return r;
	}

	public void prefix(){
		prefix(r);
		System.out.println("");
	}
	public void prefix(Node a){
		if(a!= null){
			System.out.print(a.element);
			prefix(a.leftChild);
			prefix(a.rightChild);
		}
	}
	
	public void infix(){
		infix(r);
		System.out.println("");
	}
	
	public void infix(Node a){
		if(a.leftChild == null && a.rightChild == null){
			System.out.print(a.element);
		}else{
			System.out.print("(");
			infix(a.leftChild);
			System.out.print(a.element);
			infix(a.rightChild);
			System.out.print(")");
		}
	}
	
	public void postfix(){
		postfix(r);
		System.out.println("");
	}
	
	public void postfix(Node a){
		if (a!= null){
			postfix(a.leftChild);
			postfix(a.rightChild);
			System.out.print(a.element);
		}
	}
}


