public class Calculator{
	public int addition(int a, int b){
		return a + b;
	}
	
	public static void main(String a[]){
		Calculator calculator = new Calculator();
		System.out.println("Projeto Calculadora");
		System.out.println("Addition 2 + 3 = "+calculator.addition(2,3));
	}
}
