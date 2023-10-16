import java.util.Locale;
import java.util.Scanner;

public class EntradaDados {
    public static void main(String[] args) {

        // Mudança de ponto flutuante
        Locale.setDefault(Locale.US);
        // Para fazer a entrada de dados, é usado o Scanner

        // Método de leitura de dados
        Scanner sc = new Scanner(System.in);
        String nome;
        int idade;
        double altura;
        char gender;

        // Entrada de dados do nome
        System.out.println("Digite o nome de quem está digitando: ");
        nome = sc.next();

        // Entrada de dados da idade
        System.out.println("Digite sua idade: ");
        idade = sc.nextInt();

        // Entrada de dados da altura
        System.out.println("Digite sua altura: ");
        altura = sc.nextDouble();

        System.out.println("Digite o genêro: ");
        gender = sc.next().charAt(0);

        System.out.printf("O nome de quem digitou é: %s\n", nome);
        System.out.printf("A idade de quem digitou é: %d\n", idade);
        System.out.printf("A altura de quem digitou é de: %.1f\n", altura);
        System.out.printf("O genêro de quem digitou é: %s\n", gender);

        // Termina a leitura dos dados
        sc.close();

    }
}
