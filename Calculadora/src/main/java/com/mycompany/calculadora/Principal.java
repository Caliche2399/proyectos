
package com.mycompany.calculadora;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class Principal {
    
    //Metodo principal
    public static void main (String[]args){
    
        //Definicion de variables
        Scanner objInput = new Scanner(System.in);
        String strContinuar = null;
        
        do{
        
                System.out.println("Seleccione una opcion:");
                System.out.println("1. Suma");
                System.out.println("2. Restar");
                System.out.println("3. Multiplicar");
                System.out.println("4. Dividir");
                System.out.println("Elija una opcion...");
                
                //Recibir el buffer
                String strOpcion = objInput.nextLine();
                
                //Definir variables de operaciones
                float[] fltArrNumeros = new float [2];
                float fltResultado = 0;
                
                //Definir variables de error
                boolean blnError = true;
                
                switch(strOpcion){
                    case "1":
                        strOpcion = "Suma";
                        System.out.println(""+strOpcion);
                        
                        for (int i = 0; i<2;i++){
                            System.out.println("Ingrese el valor"+(i+1) + ":");
                            fltArrNumeros[i]=objInput.nextFloat();   
                        }
                        
                        fltResultado = fltArrNumeros[0] + fltArrNumeros[1];
                        
                        //control
                        blnError = false;
                        
                        //fin del case
                        
                    break;
                    
                    case "2":
                        strOpcion = "Resta";
                        System.out.println(""+strOpcion);
                        
                        for (int i = 0; i<2;i++){
                            System.out.println("Ingrese el valor"+(i+1) + ":");
                            fltArrNumeros[i]=objInput.nextFloat();   
                        }
                        
                        fltResultado = fltArrNumeros[0] - fltArrNumeros[1];
                        
                        //control
                        blnError = false;
                        
                        //fin del case
                        break;
                        
                    default:
                        //Error
                        blnError = true;
                        //sale del case
                
                }
                System.out.println("");
                
                //Despliegue de datos
                if(blnError ==false){
                    System.out.println("El resultado es:" + fltResultado);
                }else if(blnError ==true){
                    System.out.println("Error no se puede realizar la operacion");
                    
                }
                
                System.out.println("Desea Continuar (S/N) ?");        
                
            //Capturar el buffer para continuar
            Scanner objInput2 = new Scanner(System.in);
            strContinuar = objInput2.nextLine();
            
        } while(strContinuar .equals("s")|| strContinuar.equals("S"));
        
     
    }
}
