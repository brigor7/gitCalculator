public class Application{
	public static void main(String a[]){
		Calculator calculator = new Calculator();
		System.out.println("Projeto Calculadora");
		System.out.println("Addition 2 + 3 = "+calculator.addition(2,3));
		System.out.println("Addition 2.5 + 3.5 = "+calculator.addition(2.5,3.5));
	}
}