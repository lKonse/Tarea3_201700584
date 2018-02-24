
package ipc1.tarea3_201700584;

import java.util.Scanner;
/*Se importa el paquete de Scanner el cual ayudara a ingresar datos en el proyecto
Funciona para poder ingresar información del sistema*/


public class IPC1Tarea3_201700584 {

    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        //Aquí se creo un objeto (entrada) para el metodo Scanner en el que se especifica que recibira datos del sistema
        
        int OpMenuPrincipal;
        //Se crea un variable que se usara para las opciones del menu principal
        
        do{
            //do permite ejecutar una acción siempre y cuando cumpla con la condición que se especifica al final de la sentencia
        
        System.out.println("BIENVENIDO");
        //System.out.println permite mostrar un mensaje en pantalla de consola
        
        System.out.println("1. Usuarios");
        System.out.println("2. Contador de digitos");
        System.out.println("3. Tres números de mayor a menor");
        System.out.println("4. Calcular promedio");
        System.out.println("5. Salir");
        System.out.println();
        
        System.out.print("Elija una opción: ");
        OpMenuPrincipal = entrada.nextInt();
        /* aquí se llama una variable y ademas se le especifica 
        que se le ingresara un valor y que lo almacene en la variable*/

        switch (OpMenuPrincipal){
        /*switch es una sentencia en caso de tener que evaluar varias opciones, se le especifican posibles opciones
            y dependiendo de la opción ejecutara el caso
            Aqui llamaremos a las clases que contienen los menus del programa*/
            
            case 1:
                /*Creamos un objeto de la clase IngresoUsuarios y luego se llama al metodo de la clase para ejecutar su menu */
                Tarea3IngresoUsuarios llamar1 = new Tarea3IngresoUsuarios();
                llamar1.Menu1();
                break;
            
            case 2:
                /*Creamos un objeto de la clase ContadorDigitos y luego se llama al metodo de la clase para ejecutar su menu */
                Tarea3ContadorDigitos llamar2 = new Tarea3ContadorDigitos();
                llamar2.Menu2();
                
                 break;
                
            case 3:
                /*Creamos un objeto de la clase OrdenarNumeros y luego se llama al metodo de la clase para ejecutar su codigo */
                Tarea3OrdenarNumeros llamar3 = new Tarea3OrdenarNumeros();
                llamar3.Menu3();
            break;
                
            case 4:
                /*Creamos un objeto de la clase NotasAlumnos y luego se llama al metodo de la clase para ejecutar su codigo */
                Tarea3NotasAlumnos llamar4 = new Tarea3NotasAlumnos();
                llamar4.Menu4();
                break;
                
            case 5:
                break;
                
            default:
                break;
            
        }
        
        }while(OpMenuPrincipal !=5);
       
    }
    
}
