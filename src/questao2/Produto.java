package questao2;

public class Produto {
    private String nome;
    private double preco;
    private int quantidade;
    
    public Produto(String nome, double preco, int quantidade){
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
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
