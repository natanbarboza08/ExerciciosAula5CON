package Ex2;

public class Insights {
    String tipo;
    String descricao;
    String geradoEm;
    Contrato contrato;

    public Insights(String tipo, String descricao, String geradoEm, Contrato contrato) {
        this.tipo = tipo;
        this.descricao = descricao;
        this.geradoEm = geradoEm;
        this.contrato = contrato;
    }

    public void exibirInformacoes() {
        System.out.println("Tipo: " + tipo);
        System.out.println("Descrição: " + descricao);
        System.out.println("Gerado em: " + geradoEm);
        System.out.println("Contrato: " + contrato.dataInicio);
    }
}