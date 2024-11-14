import java.util.Scanner;

public class Ejercicio10MediaAritmetica {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer numero: ");
        var numero1 = scanner.nextInt();
        System.out.print("Ingrese el segundo numero: ");
        var numero2 = scanner.nextInt();
        System.out.print("Ingrese el tercer numero: ");
        var numero3 = scanner.nextInt();

        var media = (numero1 + numero2 + numero3) / 3;

        System.out.println("la media es: " + media);

        scanner.close();
    }
}
