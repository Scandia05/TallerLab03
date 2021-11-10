import java.util.Scanner;

public class Menu {
    public static void iniciarPrograma() {
        boolean a;
        do {
            menuPrincipal();
       a = opcionSeleccionada(ingresarRespuesta());
        } while (!a);
    }

    public static String ingresarRespuesta() {
        Scanner teclado = new Scanner(System.in);
        return teclado.next();
    }

    public static void menuPrincipal() {
        System.out.println("**********************************************************");
        System.out.println("*             Bienvenido            *");
        System.out.println("**********************************************************");
        System.out.println("Por favor, seleccione una de las opcíones");
        System.out.println("[1] ");
        System.out.println("[2] ");
        System.out.println("[3] ");
    }

    public static boolean salir() {
        boolean a = true;
        int b = 0;
        do {
            String respuesta = ingresarRespuesta();
            switch (respuesta) {
                case "1":
                    System.out.println("Gracias por ocupar el programa ");
                    a = true;
                    b = 1;
                    break;
                case "2":
                    a = false;
                    b = 2;
                    break;
                default:
                    System.out.println("Ingrese una opcion valida");
                    b = 0;
                    break;
            }
        } while (b == 0);
        return a;
    }

    public static void textoSalida() {
        System.out.println("[1] Si");
        System.out.println("[2] No");
    }
    public static boolean opcionSeleccionada(String ingresoDatos) {
        boolean a = false;
        switch (ingresoDatos) {
            case "1" -> {
                do {
                    System.out.println("Lista de Comidas Vegetarianas");
                    a = true;
                    System.out.println("¿Desea ver otro ?");
                    textoSalida();
                    a = salir();
                } while (a == true);
            }
            case "2" -> {
                do {
                    System.out.println("Lista de Comida Vegana");
                    a = true;
                    System.out.println("Desea ver mas ?");
                    textoSalida();
                    a = salir();
                } while (a == true);
                break;
            }
            case "3" -> {
                System.out.println("Desea Salir?");
                textoSalida();
                a=salir();
                break;
            }
            default -> {
                System.out.println("opción no válida");
                a = false;
                break;
            }
        }
        return a;
    }
}
