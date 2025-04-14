// Este programa permite ao usuário definir uma senha e depois verifica se ele a digita corretamente.
import java.util.Scanner;

public class VerificadorDeSenha {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Defina a senha de acesso:");
        int senhaCorreta = sc.nextInt();

        System.out.println("Digite a senha para acessar:");
        int tentativa = sc.nextInt();

        while (tentativa != senhaCorreta) {
            System.out.println("Senha Invalida");
            System.out.println("Digite a senha novamente:");
            tentativa = sc.nextInt();
        }

        System.out.println("Acesso Permitido");

        sc.close();
    }
}
