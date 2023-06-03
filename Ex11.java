import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Ex11 {
    // Ler um vetor A com 10 elementos inteiros correspondentes as idades de um grupo de pessoas.
    // Escreva um programa que determine e escreva a menor e a maior idades e suas respectivas posições.
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        List<Integer> vetor = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            System.out.println(" Digite a " + (i + 1) + "º idade");
            vetor.add(entrada.nextInt());
        }
        System.out.println("As idades correspondente ao grupo são: " + vetor);
        int menor = Collections.min(vetor);
        int maior = Collections.max(vetor);
        int posicao = vetor.indexOf(menor);
        int posicorreta = posicao + 1 ;
        System.out.println("A menor idade do  é : " + menor + " . E está na " + posicorreta + "º posicão do grupo" );

    }



}
