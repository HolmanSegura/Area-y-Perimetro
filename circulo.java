import java.util.Scanner;
public class circulo{
	public static void main (String [] arg){
		Scanner sc = new Scanner(System.in);
		int radio;
		System.out.print("digite el radio del circulo: ");
		radio = sc.nextInt();
		System.out.println("\n\tArea y Perimetro del circulo\n");
		System.out.println("\nEl area del circulo es: "+(3.1416*radio*radio));
		System.out.println("\nEl perimetro del circulo es: "+(2*3.1416*radio));
	}
}
