
package ipc1.tarea3_201700584;

import java.util.Scanner;


public class Tarea3ContadorDigitos {
    
     public void Menu2(){
        // Aqui se pedira ingresar un numero entero el cual sera evaluado y se mostrar el numero de digitos que posee
        Scanner entrada = new Scanner(System.in);
        int Op2doMenu;
        float a=0;
        int DigNum = 0;
          
        do{
            System.out.println();
            System.out.println("CONTADOR DE DIGITOS");
            System.out.println("1. Ingresar número");
            System.out.println("2. Mostrar número de dígitos");
            System.out.println("3. Menú principal");
            System.out.println();
            System.out.print("Elija una opción: ");
            Op2doMenu = entrada.nextInt();
                
            switch(Op2doMenu){
   
                case 1:
                /*Se le pide al usuario que ingrese un numero y se almacena en una variable siempre y cuando cumpla con que
                debe se mayor a 0 y menor a 100000 de lo contrario no se aceptara el numero*/
                    System.out.println("Ingrese un numero");
                    a = entrada.nextFloat();
                        
                    if (a > 0 && a <= 100000){
                            
                        System.out.println("Número guardado");
                        
                    }else{
                        
                        System.out.println("El número no es valido");
                        a = 0;
                   }
                    
                    Enter();
                    //Se llama al metodo Enter el cual pausara el texto hasta que se presione la tecla Enter
                break;
            
                case 2:
                /*Se evalua el numero ingresado dividiendolo dentro de 10 para ir quitando unidades, cada vez que se
                    haga esta operación el contador de digitos aumentara en 1 hasta que el numero ingresado sea menor a 1*/
                        
                    if (a > 0){
                        
                        while(a>=1){
                                
                            a=a/10;
                            DigNum= DigNum + 1;
                            
                        }
                            
                    System.out.println("El numero tiene: "+DigNum+" Digitos");
                        
                        
                    }else{
                        
                        System.out.println("El numero que ingreso no es valido");
                            
                    }
                    
                    Enter();
                    //Se llama al metodo Enter el cual pausara el texto hasta que se presione la tecla Enter
                        
                break;
                
                case 3:
                break;
                    
                default:
                break;
            }  
        }while(Op2doMenu !=3);
    }
    
     public void Enter(){
        /*Se crea un metodo que permite pausar el texto impreso en pantalla hasta que se presione la tecla "Enter"*/
        
        System.out.println();
        System.out.println("Presione Enter para continuar");
        Scanner $enter = new Scanner(System.in);
        $enter.nextLine();
    }
    
}
