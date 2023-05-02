import java.util.Scanner;

public class modelo {
    public static void importar(int[]x){

        Scanner teclado = new Scanner (System.in);
        for (int i = 0; i < x.length; i++) {
            System.out.println("Posicion"+i+"  ");
            x[i]=teclado.nextInt();
        }
    }
    public static void presentar(int[]x){
        String coma = " ";
        for (int i = 0; i < x.length; i++) {
            System.out.print(coma+x[i]);
                    coma = ",";
        }
        System.out.println(" ");
    }
    public static int busquedaSeleccion (int[]x,int num){
        for (int i = 0; i < x.length; i++) {
            if(x[i]==num)
                return i;
        }
        return -1;
    }
    public static void eleminar (int[]x,int num){
        int pos =busquedaSeleccion(x,num);
        if (pos !=1){
            for (int i = pos; i <x.length ; i++) {
                x[i]=x[i+1];
            }
        }else
            System.out.println("Elemento no existe.....");
    }
}
