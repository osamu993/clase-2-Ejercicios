/**
 * Ejercicio1
 */
public class Ejercicio1Operacion {

    public static void main(String[] args) {
        
        int resultado = 6 / 2 * (1 + 2);
        System.out.println("El resultado es: " + resultado);

        //¿Cuál es el resultado correcto de la operación? ¿1 ó 9?
        //R: el resultado correcto es 9
        // la otra calculadora genera otro resultado porque la evaluacion sigue el
        //orden de las operaciones :
        // resuelve primero el parentesis 1+2=3
        //la operacion se convierte en 6/2*3
        //Como las operaciones de división y multiplicación tienen la misma precedencia, se evalúan de izquierda a derecha:
        //6/2=3
        //3*3=9
        //para que el resultado sea 1 se tiene que hacer lo siguiente:

        int resultado1 = 6 / (2*(1+2));
        System.out.println("El resultado es: " + resultado1);


    
    



    }
}