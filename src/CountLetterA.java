import java.util.Scanner;

public class CountLetterA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;

        while (true) {

            System.out.print("Digite uma palavra (ou digite 'sair' para encerrar): ");
            input = scanner.nextLine();

            if (input.equalsIgnoreCase("sair")) {
                System.out.println("Encerrando o programa.");
                break;
            }

            int count = 0;

            for (int i = 0; i < input.length(); i++) {
                char c = input.charAt(i);

                if (c == 'a' || c == 'A') {
                    count++;
                }
            }
            
            if (count > 0) {
                System.out.println("A letra 'a' ou 'A' aparece " + count + " vez(es) na palavra.");
            } else {
                System.out.println("A letra 'a' ou 'A' não foi encontrada na palavra.");
            }
        }

        scanner.close();
    }
}
