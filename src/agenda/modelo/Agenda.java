package modelo;

public class Agenda {
    private Contato contato;

    public Contato getContato() {
        return contato;
    }

    public void setContato(Contato contato) {
        this.contato = contato;
    }

    public void imprimirAgenda() {
        if (contato != null) {
            System.out.println("Dados do Contato:");
            System.out.println("Nome: " + contato.getNome());
            System.out.println("Telefone: " + contato.getTelefone());
            System.out.println("Tipo: " + contato.getTipo());
        } else {
            System.out.println("Agenda vazia. Nenhum contato registrado.");
        }
    }
}
