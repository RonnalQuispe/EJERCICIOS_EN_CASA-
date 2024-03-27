package areas;

import java.util.Scanner;

public class Areas {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.print("ingrese la base:");
        double base=in.nextDouble();
        System.out.print("ingrese la altura:");
        double altura= Double.parseDouble(in.next()); 
        double area=((base*altura)/2);
        System.out.println("el area del triangulo es :"+area);
        
    }

}
