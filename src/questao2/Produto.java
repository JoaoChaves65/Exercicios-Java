package questao2;

public class Produto {
    String nome;
    double preco;
    int quantidade;
    
    public Produto(String nome, double preco, int quantidade){
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }
    
    public double valorCompra() {
        double valorTotal;

        if (quantidade <= 10) {
            valorTotal = preco * quantidade;
        } else if (quantidade <= 20) {
            valorTotal = preco * quantidade * 0.9; 
        } else if (quantidade <= 50) {
            valorTotal = preco * quantidade * 0.8; 
        } else {
            valorTotal = preco * quantidade * 0.75; 
        }

        return valorTotal;
    }
    
}
