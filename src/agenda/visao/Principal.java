package visao;

import javax.swing.JOptionPane;
import modelo.Agenda;
import modelo.Contato;

public class Principal {
    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog("Digite seu nome: ");
        String telefone = JOptionPane.showInputDialog("Digite seu telefone: ");
        String tipo = JOptionPane.showInputDialog("Digite o tipo (Celular ou Telefone): ");
        
        Contato meuContato = new Contato(nome, telefone, tipo);
        Agenda minhaAgenda = new Agenda();
        minhaAgenda.setContato(meuContato);

        minhaAgenda.imprimirAgenda();
    }
}
