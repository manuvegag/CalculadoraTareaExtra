/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;
import java.util.Scanner;
/**
 *
 * @author manue
 */
public class Calculadora {
    
           
    public static void main(String[] args) {
        
       Scanner Te = new Scanner (System.in);
       int num1 = 0;
       int num2 = 0;
       System.out.println("Escriba el signo de la operacion que desea realizar en su calculadora");
       
       System.out.println("+ SUMA");
       System.out.println("- RESTA");
       System.out.println("* MULTIPLICACION");
       System.out.println("/ DIVISION");
       char opcion = Te.next().charAt(0);
       
       switch (opcion){
           case '+':
               System.out.println("Suma");
               System.out.println("Ingrese el primer valor");
               num1= Te.nextInt();
               System.out.println("Ingrese el segundo valor");
               num2 = Te.nextInt();
               System.out.println("El resultado es: "+ (num1+num2));
            break;
            
           case '-':
               System.out.println("Resta");
               System.out.println("Ingrese el primer valor");
               num1= Te.nextInt();
               System.out.println("Ingrese el segundo valor");
               num2 = Te.nextInt();
               System.out.println("El resultado es: "+ (num1-num2));
             break;
             
           case '*':
               System.out.println("Multiplicacion");
               System.out.println("Ingrese el primer valor");
               num1= Te.nextInt();
               System.out.println("Ingrese el segundo valor");
               num2 = Te.nextInt();
               System.out.println("El resultado es: "+ (num1*num2));
             break;
             
           case '/':
               System.out.println("Division");
               System.out.println("Ingrese el primer valor");
               num1= Te.nextInt();
               System.out.println("Ingrese el segundo valor");
               num2 = Te.nextInt();
               if (num2 > 0){
                   System.out.println("El Resultado es: "+ (num1/num2));
               }else {
                   System.out.println("No se puede dividir entre cero");
               }
               System.out.println("El resultado es: "+ (num1/num2));
             break;
             
     
             
                   
       }
      
    }
    
}
