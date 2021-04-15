package calculadora;

import java.io.IOException;
import java.util.Scanner;

public class Menu {

    public static void main(String[] args) throws IOException {
        Menu programa = new Menu();
        programa.inici();
    }

    //Starter
    public static void inici() throws IOException {
        boolean sortir;
        do {
            mostrarMenu();
            sortir = llegirMenu();
        } while (!sortir);
        System.out.println("Opció SORTIR seleccionada. Sortint del programa...");
    }

    //Aquí mostramos las opciones del menú
    public static void mostrarMenu() {
        System.out.println("___________________MENÚ___________________");
        System.out.println("1.-Suma . ");
        System.out.println("2.-Resta . ");
        System.out.println("3.-Multiplicar . ");
        System.out.println("4.-Dividir . ");
        System.out.println("5.- Sortir.");
    }

    //Aquí recorremos el menú con el switch case , donde cada número (1,2,3,4,5) será un método que hara la respectiva funcionalidad
    public static boolean llegirMenu() throws IOException {
        boolean sortir = false;
        int opcio = llegirInt("Selecciona una opció: ");
        switch (opcio) {
            case 1:
//                Sumar(1, 2);
                break;
            case 2:
//                Restar(1, 2);
                break;
            case 3:
//              Multiplicar(1, 2);
                break;
            case 4:
//              Dividir(1, 2);
                break;
            case 5:
                sortir = true;
                break;
            default:
                //En caso de introducir un número que no se encuentre en ninguno de los case se mostrará el siguiente mensaje
                System.out.println("Opció no vàlida, intena escollir una opció entre el 1 i el 5...");
                break;
        }
        return sortir;
    }
    

    //Métodos para leer enteros con control de error en caso de introducir un caracter 
    public static int llegirInt(String xComent) {
        boolean intCorrecte;
        int x = 0;

        Scanner lector = new Scanner(System.in);
        System.out.print(xComent);
        do {
            intCorrecte = lector.hasNextInt();
            if (intCorrecte) {
                x = lector.nextInt();
                lector.nextLine();
            } else {
                //En caso de introducir un carácter incorrecto se mostrarán los siguientes mensajes
                System.out.println("El valor introduït no és un número ENTER. Ha de ser-ho...");
                System.out.print("Prova-ho de nou: ");
                lector.nextLine();
            }
        } while (!intCorrecte);
        return x;
    }
}
