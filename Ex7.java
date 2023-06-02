import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Ex7 {
    //Crie um programa para exibir o inteiro fornecido pelo usuário na ordem inversa.
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        List<Integer> num = new ArrayList<>();

        System.out.println("Digite quantos números você gostaria de listar: ");
        int quant = entrada.nextInt();

        for(int i=0 ; i< quant ; i++){
            System.out.println(" Digite o " + (i + 1) + "º numero");
            num.add(entrada.nextInt());;
        }
        System.out.println( "A lista " + num);
        Collections.reverse(num);;
        System.out.println( "A ordem reversa da lista " + num);
    }
}
