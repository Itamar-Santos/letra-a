import java.util.Scanner;

public class ContarA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma frase: ");
        String frase = scanner.nextLine();

        // Converter  

        String fraseMinuscula = frase.toLowerCase();

        // Inicializar um contador
        int contagem = 0;

        // Iterar sobre cada caractere da frase
        for (char caractere : fraseMinuscula.toCharArray()) {
            if (caractere == 'a') {
                contagem++;
            }
        }

        System.out.println("A letra 'a' aparece " + contagem + " vezes na frase.");
    }
}