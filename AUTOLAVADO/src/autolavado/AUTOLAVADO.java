package autolavado;

import javax.swing.JOptionPane;

public class AUTOLAVADO {

    public static void main(String[] args) {
        final int anio = 2024;
        int tipo;
        int tipo2;

        int calculo = 0;
        int totalviejo = 0;
        double valorfinal = 0;
        do {

            String menu = "MENU AUTOSERVICIO\n";
            menu += "1. automovil\n";
            menu += "2. campero\n";
            menu += "3. camioneta\n";
            menu += "4. salir\n";
            menu += "Ingrese el tipo";
            String opciones = "";

            tipo = Integer.parseInt(JOptionPane.showInputDialog(menu));
            if (tipo >= 1 && tipo <= 3) {
                int modelo = Integer.parseInt(JOptionPane.showInputDialog("ingrese el "
                        + "modelo del auto"));//hace que se convierta de un texto ingresado a entero
                int antiguedad = anio - modelo;

                switch (tipo) {
                    case 1:

                        opciones += ("elija tipo de carro\n");
                        opciones += ("1. pequeño\n");
                        opciones += ("2. mediano\n");
                        opciones += ("3. de lujo\n");
                        tipo2 = Integer.parseInt(JOptionPane.showInputDialog(opciones));
                        if (tipo2 == 1) {
                            final int caso1 = 4;
                            if (antiguedad >= 8) {

                                System.out.println("EL modelo tiene mas de 8 años de antiguedad y tiene un aumento de 20%");
                                valorfinal = ((caso1 * 0.20) + caso1);
                                System.out.println("su valor a cancelar es: " + valorfinal);

                            } else {
                                System.out.println("su valor a cancelar es: " + caso1);
                            }

                        }
                        if (tipo2 == 2) {

                            final int caso1 = 5;
                            if (antiguedad >= 8) {

                                System.out.println("EL modelo tiene mas de 8 años de antiguedad y tiene un aumento de 20%");
                                valorfinal = ((caso1 * 0.20) + caso1);
                                System.out.println("su valor a cancelar es: " + valorfinal);

                            } else {
                                System.out.println("su valor a cancelar es: " + caso1);
                            }

                        }
                        if (tipo2 == 3) {
                            final int caso1 = 6;
                            if (antiguedad >= 8) {

                                System.out.println("EL modelo tiene mas de 8 años de antiguedad y tiene un aumento de 20%");
                                valorfinal = ((caso1 * 0.20) + caso1);
                                System.out.println("su valor a cancelar es: " + valorfinal);

                            } else {
                                System.out.println("su valor a cancelar es: " + caso1);
                            }
                        }
                        break;
                    case 2:
                        opciones += ("elija tipo de carro\n");
                        opciones += ("1. sencillo\n");
                        opciones += ("2. de lujo\n");
                        tipo2 = Integer.parseInt(JOptionPane.showInputDialog(opciones));
                        if (tipo2 == 1) {

                            final int caso1 = 5;
                            if (antiguedad >= 8) {

                                System.out.println("EL modelo tiene mas de 8 años de antiguedad y tiene un aumento de 20%");
                                valorfinal = ((caso1 * 0.20) + caso1);
                                System.out.println("su valor a cancelar es: " + valorfinal);

                            } else {
                                System.out.println("su valor a cancelar es: " + caso1);
                            }
                        }
                        if (tipo2 == 2) {

                            final int caso1 = 8;
                            if (antiguedad >= 8) {

                                System.out.println("EL modelo tiene mas de 8 años de antiguedad y tiene un aumento de 20%");
                                valorfinal = ((caso1 * 0.20) + caso1);
                                System.out.println("su valor a cancelar es: " + valorfinal);

                            } else {
                                System.out.println("su valor a cancelar es: " + caso1);
                            }
                        }

                        break;
                    case 3:
                        opciones += ("elija tipo de carro\n");
                        opciones += ("1. cabina sencilla\n");
                        opciones += ("2. doble cabina \n");
                        tipo2 = Integer.parseInt(JOptionPane.showInputDialog(opciones));
                        if (tipo2 == 1) {

                            final int caso1 = 6;
                            if (antiguedad >= 8) {

                                System.out.println("EL modelo tiene mas de 8 años de antiguedad y tiene un aumento de 20%");
                                valorfinal = ((caso1 * 0.20) + caso1);
                                System.out.println("su valor a cancelar es: " + valorfinal);

                            } else {
                                System.out.println("su valor a cancelar es: " + caso1);
                            }
                        }
                        if (tipo2 == 2) {

                            final int caso1 = 8;
                            if (antiguedad >= 8) {

                                System.out.println("EL modelo tiene mas de 8 años de antiguedad y tiene un aumento de 20%");
                                valorfinal = ((caso1 * 0.20) + caso1);
                                System.out.println("su valor a cancelar es: " + valorfinal);

                            } else {
                                System.out.println("su valor a cancelar es: " + caso1);
                            }
                        }

                        break;

                }

            } else {
                System.out.println("opcion mal ingresada, digite nuevamente");
                System.out.println("SI DESEA SALIR DIGITE ----4----");
            }

        } while (tipo != 4);

    }

}
