package ordenamiento_insercion;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Ordenamiento_insercion {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int arreglo[];
        int elementos;
        int posicion;
        int aux;

        elementos = Integer.parseInt(JOptionPane.showInputDialog("ingrese el numero de elementos del arrglo"));

        arreglo = new int[elementos];

        System.out.println("ingrese el arreglo");
        for (int i = 0; i < elementos; i++) {
            System.out.print("ingrese el elemento " + (i + 1));
            arreglo[i] = entrada.nextInt();
        }

        //ordenamiento por insercion
        for (int i = 0; i < elementos; i++) {
            posicion = i;
            aux = arreglo[i];
            
            while((posicion>0) && (arreglo[posicion-1] > aux)){
                arreglo[posicion] = arreglo[posicion-1];
                posicion--;
            }
            arreglo[posicion] = aux;
        }
        
        //imprimir los elementos
        System.out.println("de forma creciente");
        for (int i = 0; i < elementos; i++) {
            System.out.print(arreglo[i]+"-->");
        }
        System.out.print("NULL\n");
        
        System.out.println("de forma decreciente");
        for (int i = elementos-1; i >= 0; i--) {
            System.out.print(arreglo[i]+"-->");
        }
        System.out.println("NULL");
    }

}
