import java.util.*;

public class Ex4 {

    //Tem-se um conjunto de dados contendo a altura e o sexo (masculino, feminino) de 10 pessoas.
    // Fazer um algoritmo que calcule e escreva:
    //a maior e a menor altura do grupo;
    //média de altura dos homens;
    //o número de mulheres.
    public static void main(String[] args) {
        ArrayList<Double> altura = new ArrayList<>();
        altura.add(1.7);
        altura.add(1.8);
        altura.add(1.6);
        altura.add(1.55);
        altura.add(1.85);
        altura.add(1.68);
        altura.add(1.75);
        altura.add(1.90);
        altura.add(1.87);
        altura.add(1.52);

        ArrayList<String> sexo = new ArrayList<>();
        sexo.add("feminino");
        sexo.add("masculino");
        sexo.add("feminino");
        sexo.add("feminino");
        sexo.add("masculino");
        sexo.add("feminino");
        sexo.add("feminino");
        sexo.add("masculino");
        sexo.add("feminino");
        sexo.add("masculino");
        sexo.add("masculino");
        sexo.add("feminino");

        Collections.sort(altura); // organizar a ordem menor para o maior

        double menor = altura.get(0); // pegar o menor valor
        double maior = altura.get(9); // pegar o maior valor
        System.out.println("A menor altura é : " + menor);
        System.out.println("A maior altura é " + maior);

        double soma = 0 ;
        for (int i = 0 ; i < altura.size() ; i++){
            soma = soma + altura.get(i);
        }
        System.out.println("A média das alturas é " + (soma/10));
        int mulher = 0;
        for (int j = 0 ; j < sexo.size();j++){
            if(sexo.get(j)=="feminino"){
                mulher++;

            }
        }
        System.out.println("Quantas pessoas do sexo feminino? " + mulher);
        }

    }





