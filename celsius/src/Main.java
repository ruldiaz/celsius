import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.out.println("Ingresa la temperatura en celsius: ");
        Scanner lectura = new Scanner(System.in);
        double celsius = Double.parseDouble(lectura.next());
        double fahrenheit = (celsius * 1.8)+32;
        System.out.println(celsius + " grados celsius equivale a " + fahrenheit + " grados fahrenheit.");
    }
}