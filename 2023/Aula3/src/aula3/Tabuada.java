package aula3;
import java.util.Scanner;
public class Tabuada {
	public static void main(String args[]) {
		Scanner leitor = new Scanner(System.in);
		int n;
		System.out.println("Digite um numero:");
		n = leitor.nextInt();
		if(n==0) {
			System.out.println("Digite um número diferente de 0");
		} else {
			for(int i=1; i<=5; i++) {
				System.out.println(n+ " x "+ i+ " = "+ n*i);
			}
			System.out.println("\n");
			for(int i = 6; i<=10; i++) {
					System.out.println(n+ " x "+ i+ " = "+ n*i);
			}
		}
	}
}
