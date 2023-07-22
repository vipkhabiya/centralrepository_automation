package project_1;

public class Expression1 {
	
	//(((((10+2)+2)-2)*2)/2)
	
	public int sum(int a, int b) {
		int c =a + b;
		return c;		
	}
	public int sub(int a, int b) {
		int c =a - b;
		return c;		
	}
	public int mul(int a, int b) {
		int c =a*b;
		return c;		
	}
	public void div(int a, int b) {
		int c =a/b;
		System.out.println("Result of Expresion (((((10+2)+2)-2)*2)/2) is " +c);
		
	}


	public static void main(String[] args) {
       Expression1 e= new Expression1();
       int sum1=e.sum(10,2);
       int sum2=e.sum(sum1,2);
       int sub1=e.sub(sum2,2);
       int mul1=e.mul(sub1, 2);
       e.div(mul1,2);
	}

}
