import java.util.Scanner;

public class Ejercicio7CalculadoraBasica {
     
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer numero: ");
        var numero1 = scanner.nextInt();

        System.out.print("Ingrese el segundo numero: ");
        var numero2 = scanner.nextInt();

        var suma = numero1 + numero2;
        var resta = numero1 - numero2;
        var multiplicacion = numero1 * numero2;
        var division = numero1 / numero2;

        System.out.println("suma: " + suma);
        System.out.println("resta: " + resta);
        System.out.println("multiplicacion: " + multiplicacion);
        System.out.println("division: " + division);

        scanner.close();


        
    }
}
