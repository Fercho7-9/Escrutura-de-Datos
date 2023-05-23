import java.util.Scanner;

public class Pila {
    public class  clasePilaArray{
        int[]PILA;
        int TOPE;
        int MAX;
        Scanner teclado = new Scanner(System.in);
        public  clasePilaArray(int MAX){
            this.TOPE = -1;
            this.MAX = MAX;
            this.PILA = new int [this.MAX];
        }

        public int getTOPE() {
            return TOPE;
        }

        public void VaciarPila() {
            this.TOPE = -1;
        }
        public boolean PilaLLena(){
            if (this.MAX-1==this.TOPE){
                return true;
            }else {
                return false;
            }
        }
        public boolean PilaVacia(){
            if(this.TOPE==-1){
                return  true;
            }else {
                return  false;
            }
        }
        public  void  InsertarPila(){
            if (this.PilaLLena()){
                System.out.println("pila llena");
            }
            else {
                int ITEM;
                System.out.println("Ingrese item a insertar");
                ITEM = teclado.nextInt();
                this.MAX++;
                this.PILA[this.TOPE]=ITEM;
                System.out.println("El item "+ITEM+"Se ha insertado");
            }
        }
        public void EliminarPila(){
                if (this.PilaVacia()){
                    System.out.println("Pila Vacia");
                }
                else {
                    int ITEM = this.PILA[this.TOPE];
                    this.TOPE--;
                    System.out.println("El item "+"se ha elmiminado");
                }
        }
        public void ImprimePila(){
            for (int i = 0; i <this.TOPE; i++) {
                System.out.println("EL arreglo es: "+i);
                System.out.println(this.PILA[i]+"\t");
            }
        }

    }
}
