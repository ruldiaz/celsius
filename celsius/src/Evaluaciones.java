import java.util.Scanner;

public class Evaluaciones {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double nota = 0;
        double mediaEvaluaciones = 0;
        double totalEvaluaciones = 0;

        while(nota != -1){
            System.out.println("Escribe la nota para Matrix");
            nota = scanner.nextDouble();
            mediaEvaluaciones += nota;
            totalEvaluaciones++;
        }
        System.out.println("La media de evaluaciones es: " + mediaEvaluaciones/totalEvaluaciones);
    }
}
