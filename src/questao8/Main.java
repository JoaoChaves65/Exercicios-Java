package questao8;

public class Main {
    public static void main(String[] args) {
        Agenda minhaAgenda = new Agenda();
        minhaAgenda.armazenaPessoa("Alice", 30, 1.65f);
        minhaAgenda.armazenaPessoa("Bob", 25, 1.80f);
        minhaAgenda.armazenaPessoa("Alice", 30, 1.65f);
        minhaAgenda.armazenaPessoa("Bob", 25, 1.80f);
        minhaAgenda.armazenaPessoa("Alice", 30, 1.65f);
        minhaAgenda.armazenaPessoa("Bob", 25, 1.80f);
        minhaAgenda.armazenaPessoa("Alice", 30, 1.65f);
        minhaAgenda.armazenaPessoa("Bob", 25, 1.80f);
        minhaAgenda.armazenaPessoa("Alice", 30, 1.65f);
        minhaAgenda.armazenaPessoa("Bob", 25, 1.80f);
        minhaAgenda.armazenaPessoa("Alice", 30, 1.65f);
        minhaAgenda.armazenaPessoa("Bob", 25, 1.80f);
        minhaAgenda.armazenaPessoa("Alice", 30, 1.65f);
        minhaAgenda.armazenaPessoa("Bob", 25, 1.80f);
        minhaAgenda.armazenaPessoa("Alice", 30, 1.65f);
        minhaAgenda.armazenaPessoa("Bob", 25, 1.80f);
        minhaAgenda.imprimeAgenda();
        minhaAgenda.removePessoa("Alice");
        minhaAgenda.imprimeAgenda();
    }
}
