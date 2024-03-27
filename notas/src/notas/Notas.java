package notas;
import javax.swing.JOptionPane;
import javax.swing.JOptionPane;

public class Notas {

    public static void main(String[] args) {
        double n1 = 0, n2 = 0, n3 = 0;
        double promedio;
        String nombre;
        int cantiest;
        cantiest = Integer.parseInt(JOptionPane.showInputDialog("ingrese"
                + " la cantidad de estudiantes"));
        for (int i = 0; i < cantiest; i++) {
            nombre = JOptionPane.showInputDialog("ingrese el nombre del estudiante " + (i + 1) + " ");
            do {
                n1 = Double.parseDouble(JOptionPane.showInputDialog("ingrese nota 1"));
                if (n1 < 0 ||n1 > 5) {
                    System.out.print("nota mal ingresada");
                System.out.println("ingrese una nota entre 0 y 5");
                }
                
            } while (n1 < 0 ||n1 > 5);
             do {
                n2 = Double.parseDouble(JOptionPane.showInputDialog("ingrese nota 2"));
             if (n2 < 0 ||n2 > 5) {
                    System.out.print("nota mal ingresada");
                System.out.println("ingrese una nota entre 0 y 5");
                }   
             } while (n2 < 0 || n2 > 5);
              do {
                n3 = Double.parseDouble(JOptionPane.showInputDialog("ingrese nota 3"));
                if (n3 < 0 ||n3 > 5) {
                    System.out.print("nota mal ingresada");
                System.out.println("ingrese una nota entre 0 y 5");
                }
            } while (n3 < 0 || n3 > 5);
               promedio = (n1 + n2 + n3) / 3;
        if (promedio >= 3) {
            System.out.println("EL ESTUDIANTE " + nombre + " PASA LA AMTERIA ");

        } else {
            System.out.println("el estudiante " + nombre + " pierde la materia ");
        }
        System.out.println("el promedio es: " + promedio);
        }

        
       
    }

}
