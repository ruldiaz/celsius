import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // variable para registrar entradas desde el teclado
        String nombreCliente = "Tony Stark";
        String tipoCuenta = "Corriente";
        double saldoDisponible = 0;
        double retiros = 0;
        double depositos = 0;
        int menuOpcion = 0; // variable para opciones de menú

        // texto de bienvenida, pantalla
        String bienvenida = """
                ******************************
                Nombre del cliente: %s
                Tipo de cuenta: %s
                Saldo disponible: %f
                ******************************
                """.formatted(nombreCliente, tipoCuenta, saldoDisponible);
        // menu
        String menu = """
                ** Escriba el número de la opción deseada **
                1 - Consultar saldo
                2 - Retirar
                3 - Depositar
                9 - Salir
                """;
        // mostrar la pantalla de bienvenida al inicio
        System.out.println(bienvenida);

        // si opcion es 9 salir
        while (menuOpcion != 9){
            System.out.println(menu); // imprime menu en pantalla
            menuOpcion = scanner.nextInt(); // lee opcion desde el teclado
        // metodo switch para controlar menu
            switch( menuOpcion){
                case 1:
                    System.out.println("El saldo actualizado es: " + " " + saldoDisponible);
                    break;
                case 2:
                    System.out.println("¿Cuanto deseas retirar?");
                    retiros = scanner.nextDouble();
                    if(saldoDisponible >= retiros){
                        System.out.println("Cantidad retirada: " + " " + retiros);
                        saldoDisponible -= retiros;
                        System.out.println("El saldo actualizado es: " + " " + saldoDisponible);
                    }else {
                        System.out.println("Saldo insuficiente");
                    }
                    break;
                case 3:
                    System.out.println("¿Cuanto deseas depositar?");
                    depositos = scanner.nextDouble();
                    System.out.println("Cantidad depositada: " + " " + depositos);
                    saldoDisponible += depositos;
                    break;
                default:
                    System.out.println("Opción no válida.");
                    break;
            }

        }
    }
}
