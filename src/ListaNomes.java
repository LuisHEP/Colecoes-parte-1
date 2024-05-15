import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ListaNomes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> nomes = new ArrayList<>();

        // Recebendo os nomes
        System.out.println("Digite os nomes (digite 'fim' para parar):");
        String nome;
        while (!(nome = scanner.nextLine()).equalsIgnoreCase("fim")) {
            nomes.add(nome);
        }

        // Ordenando os nomes
        Collections.sort(nomes);

        // Exibindo os nomes ordenados
        System.out.println("Nomes ordenados em ordem alfabética:");
        for (String n : nomes) {
            System.out.println(n);
        }
    }
}
