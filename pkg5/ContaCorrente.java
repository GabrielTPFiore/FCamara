package teste.back.end.pkg5;
public class ContaCorrente implements Acoes {
    //ATRIBUTOS
    protected int conta;
    protected String nome;
    protected float saldo;
    
            //IMPLEMENTS
    @Override
    public void alterarNome() {
        this.setNome(this.getNome());
    }
    
    @Override
    public void deposito(float v) {
          //this.saldo = this.saldo + v;
            this.setSaldo(this.getSaldo() + v);
            System.out.println("Deposito realizado na conta de " + this.getNome());
        }

    @Override
    public void saque(float v) {
            if (this.getSaldo() >= v){
                this.setSaldo(this.getSaldo() - v);
                System.out.println("Saque realizado na conta de " + this.getNome());
            } else {
                System.out.println("Saldo insuficiente para saque.");
            } 
            }
   
    //CONSTRUTOR
    public ContaCorrente(int conta, String nome) {
        this.conta = conta;
        this.nome = nome;
    }
    
    //GETTERS e SETTERS
    public int getConta() {
        return conta;
    }
    public void setConta(int conta) {
        this.conta = conta;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getSaldo() {
        return saldo;
    }
    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
    
    //TO STRING
    @Override
    public String toString() {
        return "ContaCorrente" + "conta = " + conta + "\nnome = " + nome + 
                "\nsaldo = " + saldo + "";
    }
}
