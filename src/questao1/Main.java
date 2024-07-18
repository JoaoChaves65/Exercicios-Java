package questao1;

public class Main {
    public static void main(String [] args){
        Cliente c1 = new Cliente();
        c1.nome = "João";
        c1.cpf = "000.111.222-00";
        c1.telefone = "(86) 98765-4321";
        c1.sexo = "Masculino";
        c1.anoDeNascimento = 1972;
        
        System.out.println(c1.retornarDados());
        
        System.out.println("Idade: " + c1.calcularIdade());
        
        System.out.println("É maior de idade? " + c1.maiorDeIdade());
    }
}
