package numeronatural;

import javax.swing.JOptionPane;

public class Numeronatural {

    public static void main(String[] args) {
        double numero;
        double suma = 0;
        double sumatot = 0;
        String resp = "";
        do {

            do {
                numero = Double.parseDouble(JOptionPane.showInputDialog("ingrese el numero natural"));

                if (numero < 0) {
                    System.out.println("numero negativo");
                }
            } while (numero < 0);
            suma = (numero * (numero + 1)) / 2;
            System.out.println("la suma es " + suma);
            resp = JOptionPane.showInputDialog("ingrese SI para continuar");

        } while (resp.equalsIgnoreCase("si"));

    }

}
