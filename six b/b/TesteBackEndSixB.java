package teste.back.end.six.b;
public class TesteBackEndSixB {
    public static void main(String[] args) {
        
        Retangulo r = new Retangulo(0, 0);
        
       r.mudarValor();
       r.retornarValor();
       r.calcularArea(0f);
       r.calcularPerimetro(0f);
       System.out.println(r.toString());
    }
    
}
