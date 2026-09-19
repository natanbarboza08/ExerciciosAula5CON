package Ex2;

public class Cliente {
    String codigo;
    String segmento;
    String nivelAtendimento;
    Consultor consultor;

    public Cliente(String codigo, String segmento, String nivelAtendimento, Consultor consultor) {
        this.codigo = codigo;
        this.segmento = segmento;
        this.nivelAtendimento = nivelAtendimento;
        this.consultor = consultor;
    }

    public void exibirInformacoes() {
        System.out.println("Código do cliente: " + codigo);
        System.out.println("Segmento: " + segmento);
        System.out.println("Nível de atendimento: " + nivelAtendimento);
        System.out.println("Consultor responsável: " + consultor.nome);
    }
}