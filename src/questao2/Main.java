package questao2;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args){
        String nome = JOptionPane.showInputDialog("Digite o nome do produto:");

        String precoStr = JOptionPane.showInputDialog("Digite o preço do produto:");
        double preco = Double.parseDouble(precoStr);

        String quantidadeStr = JOptionPane.showInputDialog("Digite a quantidade do produto:");
        int quantidade = Integer.parseInt(quantidadeStr);

        Produto produto = new Produto(nome, preco, quantidade);

        double valorTotal = produto.valorCompra();

        JOptionPane.showMessageDialog(null, "Valor total da compra: R$" + valorTotal);
    } 
}
