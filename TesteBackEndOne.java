package teste.back.end.one;
public class TesteBackEndOne {
    public static void main(String[] args) {
        float si = 1000f;
        float ai = 0.015f;
        float ad = 0.03f;
        int a = 2008;
        float i;
        float aa = 0;
        
        float sa06 = si * ai;
        float sat = si + sa06;
        System.out.println("Salario de 2006 com aumento de " + ai + " ficou: " + sat);
        float sa0 = sat * ad;
        float sa07 = sat + sa0;
        System.out.println("Salario de 2007 com aumento de " + ad + " ficou: " + sa07);
        
        //TIVE DIFICULDADE PARA FAZER A MULTIPLICAÇÃO DA % DE AUMENTO DENTRO DO LOOP
        
        for(a = 2008; a <= 2018; a++){
            aa = ad * 2;
            System.out.println("Salario de " + a + " com aumento de " + aa + " ficou: " + (sa07 * aa + sa07));
            aa = ad * 4;
            System.out.println("Salario de " + a + " com aumento de " + aa + " ficou: " + (sa07 * aa + sa07));
            aa = ad * 8;
            System.out.println("Salario de " + a + " com aumento de " + aa + " ficou: " + (sa07 * aa + sa07));
            aa = ad * 16;
            System.out.println("Salario de " + a + " com aumento de " + aa + " ficou: " + (sa07 * aa + sa07));
            aa = ad * 32;
            System.out.println("Salario de " + a + " com aumento de " + aa + " ficou: " + (sa07 * aa + sa07));
            aa = ad * 64;
            System.out.println("Salario de " + a + " com aumento de " + aa + " ficou: " + (sa07 * aa + sa07));
            aa = ad * 128;
            System.out.println("Salario de " + a + " com aumento de " + aa + " ficou: " + (sa07 * aa + sa07));
            aa = ad * 256;
            System.out.println("Salario de " + a + " com aumento de " + aa + " ficou: " + (sa07 * aa + sa07));
            aa = ad * 512;
            System.out.println("Salario de " + a + " com aumento de " + aa + " ficou: " + (sa07 * aa + sa07));
            aa = ad * 1024;
            System.out.println("Salario de " + a + " com aumento de " + aa + " ficou: " + (sa07 * aa + sa07));
            break;
            }
            
            }
        }