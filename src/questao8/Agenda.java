package questao8;

public class Agenda {
    private static final int tamanhoMaximo = 10;
    private String[] nomes;
    private int[] idades;
    private float[] alturas;
    private int totalPessoas;

    public Agenda() {
        nomes = new String[tamanhoMaximo];
        idades = new int[tamanhoMaximo];
        alturas = new float[tamanhoMaximo];
        totalPessoas = 0;
    }

    public void armazenaPessoa(String nome, int idade, float altura) {
        if (totalPessoas < tamanhoMaximo) {
            nomes[totalPessoas] = nome;
            idades[totalPessoas] = idade;
            alturas[totalPessoas] = altura;
            totalPessoas++;
        } else {
            System.out.println("Agenda cheia! Não é possível adicionar mais pessoas.");
        }
    }

    public void removePessoa(String nome) {
        int indice = buscaPessoa(nome);
        if (indice != -1) {
            for (int i = indice; i < totalPessoas - 1; i++) {
                nomes[i] = nomes[i + 1];
                idades[i] = idades[i + 1];
                alturas[i] = alturas[i + 1];
            }
            totalPessoas--;
        } else {
            System.out.println("Pessoa não encontrada na agenda.");
        }
    }

    public int buscaPessoa(String nome) {
        for (int i = 0; i < totalPessoas; i++) {
            if (nomes[i].equalsIgnoreCase(nome)) {
                return i; 
            }
        }
        return -1; 
    }

    public void imprimeAgenda() {
        System.out.println("Agenda:");
        for (int i = 0; i < totalPessoas; i++) {
            System.out.println("Nome: " + nomes[i] + ", Idade: " + idades[i] + ", Altura: " + alturas[i]);
        }
    }

    public void imprimePessoa(int index) {
        if (index >= 0 && index < totalPessoas) {
            System.out.println("Dados da pessoa na posição " + index + ":");
            System.out.println("Nome: " + nomes[index] + ", Idade: " + idades[index] + ", Altura: " + alturas[index]);
        } else {
            System.out.println("Posição inválida na agenda.");
        }
    }


}
