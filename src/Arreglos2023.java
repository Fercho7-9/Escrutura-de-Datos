package Trabajo_Grupal;

import java.util.Scanner;

/**
 * autor UTPL
 * @ Eddy Fernando Ordoñez Cuenca
 * @Lennin Cuenca
 */

public class Arreglos2023 {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        int salida = 2;
        boolean inte = true;
        while (inte){
        System.out.println("Ingrese el numero de elementos en el arreglo");
        int arreglo= entrada.nextInt();
        int[] miarreglo=new int [arreglo];
        Metodos.insertar(miarreglo);
        Metodos.presentar1(miarreglo);
        System.out.println(" ");

        while (salida==2){
            System.out.println("Ingrese 1 para buscar");
            System.out.println("Ingrese 2 para eleminar");
            System.out.println("Ingrese 3 para si utlizar metodos de ordenamiento");
            System.out.println("Ingrese 4 para salir");
            int opc= entrada.nextInt();
            switch (opc){
                case 1 :
                    Metodos.presentar1(miarreglo);
                    System.out.println("Ingrese el numero que desea buscar");
                    int buscar= entrada.nextInt();
                    int no = Metodos.busquedaSeleccion(miarreglo,buscar);
                    if(no!=1){
                        System.out.println("El numero se encuentra en la posicion: "+Metodos.busquedaSeleccion(miarreglo,buscar));
                    }
                    else{
                        System.out.println("dato no valido ");
                        System.out.println(" ");
                    }break;

                case 2:
                    Metodos.presentar1(miarreglo);
                    System.out.println("Ingrese el numero a elimninar");
                    int eliminar= entrada.nextInt();
                    Metodos.eliminar1(miarreglo,eliminar);
                    Metodos.presentar1(miarreglo);
                    System.out.println(" ");
                    break;
                case 3 :
                    Metodos.presentar1(miarreglo);
                    System.out.println("Ingrese 1");
                    System.out.println("ORDENAMIENTO BURBUJA\n");
                    System.out.println("Ingrese 2");
                    System.out.println("ORDENAMIENTO SHELLSHORT");
                    int eleccion = entrada.nextInt();
                    if (eleccion == 1){
                        System.out.println("ORDENAMIENTO BURBUJA");
                        Metodos.brubuja(miarreglo);
                        Metodos.presentar1(miarreglo);
                    }else if (eleccion==2){
                        System.out.println("ORDENAMIENTO SHELLSHORT");
                        Metodos.shellSort(miarreglo);
                        Metodos.presentar1(miarreglo);
                    }else {
                        System.out.println("Elección Invalidad");
                    }
                    break;
                case 4:
                    salida=4;
                    inte = false;
                    break;

                 }
            }
        }
        System.out.print("Gracias  vuelva pronto");
    }
}









