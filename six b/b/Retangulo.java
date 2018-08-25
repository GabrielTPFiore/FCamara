package teste.back.end.six.b;

import java.util.Scanner;

public class Retangulo {
    //ATRIBUTOS
        float ladoA;
        float ladoB;

    //CONSTRUTOR
    public Retangulo(float ladoA, float ladoB) {
        this.ladoA = ladoA;
        this.ladoB = ladoB;
    }

    //METODOS
    public void mudarValor(){
        Scanner t = new Scanner(System.in);
        System.out.print("Digite a base: ");
            ladoB = t.nextFloat();
            Scanner tt = new Scanner(System.in);
        System.out.print("Digite a altura: ");
        ladoA = tt.nextFloat();
    }
    
    public void retornarValor(){
        System.out.println("Valor da base é: " + ladoB);
        System.out.println("Valor da altura é: " + ladoA);
    }
    
    public void calcularArea(float ca){
        ca = ladoA * ladoB;
        System.out.println(ca + " m² de piso necessarios.");
    }
    
    public void calcularPerimetro(float cp){
        cp = (ladoA * 2) + (ladoB * 2); 
        System.out.println(cp + " metros de rodapés necessarios.");
    }
    
    //GETTERS E SETTERS
    public float getLadoB() {
        return ladoB;
    }
    public void setLadoB(float b) {
        this.ladoB = b;
    }

    public float getLadoA() {
        return ladoA;
    }
    public void setLadoA(float a) {
        this.ladoA = a;
    }

    //TOSTRING
    @Override
    public String toString() {
        return "Retangulo " + " base = " + ladoB + ", altura = " + ladoA + "";
    }
}
