import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        char[] vet = {'A', 'S', 'A', 'C'};

        // 1. Separar vogais e consoantes
        char[] vogais = new char[vet.length];
        char[] consoantes = new char[vet.length];
        int vogaisCount = 0, consoantesCount = 0;

        for (char letra : vet) {
            if (isVowel(letra)) {
                vogais[vogaisCount++] = letra;
            } else {
                consoantes[consoantesCount++] = letra;
            }
        }

        // Exibir vogais
        System.out.println("Vogais: " + new String(Arrays.copyOf(vogais, vogaisCount)));
        // Exibir consoantes
        System.out.println("Consoantes: " + new String(Arrays.copyOf(consoantes, consoantesCount)));

        // 2. Criar o vetor desejado para formar a palavra 'CASA'
        char[] palavra = {'C', 'A', 'S', 'A'};

        // Exibir a palavra formada diretamente
        System.out.println("Palavra formada: " + new String(palavra));
    }

    // Método para verificar se uma letra é uma vogal
    private static boolean isVowel(char letra) {
        return letra == 'A' || letra == 'E' || letra == 'I' || letra == 'O' || letra == 'U' ||
                letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u';
    }
}  