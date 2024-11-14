public class Ejercicio5CuantoTeHaCostadoElOrdenador {
    
    public static void main(String[] args) {
        
        var precioOrdenador = 660;
        var descuento = 10;

        var descuento1 = (precioOrdenador * descuento) /100;
        var valorApagar = precioOrdenador - descuento1;

        System.out.println("El valor a pagar es " + valorApagar + " Euros");
    
    }
}
