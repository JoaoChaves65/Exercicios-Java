package questao1;

public class Cliente {
    private String nome;
    private String cpf;
    private String telefone;
    private String sexo;
    private int anoDeNascimento;
    
    public Cliente() {
        
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getAnoDeNascimento() {
        return anoDeNascimento;
    }

    public void setAnoDeNascimento(int anoDeNascimento) {
        this.anoDeNascimento = anoDeNascimento;
    }
    
    public String retornarDados(){
        return "Nome: " + nome + "\nCPF: " + cpf + "\nTelefone: " + telefone + "\nSexo: " + sexo + "\nAno de nascimento: " + anoDeNascimento;
    }
    
    public int calcularIdade(){
        return 2024 - anoDeNascimento;
    }
    
    public boolean maiorDeIdade(){
        return calcularIdade() > 18;
    } 

}
