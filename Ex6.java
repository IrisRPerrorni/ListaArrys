import java.util.Scanner;

public class Ex6 {
    // Crie um programa para verificar se o inteiro fornecido é um múltiplo de 5 e 7.

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("================= Calculadora de números inteiro múltiplos de 7 e/ou 5 =================== ");
        System.out.println("Digite um número");
        int num = entrada.nextInt();
        if(num % 5 == 0 && num % 7 == 0){
            System.out.println("O número " +num + " é multiplo de 5 e 7 " );
        } else if (num % 7 == 0){
            System.out.println("O número " +num + " é multiplo de 7 " );
        } else if (num % 5 == 0  ){
            System.out.println("O número " +num + " é multiplo de 5  " );
        } else {
            System.out.println("O número " +num + " não é multiplo de 5 e/ou 7 ");
        }
    }
}
