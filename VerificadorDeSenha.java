// Este programa verifica uma senha pre definida e notifica o usuario se a senha esta correta ou nao.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a senha:");
        int senha = sc.nextInt();

        while (senha != 2002); {
            System.out.println("Senha invalida");
            System.out.println("Digite a senha:");
            senha = sc.nextInt();

        }

        System.out.println("Acesso permitido");

        sc.close();
    }
}
