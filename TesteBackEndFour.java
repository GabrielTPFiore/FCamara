package teste.back.end.four;

import java.util.Scanner;

public class TesteBackEndFour {
    public static void main(String[] args) {
        int a;
        int l = 1;
        float t = 80;
        float r;
        
     Scanner us = new Scanner(System.in);
        System.out.print("Digite o tamanho da área: ");
     a = us.nextInt();
     r = a / 3;
       if (r <= 18){
            l = 1;
         if(l <= 1){
           t = t * 1;
        System.out.println("Para " + a + " m² necessita de " + l + " latas de tinta");
        System.out.println("Valor total: R$" + t);
       }
       }
        else if (r <= 36) {
            l = 2;
       if(l <= 2){
           t = t * 2;
        System.out.println("Para " + a + " m² necessita de " + l + " latas de tinta");
        System.out.println("Valor total: R$" + t);   
       }
        }
       else if (r <= 54){
            l = 3;
       if(l <= 3){
           t = t * 3;
        System.out.println("Para " + a + " m² necessita de " + l + " latas de tinta");
        System.out.println("Valor total: R$" + t);   
       }
    }
       else if (r <= 72){
            l = 4;
       if(l <= 4){
           t = t * 4;
        System.out.println("Para " + a + " m² necessita de " + l + " latas de tinta");
        System.out.println("Valor total: R$" + t);   
       }
    }
}
}