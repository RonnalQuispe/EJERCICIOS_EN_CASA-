package aplic;

// import java.util.Scanner;
import java.util.Scanner;

public class Aplic {

    public static void main(String[] args) {
        //TIENDA
        int ventas[] = new int[5];
        int i;
        int k = 0;
        int total = 0;

        //fin variables
        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese las 5 ventas del mes ");
        for (i = 0; i < ventas.length; i++) {
            System.out.println("ingrese la venta " + (i + 1));
            ventas[i] = sc.nextInt();
        }
        System.out.println("las ventas que superan los 200 son :");
        while (k < 5) {
            if (ventas[k] > 200) {
                
                System.out.println("Dia:"+(k+1)+" con la venta de: "+ventas[k]);
                total++;//calcula la cantidad del dia mayo a 200               
            }
            k++;
        }
        System.out.println("los dias que superan los 200 son: " + total);

    }
}
