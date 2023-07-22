package project_1;

public class Expression2 {
	//(((((10/2)-2)+2)-2)*2)
	
	public int div(int a, int b) {
		int c = a/b;
		return c;
	}
	public int sub(int a, int b) {
		int c = a-b;
		return c;
	}
	public int sum(int a, int b) {
		int c = a+b;
		return c;
	}
	public void mul(int a, int b) {
		int c = a*b;
		System.out.println("Result of Expresion (((((10/2)-2)+2)-2)*2) is " +c);
	}
	
	public static void main(String[] args) {
		Expression2 e2= new Expression2();
		int div=e2.div(10,2);
		int sub1=e2.sub(div,2);
		int sum=e2.sum(sub1,2);
		int sub2=e2.sub(sum,2);
		e2.mul(sub2,2);
		

	}

}
