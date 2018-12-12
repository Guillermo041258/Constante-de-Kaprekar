/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constantedekaprekar;

 import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author USER
 */
public class ConstantedeKaprekar {

   public static void main(String[] args) {
      
      Scanner entrada = new Scanner(System.in);

      int numeroCasos =0;
      
      while (numeroCasos == 0) {
         String numero;
         String digito;
         int contador;
         
   
         System.out.println("Dame un numero");
         numero = entrada.nextLine();
         
         contador = numero.length();
         
         if(contador == 4){
         
         int  n;
         
         for (n = 0; ! numero.equals("6174"); n++) {
            
    
          char[] arreglo = numero.toCharArray();
            Arrays.sort(arreglo);
            numero = String.valueOf(arreglo);
            digito = numero;
        
            digito = invertirCadena(digito);
            
            int diferencia = Integer.parseInt(digito) - Integer.parseInt(numero);
            System.out.println(Integer.parseInt(digito) - Integer.parseInt(numero));
            
         // esto es en caso de que la resta de 0
            if (diferencia == 0) {
                  n = 8;
               System.out.print("Tu numero da 0");
         
            }
       
            numero = Integer.toString(diferencia);
         }
         System.out.println( "numero de iteraciones " + n);
         
       
      }
     else
     {
      System.out.println("Por favor verifica que tu numero no tenga más de 4 digitos o lo contrario");
      numeroCasos = 1;
      
     }
      
      }
   
   }
   
   private static String invertirCadena(String cadena) {
      String cadenaInvertida = "";
      
      // esto es para recorrer la cadena
      for (int i = cadena.length() - 1; i >= 0; i--) {
         cadenaInvertida += cadena.charAt(i);
      }
      return cadenaInvertida;
   }
}
  

  
  
  
  
  
  
  
  
         
        
    
    


