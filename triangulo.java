import java.util.Scanner;
public class triangulo{
	public static void main(String [] arg){
		Scanner sc = new Scanner(System.in);
		int lado1,lado2,lado3,base,altura;
		System.out.print("digite el lado1 del triangulo: ");
		lado1 = sc.nextInt();
		System.out.print("digite el lado2 del triangulo: ");
		lado2 = sc.nextInt();
		System.out.print("digite el lado3 del triangulo: ");
		lado3 = sc.nextInt();
		System.out.print("digite la base del triangulo: ");
		base = sc.nextInt();
		System.out.print("digite la altura del triangulo: ");
		altura = sc.nextInt();
		System.out.println("\n\tArea y perimetro de un triangulo\n");
		System.out.println("El perimetro del triangulo es: "+(lado1+lado2+lado3));
		System.out.println("El area del triangulo es:"+(base*altura));
	}
}
