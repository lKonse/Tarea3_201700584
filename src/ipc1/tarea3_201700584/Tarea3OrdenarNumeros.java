
package ipc1.tarea3_201700584;

import java.util.Scanner;


public class Tarea3OrdenarNumeros {
    
    public void Menu3(){
    /*En este menu se ingresaran 3 numeros y se ordenaran de mayor a menor*/
        Scanner entrada = new Scanner(System.in);
        int Op3erMenu;
        int n1 = 0;
        int n2 = 0;
        int n3 = 0;
                
        do{
            System.out.println();
            System.out.println("TRES NUMEROS DE MAYOR A MENOR");
            System.out.println("1. Ingresar números");
            System.out.println("2. Mostrar números ordenados");
            System.out.println("3. Menú principal");
            System.out.println();
            System.out.print("Elija una opción: ");
            Op3erMenu = entrada.nextInt();
                
            switch(Op3erMenu){
                case 1:
                /*Se pide que se ingresen los 3 numeros a evaluar y se almacenan en variables*/
                    System.out.println("Ingrese el primer numero");
                    n1 = entrada.nextInt();
                        
                    System.out.println("Ingrese el segundo numero");
                    n2 = entrada.nextInt();
                        
                    System.out.println("Ingrese el tercer numero");
                    n3 = entrada.nextInt();
                    
                    Enter();
                    //Se llama al metodo Enter el cual pausara el texto hasta que se presione la tecla Enter
                        
                break;
                        
                case 2:
                /*Los numero ingresados se evaluan y se ordenan de mayor a menor con sentencia if*/        
                    if (n1 >= n2 && n1 >= n3 && n2 >= n3){
                        System.out.println("Ordenados de mayor a menor son:");
                        System.out.println(n1);
                        System.out.println(n2);
                        System.out.println(n3);
                    
                    }else if(n1 >= n2 && n1 >= n3 && n3 >= n2){
                        System.out.println("Ordenados de mayor a menor son:");
                        System.out.println(n1);
                        System.out.println(n3);
                        System.out.println(n2);
                            
                    }else if(n2 >= n1 && n2 >= n3 && n3 >= n1){
                        System.out.println("Ordenados de mayor a menor son:");
                        System.out.println(n2);
                        System.out.println(n3);
                        System.out.println(n1);
                            
                    }else if(n2 >= n1 && n2 >= n3 && n1 >= n3){
                        System.out.println("Ordenados de mayor a menor son:");
                        System.out.println(n2);
                        System.out.println(n1);
                        System.out.println(n3);
                            
                    }else if(n3 >= n1 && n3 >= n2 && n1 >= n2){
                        System.out.println("Ordenados de mayor a menor son:");
                        System.out.println(n3);
                        System.out.println(n1);
                        System.out.println(n2);
                            
                    }else if(n3 >= n1 && n3 >= n2 && n2 >= n1){
                        System.out.println("Ordenados de mayor a menor son:");
                        System.out.println(n3);
                        System.out.println(n2);
                        System.out.println(n1);
                    }
                    
                    Enter();
                    //Se llama al metodo Enter el cual pausara el texto hasta que se presione la tecla Enter
                break;
                        
                default:
                break;
            }
                
        }while(Op3erMenu !=3);
                
                
    }
    
         public void Enter(){
        /*Se crea un metodo que permite pausar el texto impreso en pantalla hasta que se presione la tecla "Enter"*/
        
        System.out.println();
        System.out.println("Presione Enter para continuar");
        Scanner $enter = new Scanner(System.in);
        $enter.nextLine();
    }
    
}
