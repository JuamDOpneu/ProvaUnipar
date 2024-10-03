import java.util.Scanner;

public class ConcursodeTalentos {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Quantas pessoas irão votar:");

        int pessoas = entrada.nextInt();

        int[] votos = new int[pessoas];

        int somavotos80 = 0;
        int somavotos70 = 0;
        int somavotos60 = 0;
        int somavotos50 = 0;

        for (int i = 0; i < pessoas; i++) {
            System.out.println(""" 
                    Você tem os seguintes professores para votar:
                    80 - Taffe
                    70 - Rodrigo
                    60 - Lucas 
                    50 - Alessandro
                    digite o numero correspondente do professor que escolheu para votar: """);

            votos[i] = entrada.nextInt();

            if (votos[i] != 80 && votos[i] != 70 && votos[i] != 60 && votos[i] != 50) {
                System.out.println("Voto inválido! Por favor vote novamente: ");
                votos[i] = entrada.nextInt();
            }
            if (votos[i] == 80) {
                somavotos80++;
            }
            if (votos[i] == 70) {
                somavotos70++;
            }
            if (votos[i] == 60) {
                somavotos60++;
            }
            if (votos[i] == 50) {
                somavotos50++;
            }
        }

        if (somavotos80 > somavotos70 && somavotos80 > somavotos60 && somavotos80 > somavotos50) {
            System.out.println("O  professor vencedor foi Taffe resultado da votação foi:" + somavotos80 + " votos para Taffe, " + somavotos70 + "  votos para Rodrigo," + somavotos60 + " votos para Lucas ," + somavotos50 + " votos para Alessandrp");
        }
        if (somavotos70 > somavotos80 && somavotos70 > somavotos60 && somavotos70 > somavotos50) {
            System.out.println("O professor vencedor foi Rodrigo  resultado da votação foi:" + somavotos80 + " votos para Taffe , " + somavotos70 + "  votos para Rodrigo," + somavotos60 + " votos para Lucas ," + somavotos50 + " votos para Alessandro");
        }
        if (somavotos60 > somavotos80 && somavotos60 > somavotos70 && somavotos60 > somavotos50) {
            System.out.println("O  professor vencedor foi Lucas resultado da votação foi:" + somavotos80 + " votos para Taffe , " + somavotos70 + "  votos para Rodrigo," + somavotos60 + " votos para Lucas ," + somavotos50 + " votos para alessandro");
        }
        if (somavotos50 > somavotos80 && somavotos50 > somavotos70 && somavotos50 > somavotos60) {
            System.out.println("O professor vencedor foi Alessandro resultado da votação foi:" + somavotos80 + " votos para Taffe, " + somavotos70 + "  votos para Rodrigo," + somavotos60 + " votos para Lucas  ," + somavotos50 + " votos para Alessandro" );
        }


    }
}