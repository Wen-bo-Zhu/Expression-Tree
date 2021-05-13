package ;
import java.util.Scanner;
public class Test {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		while (true){ // ask for subsequent infix expressions
		System.out.print("type your infix expression:");
		String in = input.next();
		ExpressionTree a = new ExpressionTree(in);
		a.convert();
		System.out.print("Prefix:");
		a.prefix();
		
		System.out.print("Infix:");
		a.infix();
		
		System.out.print("Postfix:");
		a.postfix();
		System.out.println(""); // better formatting
		}
	}
}
