package pilas;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
	/**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pila pila = new Pila();
        System.out.println("<<-- Ejemplo de Pila -->>\n\n");
        pila.apilar(4);
        pila.apilar(16);
        pila.apilar(12);
        pila.apilar(8);
        pila.apilar(65);
        Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int opcion; //Guardaremos la opcion del usuario
 
        while (!salir) {
        	System.out.println("*******MENU DE OPCIONES*********");
            System.out.println("1. Listar Pila");
            System.out.println("2. Retirar el elemento del tope de la pila");
            System.out.println("3. Actualizar el valor del nodo con el valor 12 por 24");
            System.out.println("4.Eliminar el nodo con el valor 16");
            System.out.println("5. Consulta si existe el valor 65");
            System.out.println("6. Elimina la pila");
            System.out.println("7. Consulta si la pila esta vacia");
            System.out.println("8. Salir");
 
            try {
 
                System.out.println("Escribe una de las opciones");
                opcion = sn.nextInt();
 
                switch (opcion) {
                    case 1:
                        System.out.println("<<-- Pila Listar elementos -->>");
                        pila.listar();
                        System.out.println("\n<<-- Tamaño de la pila -->");
                        System.out.println(pila.getTamanio());
                        break;
                    case 2:
                    	System.out.println("\n<<-- Retirar el elemento del tope de la pila -->>");
                        pila.retirar();
                        pila.listar();
                        System.out.println("Tamaño: " + pila.getTamanio());
                        break;
                    case 3:
                    	 System.out.println("\n<<-- Actualizar el valor del nodo con el valor 12 por 24 -->>");
                         pila.editar(12, 44);
                         pila.listar();
                         System.out.println("Tamaño: " + pila.getTamanio());
                        break;
                    case 4:
                    	 System.out.println("\n<<-- Eliminar el nodo con el valor 16 -->>");
                         pila.remover(16);
                         pila.listar();
                         System.out.println("Tamaño: " + pila.getTamanio());
                    break;
                    case 5:
                    	System.out.println("\n<<-- Consulta si existe el valor 65 -->>");
                        System.out.println(pila.buscar(65));
                    break;
                    case 6:
                    	 System.out.println("\n<<-- Elimina la pila -->>");
                         pila.eliminar();
                        break;
                    case 7:
                    	 System.out.println("\n<<-- Consulta si la pila esta vacia -->>");
                    	 if(pila.esVacia()) {
                    		 System.out.println("La Pila Esta Vacia");
                    	 }else {
                    		 System.out.println("La Pila No esta  Vacia y tiene "+pila.getTamanio()+" elementos");
                    	 }
                         //System.out.println(pila.esVacia());
                        break;
                    case 8:
                        salir = true;
                        break;
                    default:
                        System.out.println("Solo números entre 1 y 8");
                }
            } catch (InputMismatchException e) {
                System.out.println("Debes insertar un número");
                sn.next();
            }
        }
        
           
        System.out.println("\n\n<<-- Fin de ejemplo pila -->>");
    }
}
