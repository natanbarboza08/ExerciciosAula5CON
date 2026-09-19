package Ex2;

public class Consultor {
    String nome;
    String matricula;

    public Consultor(String nome, String matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }

    public void exibirInformacoes() {
        System.out.println("Consultor: " + nome);
        System.out.println("Matrícula: " + matricula);
    }
}