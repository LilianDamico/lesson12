package curso_java;

import java.util.Scanner;

public class lesson12 {
    public static void main(String[] args){
        final double n_aval = 4;
        double n1, n2, n3, n4;
        double med, med_tot = 0;
        int i;
        Scanner teclado = new Scanner(System.in);

        for(i = 1; i <= 3; i++){
            System.out.println("Informe a primeira nota: ");
            n1 = teclado.nextDouble();
            System.out.println("Informe a segunda nota: ");
            n2 = teclado.nextDouble();
            System.out.println("Informe a terceira nota: ");
            n3 = teclado.nextDouble();
            System.out.println("Informe a quarta nota: ");
            n4 = teclado.nextDouble();
            med = (n1 + n2 + n3 + n4)/n_aval;
            System.out.println("Média = "+med);
            med_tot = (med_tot + med)/i;
            System.out.println("Media total = "+med_tot);
        }

    }
}
