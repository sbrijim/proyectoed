package proyecto;
import java.util.Scanner;

public class Prueba1 {
	public static void main(String[] args) {
		int nota, nota2, nota3;
		double media;
		System.out.println("Introduce una nota: ");
		Scanner sc=new Scanner(System.in);
		nota=sc.nextInt();
		System.out.println("Introduce una nota: ");
		Scanner sc2=new Scanner(System.in);
		nota2=sc.nextInt();
		System.out.println("Introduce una nota: ");
		Scanner sc3=new Scanner(System.in);
		nota3=sc.nextInt();
		media=(nota+nota2+nota3)/3;
		
		if (media<5) {
			System.out.println("Has Supendido");
		}
		else if (media==5) {
			System.out.println("Has sacado Suficiente");
		}
		else if (media>=6 && media<=7) {
			System.out.println("Has sacado un Bien");
		}
		else if (media>=7 && media<=8) {
			System.out.println("Has sacado un Notable");
		}
		else if (media>=9 && media<=10) {
			System.out.println("Has sacado un Sobresaliente");
		}
		else {
			System.out.println("Error");
		}
	}
}