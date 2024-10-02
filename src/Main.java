import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("quantos carros voce quer avaliar? ");
        int car = sc.nextInt();
        double[] carros = new double[car];
        int qntavb = 0;
        int qntvr = 0;
        double somaavl = 0;
        for (int i = 0; i < car; i++) {
            System.out.println("digite as avaliações dos carros vc cadastrou em ordem: ");
            carros[i] = sc.nextDouble();
            if (carros[i] < 0 || carros[i] > 10) {
                System.out.println("Avaliação invalida! coloque uma avaliação que esteja entre 0 e 10!");
                System.out.println("Digite a avaliação correta: ");
                carros[i] = sc.nextDouble();
            }
            if (carros[i] >= 6) {
                qntavb++;
            }
            if (carros[i] < 6) {
                qntvr++;
            }
            somaavl += carros[i];
        }
        if (qntavb > 0) {
            System.out.println("A quantidade de avaliações boas é: " + qntavb);
        }
        if (qntvr > 0) {
            System.out.println("A quantidade de avaliações ruins são: " + qntvr);
        }
        double media = somaavl / car;
        System.out.println("A média das avaliações foram de: " + media);
    }
}