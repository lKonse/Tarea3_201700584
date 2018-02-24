
package ipc1.tarea3_201700584;

import java.util.Scanner;

public class Tarea3NotasAlumnos {
    
    public void Menu4(){
        /*En este menu se crea una matriz donde se almacenaran las ID de alumnos, sus notas y luego se calcula un 
        promedio de notas por alumno*/
        
        int Op4toMenu = 0;
        Scanner entrada = new Scanner(System.in);
        int[][] Nota = new int[6][6];
        int suma = 0;
        
        do{
            System.out.println();
            System.out.println("1. Ingreso notas de alumnos");
            System.out.println("2. Consulta de un alumno en especifico");
            System.out.println("3. Notas de todos los alumnos");
            System.out.println("4. Menu principal");
            System.out.println();
            System.out.print("Elija una opción: ");
            Op4toMenu = entrada.nextInt();
            
            switch(Op4toMenu){
                    
                
                case 1:
                /*Se pide que se ingrese primeramente el ID del alumno y posteriormente se piden las notas*/
                    for(int n=0; n < Nota.length; n++){
                    //La matriz esta fija en la columna 0 para ingresar ID pero la fila ira cambiando
                        System.out.println();
                        System.out.println("Ingrese ID del alumno:");
                        Nota[0][n] = entrada.nextInt();
                        
                        for(int j=0; j < n; j++){
                            //Se evalua que el ID ingresado no sea igual a otro ID ya ingresado
                            
                            while(Nota[0][n] == Nota[0][j]){
                                
                                
                                System.out.println("El ID ya existe");
                                System.out.print("Ingrese un nuevo ID: ");
                                Nota[0][n] = entrada.nextInt();
                                
                            }
                            
                        }
                    
                        for(int a=1; a<5; a++){
                        //Aqui se ingresaran las 4 notas, este for no tocara la columna 0, empezara desde la columna 1 hasta la 4
                            System.out.print("Ingrese nota "+ (a) + ": ");
                            Nota[a][n]=entrada.nextInt();    
                            
                            //En la variable suma se iran sumando las notas ingresadas
                            suma = suma + Nota[a][n];
                        }
                        
                        /*En la ultima columna de cada fila se almacenara las 4 notas ingresadas divididas entre 4 para obtener
                        su promedio*/
                        Nota[5][n] = suma/4;
                        suma = 0;
                        
                    }
                    Enter();
                    //Se llama al metodo Enter el cual pausara el texto hasta que se presione la tecla Enter
                    break;
                    
                case 2:
                    //Aqui se podra consultar las notas de un alumno (ID) en especifico
                    System.out.print("Ingrese el ID del alumno a mostrar: ");
                    int eva = entrada.nextInt();
                    //Se pide que se ingrese una ID que ya se haya guardado anteriormete
                    
                    for(int i = 0; i < Nota.length; i++){
                        
                        if(eva == Nota[0][i]){
                            //Se evalua si el ID ingresado coincide con algun ID ya guardado.
                            //Si el ID si coincide se imprimira el ID, notas y promedi ode notas de ese alumno
                            
                            System.out.print(Nota[0][i] + "  ");
                            suma = 0;
                            
                            for(int a=1; a < 5; a++){
                                
                                System.out.print(Nota[a][i] + "  ");
                                suma = suma + Nota[a][i];
                                //En la variable suma se iran sumando las notas que se van imprimiendo (notas ya ingresadas)
                            }
                            
                            /*En la ultima columna de la fila se almacenara las 4 notas divididas entre 4 para obtener
                            su promedio y se mostrar el promedio*/
                            Nota[5][i] = suma/4;
                            System.out.print(Nota[5][i]);
                            
                        }    
                    }
                    Enter();
                    //Se llama al metodo Enter el cual pausara el texto hasta que se presione la tecla Enter
                    break;
                    
                case 3:
                    //Aqui se imprimiran todas las notas con sus ID y sus promedios
                    for(int fil=0; fil<6; fil++){
                    System.out.println();
                    
                        for(int col=0; col<6; col++){
                            
                            System.out.print(Nota[col][fil] + "  ");
                            
                        }
                        
                    }
                    Enter();
                    break;
                    
                default:
                    break;
                
            }
            
        }while(Op4toMenu != 4);
        
    }
    
             public void Enter(){
        /*Se crea un metodo que permite pausar el texto impreso en pantalla hasta que se presione la tecla "Enter"*/
        
        System.out.println();
        System.out.println("Presione Enter para continuar");
        Scanner $enter = new Scanner(System.in);
        $enter.nextLine();
    }
    
}
