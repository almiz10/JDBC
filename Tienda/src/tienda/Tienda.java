package tienda;

import java.util.Scanner;

public class Tienda {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int option;
        String continueQuery;

        do {
            option = seleccionar();
            menu(option);
            System.out.println("Quieres hace otra consulta (S/N)");
            continueQuery= leer.next();
        } while (!continueQuery.equalsIgnoreCase("n"));
    }
        

//metodo seleccionar
    public static int seleccionar() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int option = 0;
        do{
            System.out.println("Ingrese una de las siguientes opciones");
            System.out.println("1. Ingresar un producto a la base de datos \n"
                    +"2. Editar un producto\n"
                    +"3. Salir");
            option = leer.nextInt();
        } while (option <1 || option >3);
        return option;
    }
    
//metodo menu
public static void menu (int option){
    System.out.println("El resultado de la opcion es "+option);           
    
}
}


