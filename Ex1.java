import java.util.ArrayList;

public class Ex1 {

    //Escreva um programa para remover um elemento específico de uma lista.

    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<>();
        lista.add("macarrão ao pesto");
        lista.add("bife a milanesa");
        lista.add("frango grelhado");
        lista.add("picanha na brasa");
        lista.add("feijoada");
        lista.add("salada");


        System.out.println("=======Cardápio cadastrado:==========");
        System.out.println(lista);
        lista.remove("salada");
        System.out.println("=======Cardápio atualizado:==========");
        System.out.println(lista);




    }

}
