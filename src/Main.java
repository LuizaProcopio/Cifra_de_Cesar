import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escreva a frase que será criptografada: ");
        String inputText = scanner.nextLine();

        System.out.println("Escreve o numero de espaço (0-25): ");
        int shiftKey = scanner.nextInt();

        String encrypted = Encrypt.encrypt(inputText, shiftKey);
        System.out.println("Criptografia do texto: " + encrypted);
    }
}