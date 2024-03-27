package sumaarea;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Sumaarea {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String respuesta="";
        do {
            System.out.print("ingrese la base:");
        double base = in.nextDouble();
        System.out.print("ingrese la altura:");
        double altura = Double.parseDouble(in.next());
        double area = ((base * altura) / 2);
        System.out.println("el area del triangulo es :" + area);
         respuesta=JOptionPane.showInputDialog("ingrese -Si- si desea calcular ams areas ");
        } while (respuesta.equalsIgnoreCase("si"));
        

    }

}
