package calendario;

import javax.swing.JOptionPane;

public class Calendario {

    public static void main(String[] args) {
        int anio = 2024;
        int mesdeN, mes = 2;
        int diadeN, dias = 22;
        int tanios, tmeses, tdias;

        int aniodeN = Integer.parseInt(JOptionPane.showInputDialog("INGRESE EL AÑO DE NACIMIENTO"));
        do {            
        mesdeN = Integer.parseInt(JOptionPane.showInputDialog("INGRESE EL MES DE NACIMIENTO"));
            if (mesdeN<=0 || mesdeN>12) {
                System.out.println("MES MAL INGRESADO, DIGITE NUEVAMENTE  ");
            }
        } while (mesdeN<=0 || mesdeN>12);
        do {            
        diadeN = Integer.parseInt(JOptionPane.showInputDialog("INGRESE EL DIA DE NACIMIENTO"));
            if (diadeN<=0 || diadeN>31) {
                System.out.println("DIA MAL INGRESADO, DIGITE NUEVAMENTE  ");
            }
        } while (diadeN<=0 || diadeN>31);
              
        
        tanios = anio - aniodeN;
        tmeses = mes - mesdeN;
        tdias = dias - diadeN;
        if (tanios>=18) {            
            System.out.println("es mayor de edad");
        }else if (tanios==18 && tmeses>0) {
            System.out.println("es mayor de edad");
        } else if (tanios==18 && tmeses>0 && tdias>0) {
            System.out.println("es mayor de edad");
        } else{
            System.out.println("es menor de edad con: "+tanios+" "+tmeses+" "+tdias);}
        System.out.println(aniodeN + "/" + mesdeN + "/" + diadeN);
        
            
        
    }

}
