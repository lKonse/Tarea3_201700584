
package ipc1.tarea3_201700584;

import java.util.Scanner;


public class Tarea3IngresoUsuarios {
    
    public void Menu1(){
        //Este menu permitira ingresar usuarios, evaluar que ninguno sea igual y poder ordenarlos de forma ascendente o descendente
        
        Scanner entrada = new Scanner(System.in);
        int Op1erMenu = 0;
        String[] Usuario = new String[5];
        //Creamos una matriz de 5 espacios la cual contendra a los usuarios

        do{
            System.out.println();
            System.out.println("1. Ingresar Usuarios");
            System.out.println("2. Mostrar Usuarios ascendente");
            System.out.println("3. Mostrar Usuarios descendente");
            System.out.println("4. Menu principal");
            System.out.println();
            System.out.print("Elija una opción: ");
            Op1erMenu = entrada.nextInt();
            
            switch(Op1erMenu){
                
                case 1:
                    //Aqui se ingresaran los usuarios en la matriz
                    for(int i = 0; i < Usuario.length; i++){
                    //Se usa un for para ir cambiando la posición de la matriz  donde se ingresara el usuario
                        System.out.println("Ingrese usuario "+ (i+1));
                        Usuario[i] = entrada.next();
                        
                                
                        for (int a = 0; a < i; a++ ){
                        //Aqui evaluamos si el usuario ingresado es igual a algun otro usuario ya ingresado
                        
                            while(Usuario[a].equals(Usuario[i])){
                            /*Lo que hacemos es que la consola evalue los usuarios ya ingresados anteiormente que no 
                                sean igual al usuario que se ingreso, si alguno es igual se mostrara un error y se pedira
                                que se ingrese el usuario nuevamente*/
                            
                                System.out.println("Error, usuario ya existente");
                                System.out.println("Ingrese usuario nuevamente:");
                                Usuario[i] = entrada.next();
                            }
                        }
    
                    }
                    System.out.println("Usuarios guardados con exito");
                    Enter();
                    //Se llama al metodo Enter el cual pausara el texto hasta que se presione la tecla Enter
                    break;
                    
                case 2:
                    //Aqui se mostraran los usuario en forma ascendente de como se ingresaron
                    for(int i = 4; i >= 0; i--){
                        System.out.println(Usuario[i]);
                    }
                    Enter();
                    //Se llama al metodo Enter el cual pausara el texto hasta que se presione la tecla Enter
                    break;
                    
                    case 3:
                    //Aqui se mostraran los usuario en forma descendente de como se ingresaron
                    for(int i = 0; i < 5; i++){
                        System.out.println(Usuario[i]);
                    }
                    Enter();
                    //Se llama al metodo Enter el cual pausara el texto hasta que se presione la tecla Enter
                    break;
                    
                default:
                    break;
                
            }
            
        }while(Op1erMenu != 4);
        
    }
    
    public void Enter(){
        /*Se crea un metodo que permite pausar el texto impreso en pantalla hasta que se presione la tecla "Enter"*/
        
        System.out.println();
        System.out.println("Presione Enter para continuar");
        Scanner $enter = new Scanner(System.in);
        $enter.nextLine();
    }
    
}
