package Ex2;

public class Contrato {
    String dataInicio;
    String status;
    Cliente cliente;
    Servico servico;

    public Contrato(String dataInicio, String status, Cliente cliente, Servico servico) {
        this.dataInicio = dataInicio;
        this.status = status;
        this.cliente = cliente;
        this.servico = servico;
    }

    public void exibirInformacoes() {
        System.out.println("Data de início: " + dataInicio);
        System.out.println("Status: " + status);
        System.out.println("Cliente: " + cliente.codigo);
        System.out.println("Serviço: " + servico.nome);
    }
}