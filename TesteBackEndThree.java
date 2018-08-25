package teste.back.end.three;

import java.util.Scanner;

public class TesteBackEndThree {
    public static void main(String[] args) {
        float ht;
        float vh;
        float sb;
        float sr;
        
        Scanner t = new Scanner(System.in);
        System.out.print("Digite o total de horas trabalhadas: ");
        ht = t.nextFloat();
        vh = ht * 0.10f;
        System.out.println("Valor por hora trabalhada = R$" + vh);
        sb = ht * vh;
        sr = sb - 0.3f;
        System.out.println("Salario a receber = R$" + sr);
    }
}
