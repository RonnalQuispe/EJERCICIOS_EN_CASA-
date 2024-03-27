package ejrcicio4;

import javax.swing.JOptionPane;

public class Ejrcicio4 {

    public static void main(String[] args) {
        double nota1 = 0, nota2 = 0, nota3 = 0;
        int notas;
        notas = Integer.parseInt(JOptionPane.showInputDialog("ingrese la cantidad d e notas:"));

        for (int i = 0; i < notas; i++) {
            do {
                nota1 = Double.parseDouble(JOptionPane.showInputDialog("ingrese nota" + (i + 1)));
                if (nota1 < 0 || nota1 > 5) {
                    System.out.println("nota mal ingresada, ingrese una nota entre 0");
                }

            } while (nota1 < 0 || nota1 > 5);
            nota2 += nota1;// se almacena la notas ingresadas 
        }
        nota3 = nota2 / notas;

        System.out.println("la nota promedio es: " + nota3);

    }

}
