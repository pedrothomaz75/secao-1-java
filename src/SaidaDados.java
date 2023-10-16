import java.util.Locale;

public class SaidaDados {
    public static void main(String[] args) {
        int y = 32;
        double x = 10.35784;


        System.out.printf("%.2f\n", x); // Deixa duas casas decimais
        System.out.printf("%.4f\n", x); // Deixa duas casas decimais
        System.out.println(x); // Print x
        System.out.println(y); // Print y

        // Faz a formatação do ponto flutuante.
        Locale.setDefault(Locale.US);

        System.out.println("RESULTADO: " + x + " METROS");

        // print usando formatação de variáveis
        System.out.printf("RESULTADO = %.2f metros\n", x);

        /*
        *   Marcadores de:
        *       - Ponto flutuante = %f
        *       - Número inteiro = %d
        *       - String ou texto = %s
        *       - Quebra de linha
        * */

    }
}
