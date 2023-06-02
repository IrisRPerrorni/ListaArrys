import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Ex3 {

    //Peça ao usuário dois números e exiba em ordem decrescente (suponha números diferentes).
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        List<Integer> num = new ArrayList<>();

        for (int i = 0; i < 2; i++) {
            System.out.println(" Digite o " + (i + 1) + "º numero");
            num.add(entrada.nextInt());
        }
        Collections.sort(num);   //colocar na ordem
        Collections.reverse(num); // reverter a ordem
        System.out.println(num);
        }

    }

