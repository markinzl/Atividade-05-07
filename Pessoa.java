import javax.swing.JOptionPane;

public class Pessoa {
    //Atributos
    private  String nome;
    public int idade;
    protected double renda;

    public Pessoa() {}

    public Pessoa (String n, int i, double r){

        this.nome = n;
        this.idade = i;
        this.renda = r;
    }

    //métodos
    public void imprimeDados() {
        JOptionPane.showMessageDialog(null, "nome"+ nome
        +"\nIdade: " + idade
        +"\nRenda: "+renda);
    }

    //métodos de acesso
    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double getRenda() {
        return renda;
    }

    public void setNome (String n) {
        nome = n;
     }
    
    public void setIdade(int i) {
        idade = i;
    }
    public void setRenda(double r){
        renda = r;
    }
}
    

    
    

