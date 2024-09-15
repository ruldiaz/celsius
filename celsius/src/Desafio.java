import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nombreCliente = "Tony Stark";
        String tipoCuenta = "Corriente";
        double saldoDisponible = 0;
        double retiros = 0;
        double depositos = 0;
        int menuOpcion = 0;

        String bienvenida = """
                ******************************
                Nombre del cliente: %s
                Tipo de cuenta: %s
                Saldo disponible: %f
                ******************************
                """.formatted(nombreCliente, tipoCuenta, saldoDisponible);
        String menu = """
                ** Escriba el número de la opción deseada **
                1 - Consultar saldo
                2 - Retirar
                3 - Depositar
                9 - Salir
                """;
        System.out.println(bienvenida);

        // si opcion es 9 salir
        while (menuOpcion != 9){
            System.out.println(menu);
            menuOpcion = scanner.nextInt();
            if(menuOpcion == 1){
                System.out.println("El saldo actualizado es: " + " " + saldoDisponible);
            }
            // retiros
            if(menuOpcion == 2){
                System.out.println("¿Cuanto deseas retirar?");
                retiros = scanner.nextDouble();
                if(saldoDisponible >= retiros){
                    System.out.println("Cantidad retirada: " + " " + retiros);
                    saldoDisponible -= retiros;
                }else {
                    System.out.println("Saldo insuficiente");
                }
            }
            // depositos
            if(menuOpcion == 3){
                System.out.println("¿Cuanto deseas depositar?");
                depositos = scanner.nextDouble();
                System.out.println("Cantidad depositada: " + " " + depositos);
                saldoDisponible += depositos;
            }
        }
    }
}
