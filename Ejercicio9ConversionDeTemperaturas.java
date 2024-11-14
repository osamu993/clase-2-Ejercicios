import java.util.Scanner;

public class Ejercicio9ConversionDeTemperaturas {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la temperatura en grados celsius: ");
        var celsius = scanner.nextInt();

        var fahrenheit = celsius * 9 / 5 + 32;
        var kelvin = celsius + 273.15;

        System.out.println("Temperatura en fahrenheit " + fahrenheit);
        System.out.println("Temperatura en kelvin " + kelvin);



        scanner.close();

    

    
    }
}
