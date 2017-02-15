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
        
        solicitaDecimal ("tu peso");
        
        solicitaPalabra("primer nombre");
        
        solicitaNumeroLargo("el resultado de 589*9565");
        
        solicitaCaracter("letra del abecadrio");
                
      
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
    
    static double solicitaDecimal (String mensaje){
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
    static String solicitaPalabra (String mensaje){
        Scanner kb= new Scanner (System.in);
        String a="";
        boolean flag;
        do{
            System.out.println("Introduce"+ mensaje);
            try{
                a= kb.nextLine();
                flag=true;
                
            }catch (Exception ex){
                flag=false;
                System.out.println("No ha introducido una cadena de caracteres"+ex);
                kb.nextLine();
            }
        }while (flag==false);
        return a;
    }
    static long solicitaNumeroLargo(String mensaje){
        Scanner kb=new Scanner(System.in);
        long i=0;
        boolean flag;
        do{
            System.out.println("Introduce " +mensaje);
            try{
                i=kb.nextLong();
                flag=true;
            }catch(Exception ex){
                flag=false;
                System.out.println("El número insertado no es de long"+ex);
                kb.nextLine();
            }
        }while(flag==false);
        return i;
    }
    
    static char solicitaCaracter(String mensaje){
        Scanner kb=new Scanner(System.in);
        char i =0;
        boolean flag;
        do{
            System.out.println("Introduce "+mensaje);//podemos solicitar cualquier numero entero con indicacion de itroduce tal o cual cosa las veces que quieras
            try{
                i=kb.next().charAt(0);
                flag=true;
            }catch(Exception ex){
                flag=false;
                System.out.println("El dato insertado no es de tipo char "+ ex);
                kb.nextLine();
            }
        }while(flag==false);
        return i;
    }
    
}
