public class Ex9 {
    //Crie um programa para exibir a soma de 20 números usando uma matriz.

    public static void main(String[] args) {

        // [] primeiro indice linha
        // [] segundo é coluna

        int[][] num = new int[4][5];

        num[0][0] = 10;
        num[0][1] = 10;
        num[0][2] = 5;
        num[0][3] = 7;
        num[0][4] = 7;

        num[1][0] = 10;
        num[1][1] = 5;
        num[1][2] = 5;
        num[1][3] = 7;
        num[1][4] = 7;

        num[2][0] = 10;
        num[2][1] = 20;
        num[2][2] = 5;
        num[2][3] = 30;
        num[2][4] = 7;

        num[3][0] = 10;
        num[3][1] = 9;
        num[3][2] = 5;
        num[3][3] = 7;
        num[3][4] = 7;

        int soma = 0;


        for (int linha = 0; linha < num.length; linha++) {
            for (int coluna = 0; coluna < num[linha].length; coluna++) {

                System.out.print(num[linha][coluna] + " - ");
                soma += num[linha][coluna];
            }
            System.out.println();

        }
        System.out.println("A soma de todos os números da matriz é : " + soma);
    }

}



