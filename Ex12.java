import java.util.Random;

public class Ex12 {
    //Ler um vetor A com 20 elementos.
    // Construir dois vetores B e C, sendo que nos vetor B e C serão armazenados o valores pares e ímpares de A,
    // respectivamente.

    public static void main(String[] args) {
        int [] vetorA = new int[20];
        Random random = new Random();
        int par = 0 ;
        int impar = 0;

        for(int i = 0; i < vetorA.length; i++){
            vetorA[i] = random.nextInt(20);
            System.out.println(vetorA[i]);

        }
        for(int j = 0 ; j < vetorA.length ; j++){
            if((vetorA[j]%2)==0){
                par++;

            } else {
                impar ++ ;
            }
        }
        int [] vetorB = new int[par];
        int [] vetorC = new int[impar];

        int p = 0 ;
        int i = 0;

        for (int n : vetorA){
            if(n%2 == 0){
                vetorB[p++] = n;
            }else {
                vetorC[i++] = n;

            }
        }
        System.out.println("\n Vetor A - ");
        for(int x : vetorA){
            System.out.println(x + " ");
        }
        System.out.println("\n Vetor B - ");
        for ( int x : vetorB){
            System.out.println( x + " ");
        }
        System.out.println("\n Vetor C - ");
        for (int x : vetorC){
            System.out.println( x + " ");

        }

    }
}
