package ordenamiento_burbuja;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Ordenamiento_burbuja {

    public static void main(String[] args) {
        /*
        que es el metodo burbuja?
        funciona comparando los elementos con todos los elementos
        y cambiando la posicion si estan de forma equivocada
         */
        Scanner entrada = new Scanner(System.in);
        int arreglo[];
        int Elementos;
        int auxiliar;
        
        Elementos = Integer.parseInt(JOptionPane.showInputDialog("ingrese el numero de elementos"));
        arreglo = new int[Elementos];
        
        for (int i = 0; i < Elementos; i++) {
            System.out.print(" ingrese un numero"+(i+1));
            arreglo[i] = entrada.nextInt();
        }
        
        //METODO BURBUJA
        for (int i = 0; i < Elementos-1; i++){
            for (int j = 0; j < Elementos-1; j++) {
                if(arreglo[j] > arreglo[j+1]){ //si numero actual > numero siguiente 
                   auxiliar = arreglo[j];
                   arreglo[j] = arreglo[j+1];
                   arreglo[j+1] = auxiliar;
                }
            }
        }
        
        //Imprimir el arreglo de forma creciente
        System.out.println("forma creciente");
        for (int i = 0; i < Elementos; i++) {
            System.out.print(arreglo[i]+"-->");
        }
        System.out.print("NULL");
        System.out.println("\n");
        //Imprimir de forma decreciente
        System.out.println("forma decreciente");
        for (int i = Elementos-1; i >= 0; i--) {
            System.out.print(arreglo[i]+"-->");
        }
        System.out.print("NULL");
        
    }

}
