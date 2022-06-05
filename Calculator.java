public class Calculator{
	public int addition(int a, int b){
		return a + b;
	}
	
	public double addition(double a, double b){
		return a + b; //return double
	}
	
	public static void main(String a[]){
		//causando um conflito merge
		Calculator calculator = new Calculator();
		System.out.println("Projeto Calculadora");
		System.out.println("Addition 2 + 3 = "+calculator.addition(2,3));
		System.out.println("Addition 2.5 + 3.5 = "+calculator.addition(2.5,3.5));
	}
}
