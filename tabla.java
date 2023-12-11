//Program ver. v1.1 (beta)
//Authors: Carlos Raúl Ochoa & Mario León Gómez
import java.util.Scanner;

public class tabla {
    public static void main(String[] args) {
        //Create reader object, variable, ask value, read value.
	Scanner letura = new Scanner(System.in);
        int num;
        System.out.print("Escribe un numero: ");
        num = letura.nextInt();
	//Working program loop (makes multiplication tables)
        for (int i = 1; i <= 20; i++){
            System.out.printf("%d x %d = %d\n",num,i,num * i);
        }
    }
}
