import java.util.Scanner;

public class Principal {
	//função == método
	public static void main(String[] args) {
		/*
		Scanner leitor = new Scanner(System.in);
		System.out.println("Digite um valor");
		int num1 = leitor.nextInt();
		System.out.println("Digite outro valor");
		int num2 = leitor.nextInt();
		
		int media = (num1 + num2)/2;
		if(media >=6) {
			System.out.println("Aprovado");
		}else if(media < 6 && media >=1) {
			System.out.println("Exame");
		}else {
			System.out.println("Reprovado");
		}
		
		leitor.close();
		
		int num1 = 10;
		int num2 = 20;
		int num3 = 45;
		int media = (num1 + num2 + num3)/3;
		System.out.println("A média eh " + media);
		*/
		Scanner leitor = new Scanner(System.in);
		System.out.println("Digite o lado A do triangulo");
		float ladoA = leitor.nextFloat();
		System.out.println("Digite o lado B do triangulo");
		float ladoB = leitor.nextFloat();
		System.out.println("Digite o lado C do triangulo");
		float ladoC = leitor.nextFloat();
		System.out.println(ladoA + "" + ladoB + "" + ladoC );
		if(ladoA == ladoB && ladoB == ladoC) {
			System.out.println("O triangulo eh equilatero");
		}else if(ladoA != ladoB && ladoB != ladoC) {
			System.out.println("O triangulo eh Escaleno");
		}else {
			System.out.println("O triangulo eh Isósceles");
		}
	}
	
}
