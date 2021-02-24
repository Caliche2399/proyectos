
package Ruleta;

import static java.lang.System.exit;
import java.util.Scanner;

/**
 *
 * @author carlos
 */
public class Ruleta {
    
    //metodo principal
    
    public static void main(String[] args) {
        
        //definicion de variables
        Scanner objInput = new Scanner(System.in);
        String strContinuar = null;
        String strContinuarApuesta = null;
                         
                //Definir variables de operaciones
                int creditos = 100;
                int[] intArrNumeros = new int [2];
                String[] strArrColores =  new String [2];
                
                //Menu
                System.out.println("--Bienvenido a Casino Royal--");
                System.out.println("1. Apostar en ruleta (10 CREDITOS)");
                System.out.println("2. Salir");
                System.out.println("Elija una opcion...");
                
                //Recibir el buffer
                String strOpcion = objInput.nextLine();

                
                //Definir variables de error
                boolean blnError = true;
                
                switch(strOpcion){
                    case "1":
                        
                        do{
                            System.out.println("Sus creditos son:" + creditos);

                            System.out.println("Ingrese el numero de su apuesta (1 al 10)pares son negros impares son blancos:");
                            intArrNumeros[0]=objInput.nextInt();                            
                            intArrNumeros[1]= (int)(Math.random() * 10) + 1;
                            
                            //If para definir colores
                            if(intArrNumeros[0]%2!=0){
                                strArrColores[0] = "Negro";
                            }else{
                                strArrColores[0] = "Blanco";
                            }
                            
                            if(intArrNumeros[1]%2!=0){
                                strArrColores[1] = "Negro";
                            }else{
                                strArrColores[1] = "Blanco";
                            }
                            
                            //Presentacion de datos
                            System.out.println("Su apuesta:" +intArrNumeros[0]+ "," + strArrColores[0]);
                            System.out.println("Apuesta de la mesa:" +intArrNumeros[1]+ "," + strArrColores[1]);
                            
                            //declaracion de if para calculos de la apuesta
                            if (intArrNumeros[0] == intArrNumeros[1] && strArrColores[0].equals(strArrColores[1])){
                         
                                creditos = creditos + (intArrNumeros[0]*6); 
                                
                                System.out.println("Felicidades Ha Ganado 6 veces su apuesta!!! sus nuevos creditos son:" +creditos);
                                
                            }else if (strArrColores[0].equals(strArrColores[1])){
                            
                                creditos = creditos + (intArrNumeros[0]*2);
                                System.out.println("Felicidades Ha Ganado El Doble!!! sus nuevos creditos son:" +creditos);
                                
                            }else if (intArrNumeros[0] == intArrNumeros[1]){
                            
                                creditos = creditos + (intArrNumeros[0]*3);
                                System.out.println("Felicidades Ha Ganado El Triple!!! sus nuevos creditos son:" +creditos);
                                
                            }else{
                            
                                creditos = creditos - intArrNumeros[0];
                                System.out.println("Chan chan chan has perdido sus nuevos creditos son:" +creditos);
                            }
                        

                            System.out.println("Desea Continuar apostando (S/N) ?");        
                
                            //Capturar el buffer para continuar apostando
                            Scanner objInput2 = new Scanner(System.in);
                            strContinuarApuesta = objInput2.nextLine();
                        
                        }while(strContinuarApuesta.equals("S")||strContinuarApuesta.equals("s"));
                        

                        //Fin del case
                    break;
                    
                    case "2":
                        exit(0);
                        break;
                    default:
                        //Error
                        blnError = true;
                        //sale del case
                
                }

    }
    
}
