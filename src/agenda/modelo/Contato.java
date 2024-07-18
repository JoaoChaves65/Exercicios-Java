package modelo;

public class Contato {
    private String nome;
    private String telefone;
    private String tipo; 
    
    public Contato(String nome, String telefone, String tipo) {
        this.nome = nome;
        this.telefone = telefone;
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
