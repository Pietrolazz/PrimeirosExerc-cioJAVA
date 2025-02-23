import java.util.Scanner;

public class ex5 {
	
	public static void main(String[]agrs) {
		Scanner ler = new Scanner(System.in);
		double sm = 788.0, ss;
			
			System.out.println("Digite o seu salário: ");
		ss = ler.nextInt();
		if(ss < sm){
			System.out.println("Seu salário é menor que um mínimo, MELHORE!!");
		} else {
			ss = ss / sm;
			System.out.println("Vc tem a quantia de: " + ss + " salários mínimos");
		}
	}

}
