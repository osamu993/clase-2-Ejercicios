import java.util.Scanner;

public class Ejercicio8AreaYPerímetroDeUnRectangulo {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la longitud");
        var longitud = scanner.nextInt();

        System.out.print("Ingrese el ancho");
        var ancho = scanner.nextInt();

        var area = longitud * ancho;
        var perimetro = longitud + longitud + ancho + ancho;

        System.out.println("El area del rectangulo es: " + area);
        System.out.println("El perimetro del rectangulo es: " + perimetro);

        scanner.close();

    }
}
