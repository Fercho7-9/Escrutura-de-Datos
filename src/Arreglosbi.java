import java.util.Scanner;

class Arreglosbi {

     public static void main(String[] args) {
         Scanner teclado = new Scanner(System.in);
         System.out.println("Ingrese las dimensiones");
         System.out.println("Filas");
         int filas = teclado.nextInt();
         System.out.println("Columnas");
         int columnas = teclado.nextInt();
         int [][] miMatrizB = new int[filas][columnas];
         for (int i = 0; i <miMatrizB.length;i++) {
             for (int j = 0; j <miMatrizB.length ; j++) {
                 System.out.println("Ingrese un dato"+i+j);
                 miMatrizB[i][j]  = teclado.nextInt();
             }
         }
         for (int i = 0; i <miMatrizB.length;i++) {
             for (int j = 0; j <miMatrizB.length ; j++) {
                 System.out.print(miMatrizB[i][j]+" ");
             }
             System.out.println();
       }
    }
}