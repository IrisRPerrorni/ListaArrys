import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ex5 {
    //Criar um programa que calcule a média de salários de uma empresa,
    // pedindo ao usuário a grade de funcionários e os salários, e devolvendo a média salarial.

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Map<String, Double> salarios = new HashMap<String, Double>();
        System.out.println("Digite quantos funcionários tem na empresa: ");

        int quant = entrada.nextInt();
        for (int i = 0; i < quant; i++) {
            System.out.println("Digite o nome do " + (i + 1) + " ° funcionario(a): ");
            String name = entrada.next();
            System.out.println("Digite o salario do " + (i + 1) + "° funcionario(a): ");
            double sal = entrada.nextInt();
            salarios.put(name, sal);
        }
        System.out.println("=============== Grade de funcionários e salarios ============");
        System.out.println(salarios);
        double soma = 0;
        for (double value : salarios.values()) {
            soma += value;
        }
        System.out.println("A média salarial da empresa é R$: " + (soma / quant));

    }

}
