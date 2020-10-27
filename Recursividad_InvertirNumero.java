
// Escribe una función recursiva que permita invertir un número. Ejemplo: Entrada: 123 Salida: 321

package recursividad_invertirnumero;

import java.util.Scanner;

public class Recursividad_InvertirNumero {
    
    //Metodo para invertir un numero
    public static int InvertirNumero(int numero, int posicion){
        if (numero < 10) {        //Nuestro primer numero va a ser mayor que 6  
            return numero;
        }else{
             return (numero % 10) * (int) Math.pow(10, posicion) + (InvertirNumero(numero/10, posicion-1));
        }
    }

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese un numero: ");
        int numero1 = leer.nextInt();
        System.out.println("Los numeros volteados son: "+InvertirNumero(numero1,2));
    }    
}