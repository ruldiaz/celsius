import java.util.Random;
import java.util.Scanner;

public class Adivina {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numeroAleatorio = new Random().nextInt(100);
        int intentos = 0;
        int numeroUsuario = 0;

        while (numeroAleatorio != numeroUsuario && intentos < 5){
            System.out.println("Adivina:");
            numeroUsuario = scanner.nextInt();

            if(numeroUsuario == numeroAleatorio){
                System.out.println("Adivinaste");
                break;
            }
            if(numeroUsuario < numeroAleatorio){
                System.out.println("El numero ingresado es menor");
            }
            if(numeroUsuario > numeroAleatorio){
                System.out.println("El numero ingresado es mayor");
            }

            intentos++;

            if(intentos == 5){
                System.out.println("Game over!");
            }
        }

    }
}
