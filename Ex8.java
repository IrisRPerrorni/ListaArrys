public class Ex8 {
    //Crie um programa para exibir todos os inteiros dentro do intervalo 100-150
    // cuja soma de todos os dígitos é um número par.
    public static void main(String[] args) {
        int soma = 0;
        System.out.println("Os números correspondentes ao intervalos [100 - 150] são:  ");
        for(int j = 100 ; j <= 150; j++){
            System.out.println( j);
        }
        System.out.println("==========Encontrando a soma dos dígitos que resultam números pares ============= ");
        for (int i = 100; i <= 150; i++) {
            int und = i % 10 ;
            int dez = ( i%100)/10;
            int cent = (i/100);
            int somadig = und + dez + cent ;

            if(somadig % 2 == 0){
                System.out.println( i + " soma digito: " + somadig);
                soma+=i;
            }
        }
        System.out.println("Soma total de todos os somatorios de digitos pares é " + soma );

    }
}
