//Este programa mostrara la Tabla de multiplicar del numero introducido por el usuario.
import java.util.Scanner;

public class tabla {
    public static void main(String[] args) {
        //Creamos el lector, una variable y pedimos el valor para hacer la tabla de multiplicar.
        Scanner letura = new Scanner(System.in);
        int num;
        System.out.print("Escribe un numero: ");
        num = letura.nextInt();
        for (int i = 1; i <= 20; i++){
            System.out.printf("%d x %d = %d\n",num,i,num * i);
        }
    }
}
