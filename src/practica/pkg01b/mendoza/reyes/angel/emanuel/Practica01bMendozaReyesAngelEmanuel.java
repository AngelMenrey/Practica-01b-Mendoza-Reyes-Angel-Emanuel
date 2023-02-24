package practica.pkg01b.mendoza.reyes.angel.emanuel;

import java.util.Scanner;

public class Practica01bMendozaReyesAngelEmanuel {
    public static void main(String[] args) {
        
        int opc = 0;
        String color, Nombre;
        int PrecioBoleto, NumPasajeros, Registro, NumAsiento;
        
        Scanner leer = new Scanner(System.in);
         Tren tren = new Tren();
        
          
          do{
          System.out.println("1-INGRESAR DATOS DEL TREN");
          System.out.println("2-MOSTRAR DATOS DEL TREN");
          System.out.println("3-SALIR");
          
          opc = leer.nextInt();
               
              switch(opc){
              case 1:
                  System.out.println("INGRESE EL COLOR DEL TREN");
                  color = leer.next();
                  System.out.println("INGRESE PRECIO DEL  BOLETO");
                  PrecioBoleto = leer.nextInt();
                  System.out.println("INGRESE EL NUMERO DE PASAJEROS");
                  NumPasajeros = leer.nextInt();
                  System.out.println("INGRESE EL NOMBRE ");
                  Nombre = leer.next();
                  System.out.println("INGRESE REGISTRO ");
                  Registro = leer.nextInt();
                  System.out.println("INGRESE EL NUMERO DE ASIENTO");
                  NumAsiento = leer.nextInt();
                  break;
              case 2:
                  System.out.println("EL COLOR ES:  "+ tren.getColor());
                  System.out.println("EL PRECIO DEL BOLETO ES: "+ tren.getPrecioBoleto());
                  System.out.println("EL NUMERO DE PASAJEROS ES:  "+ tren.getNumPasajeros());
                  System.out.println("EL NOMBRES ES:  "+ tren.getNombre());
                  System.out.println("EL REGISTRO ES:  "+ tren.getRegistro());   
                  System.out.println("EL NUMERO DE ASIENTO ES: "+tren.getNumAsiento());
                  break;
           }
          }while(opc!=3);
          System.out.println("USTED A SALIDO DEL MENU");
    }
    
}
