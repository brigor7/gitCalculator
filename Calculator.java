public class Calculator{
	public int addition(int a, int b){
		return a + b;
	}
	
	public double addition(double a, double b){
		return a + b; //outro comentario
	}
	
	public static void main(String a[]){
		Calculator calculator = new Calculator();
		System.out.println("Projeto Calculadora");
		System.out.println("Addition 2 + 3 = "+calculator.addition(2,3));
		System.out.println("Addition 2.5 + 3.5 = "+calculator.addition(2.5,3.5));
	}
}
