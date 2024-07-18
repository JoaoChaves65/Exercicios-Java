package questao1;

public class Cliente {
    String nome;
    String cpf;
    String telefone;
    String sexo;
    int anoDeNascimento;
    
    public Cliente() {
        
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
