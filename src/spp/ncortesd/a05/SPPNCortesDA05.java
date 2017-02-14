/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp.ncortesd.a05;
import java.util.Scanner;
/**
 *
 * @author Alumno
 */
public class SPPNCortesDA05 {

/**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        solicitaEntero ("la edad");
        solicitaEntero("el año");
        
        solicitaDouble("el peso");
        solicitaDouble("la estatura");
                
      
        // TODO code application logic here
    }
    static int solicitaEntero (String mensaje){
        Scanner kb= new Scanner (System.in);
        int numero=0;
        boolean flag;
        do{
            System.out.println("Introduce"+ mensaje);
            try{
                numero= kb.nextInt();
                flag=true;
            }catch (Exception ex){
                flag=false;
                System.out.println("El numero insertado no es entero"+ex);
                kb.nextLine();
            }
        }while (flag==false);
        return numero;
    }
    
    static double solicitaDouble (Double mensaje){
        Scanner kb= new Scanner (System.in);
        double numero=0;
        boolean flag;
        do{
            System.out.println("Introduce"+ mensaje);
            try{
                numero=kb.nextInt();
                flag=true;
                
            }catch (Exception ex){
                flag=false;
                System.out.println("El número insertado no es decimal"+ex);
                kb.nextLine();
            }
        }while (flag==false);
        return numero;
    }
}
