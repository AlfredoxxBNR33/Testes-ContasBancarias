package Cliente;

public class Cliente {

    private String Nome;
    private String CPF;

    public Cliente(String nome, String CPF) {
        this.Nome = nome;
        this.CPF = CPF;
    }

    public String getNome() {
        return this.Nome;
    }

    public String getCPF() {
        return this.CPF;
    }

}
