import java.util.Scanner;

public class ejecutor {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el numero de elemetos ");
        int x = teclado.nextInt();
        int [] miarreglo = new int[x];
        modelo.importar(miarreglo);
        System.out.println("se presenta el arreglo");
        modelo.presentar(miarreglo);
        System.out.println("Cual desea buscar");
        int y = teclado.nextInt();
        modelo.busquedaSeleccion(miarreglo,x);
        System.out.println("El numero se encuentra en la poscion: "+ modelo.busquedaSeleccion(miarreglo,y));
        System.out.println("Ingrese cual desea eliminar:");
        int z = teclado.nextInt();
        modelo.eleminar(miarreglo,z);
        modelo.presentar(miarreglo);

    }

}
