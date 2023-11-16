package presentacion;

import com.sun.source.tree.TryTree;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EntradaDatos {
    public static void main(String[] args) {
        //Declaración de variables
        int dato;
        Scanner teclado= new Scanner(System.in);
        //Recibir un dato
        System.out.println("Escriba un dato numérico");
        try {
            dato = teclado.nextInt();
        }catch (InputMismatchException i1){
            System.out.println("El dato que se pidió fue numérico");
        }finally {
            System.out.println("Entra al finally");
        }


    }
}
