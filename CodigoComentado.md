Exercício Estrutura de Dados 2º semestre - Sistemas para Internet - FATEC

Código ocmentado:

Vou comentar o código linha a linha para que você possa entender melhor cada parte. Aqui está o código com os comentários:
import java.util.Arrays; // Importa a classe Arrays para poder usar métodos de manipulação de arrays

public class Main { // Declara a classe principal
    public static void main(String[] args) { // Método principal que é o ponto de entrada do programa
        char[] vet = {'A', 'S', 'A', 'C'}; // Declara e inicializa um vetor de caracteres com as letras A, S, A e C
        
        // 1. Separe vogais e consoantes
        char[] vogais = new char[vet.length]; // Cria um array para armazenar as vogais
        char[] consoantes = new char[vet.length]; // Cria um array para armazenar as consoantes
        int vogaisCount = 0, consoantesCount = 0; // Contadores para o número de vogais e consoantes

        // Loop para percorrer cada letra do vetor
        for (char letra : vet) {
            // Verifica se a letra é uma vogal
            if (isVowel(letra)) {
                vogais[vogaisCount++] = letra; // Se for vogal, adiciona ao array de vogais e incrementa o contador
            } else {
                consoantes[consoantesCount++] = letra; // Se não for vogal, adiciona ao array de consoantes e incrementa o contador
            }
        }

        // Exibe as vogais encontradas no vetor
        System.out.println("Vogais: " + new String(Arrays.copyOf(vogais, vogaisCount))); 
        // Exibe as consoantes encontradas no vetor
        System.out.println("Consoantes: " + new String(Arrays.copyOf(consoantes, consoantesCount))); 

        // 2. Criar o vetor desejado para formar a palavra 'CASA'
        char[] palavra = {'C', 'A', 'S', 'A'}; // Inicializa um array que contém as letras para formar a palavra 'CASA'

        // Exibe a palavra formada
        System.out.println("Palavra formada: " + new String(palavra)); 
    }

    // Método estático para verificar se uma letra é uma vogal
    private static boolean isVowel(char letra) {
        // Retorna verdadeiro se a letra for uma vogal (A, E, I, O, U) (considerando maiúsculas e minúsculas)
        return letra == 'A' || letra == 'E' || letra == 'I' || letra == 'O' || letra == 'U' ||
               letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u';
    }
}
Explicação dos Comentários
•	Importação: Abaixo da linha de importação, expliquei que a classe Arrays é importada para manipular arrays.
•	Class Declaration: Um comentário foi adicionado para descrever a classe principal que contém o método main.
•	Array Initialization: Os comentários nas linhas onde os vetores são criados explicam a finalidade de cada um.
•	Loop: Adicionei detalhes nas partes do loop para descrever a separação de vogais e consoantes.
•	Saídas: Comentários foram incluídos onde as vogais e consoantes são exibidas, assim como a palavra formada.
•	Método isVowel: Os comentários dentro deste método explicam a lógica utilizada para determinar se um caractere é uma vogal.
