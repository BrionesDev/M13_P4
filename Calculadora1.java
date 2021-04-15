package calculadora;

import java.io.IOException;
import java.util.Scanner;
import examplesSocketsA3.FuncionalidadesExtra;

public class Calculadora {

    public static void main(String[] args) throws IOException {
        Calculadora programa = new Calculadora();
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

    //Mostramos las opciones del menú
    public static void mostrarMenu() {
        System.out.println("___________________MENÚ___________________");
        System.out.println("1.-Suma . ");
        System.out.println("2.-Resta . ");
        System.out.println("3.-Multiplicar . ");
        System.out.println("4.-Dividir . ");
        System.out.println("5.- Raiz cuadrada.");
        System.out.println("6.- Raiz Cubica.");
        System.out.println("7.- Seno.");
        System.out.println("8.- Coseno.");
        System.out.println("9.- Sortir.");
    }

    //Recorreremos el menú para seleccionar una de las opciones
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
                Multiplicar(1, 2);
                break;
            case 4:
                Dividir(1, 2);
                break;
            case 5:
                raizCuadrada(81);
                break;
            case 6:
                raizCubica(8);
                break;
            case 7:
                seno(40);
                break;
            case 8:
                coseno(60);
                break;
            case 9:
                sortir = true;
                break;
            default:
                System.out.println("Opció no vàlida, intena escollir una opció entre el 1 i el 9...");
                break;
        }
        return sortir;
    }
//Método que llamamos en el menú para multiplicar
    public static double Multiplicar(double n1, double n2) {
        System.out.println("El resultado es: " + n1 * n2);
        return n1 * n2;
    }
//Método que llamamos en el menú para dividir
    public static double Dividir(double n1, double n2) {
        System.out.println("El resultado es: " + n1 / n2);
        if (n1 > n2) {
            return n1 / n2;

        } else {
            return n2 / n1;
        }
    }
//Método que llamamos en el menú para clacular la raiz cuadrada
    public static double raizCuadrada(double num1) {
        double resultado = Math.sqrt(num1);
        System.out.println("El resultado es: " + resultado);
        return resultado;
    }
//Método que llamamos en el menú para calcular la raiz cúbica
    public static double raizCubica(double num1) {
        double resultado = Math.sqrt(num1);
        System.out.println("El resultado es: " + resultado);
        return resultado;
    }
//Método que llamamos en el menú para calcular el seno
    public static double seno(double num1) {
        double resultado = Math.sin(num1);
        System.out.println("El resultado es: " + resultado);
        return resultado;
    }
//Método que llamamos en el menú para calcular el coseno
    public static double coseno(double num1) {
        double resultado = Math.sin(num1);
        System.out.println("El resultado es: " + resultado);
        return resultado;
    }

    //lector de enteros con detención de errores
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
                //Mensajes que se mostrará en caso de no introducir un valor int en el menú
                System.out.println("El valor introduït no és un número ENTER. Ha de ser-ho...");
                System.out.print("Prova-ho de nou: ");
                lector.nextLine();
            }
        } while (!intCorrecte);
        return x;
    }
}
