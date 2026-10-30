/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio_pilas;

import java.util.Scanner;

public class Ejercicio_pilas {

    public static void main(String[] args) {
       
        Scanner teclado=new Scanner(System.in);
        int[]pila=  new int[5];
        
        int tope=-1;
        int opcion;
        
        do {
            System.out.println("\n -- pila con arreglo");
            System.out.println("\n 1. Agregar un numero a la pila ");
            System.out.println("\n 2. restirar un numero de la pila ");
            System.out.println("\n 3. mostrar la pila");
            System.out.println("\n 4. Mostrar el tope");
            System.out.println("\n 5. Salir");
            System.out.println("\n 6.opcion");
            opcion=teclado.nextInt();
            
            switch(opcion){
                case 1:
                    if(tope== pila.length-1){
                        System.out.println(" hey bro la pila esta llena");
                   }else{
                     System.out.println("hey bro agrega un numero a la pila");
                     int numero =teclado.nextInt();
                     tope++;
                     pila[tope]=numero;
                     
                    }
                    break;
                case 2:
                    if(tope==-1){
                       System.out.println(" hey bro la pila esta vacia"); 
                    }else{
                        System.out.println(" retirar"+  pila[tope]); 
                        tope--;
                    }
                    break;
                case 3:
                      if(tope==-1){
                        System.out.println(" hey bro la pila esta vacia"); 
                    }else{
                       for(int i=tope; i>=0 ; i--){
                         System.out.println("pila"+  pila[i]); 
                       }
                    }
                     break;
                case 4:
                    if(tope==-1){
                       System.out.println(" hey bro la pila esta vacia"); 
                    }else{
                        System.out.println(" esta:" + +  pila[tope]); 
                    }
                    break;
                case 5:
                     System.out.println("fin del programa"); 
                 
                    break;
                default:
                 System.out.println("opcion invalida"); 
          }
        }while(opcion!=5);
        teclado.close();
  
    }
}
