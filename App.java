import java.util.Scanner;

public class App {
    public static boolean ehPar(int numero) {
        return numero % 2 == 0;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int valor = input.nextInt();

        System.out.println("Digite um número inteiro: ");
        
        if (ehPar(valor)) {
            System.out.println("O número é par.");
        } else {
            System.out.println("O número é ímpar.");
        }

        input.close();
    }

}
