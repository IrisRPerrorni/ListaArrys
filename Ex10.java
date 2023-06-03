import java.util.ArrayList;

public class Ex10 {
    //Criar um vetor A com 10 elementos inteiros.
    // Implementar um programa que defina e escreva a média aritmética simples dos elementos
    // ímpares armazenados neste vetor
    public static void main(String[] args) {
        ArrayList<Double> vetor = new ArrayList<>();
        vetor.add(10.0);
        vetor.add(20.0);
        vetor.add(25.0);
        vetor.add(48.0);
        vetor.add(47.0);
        vetor.add(48.0);
        vetor.add(55.0);
        vetor.add(80.0);
        vetor.add(45.0);
        vetor.add(50.0);

        System.out.println("=======Valor do vetor:==========");
        System.out.println(vetor);

        double soma = 0;

        for (int i = 0 ; i< vetor.size(); i++){
            if((vetor.get(i) % 2) != 0){
                soma = soma + vetor.get(i);
            }
        }
        System.out.println("A média aritmétrica é : " + (soma/10));
    }
}
