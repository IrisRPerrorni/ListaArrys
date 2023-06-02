import java.util.ArrayList;
import java.util.Scanner;

public class Ex2 {
    //Escreva um programa para inserir um elemento (posição específica) em uma lista.

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        ArrayList<String> aluno = new ArrayList<>();
        aluno.add("jose");
        aluno.add("maria");
        aluno.add("Carol");
        aluno.add("Vitor");
        aluno.add("Lúcia");
        aluno.add("Marcos");
        aluno.add("Marcia");
        aluno.add("Jonas");
        aluno.add("Pedro");
        aluno.add("Joao");



        System.out.println("Quantos alunos há na sala? "+ aluno.size()); // quantos alunos tem
        System.out.println("Quais são os alunos? "+ aluno.toString()); // quais são os alunos
        System.out.println("Qual é o aluno(a) que está na 3° posição da lista?  " + aluno.get(2)); // imprimir o nome que está na posiçao 2

        aluno.add(2,"Lívia");
        System.out.println(" Inserir Livia na posição 3° ");

        System.out.println("Atualizando a quantidade de aluno na sala " +aluno.size()); // quantos alunos tem
        System.out.println("Alunos presentes: "+ aluno.toString()); // quais são os alunos




//        for (int i = 0; i < aluno.size(); i++) {
//            System.out.println("Digite o nome do " + (i + 1) + "° aluno:");
//            aluno.add(entrada.next());
//
//        }
//        System.out.println(aluno);
//


    }
}
