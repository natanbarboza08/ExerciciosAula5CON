package Ex2;

public class Main {
    public static void main(String[] args) {
        
        System.out.println("=== CTI INSIGHTS ===");

        System.out.println("--- CONSULTOR ---");
        Consultor consultor1 = new Consultor("Daniel Vieira", "CON-9934");
        consultor1.exibirInformacoes();

        System.out.println("\n--- CLIENTE ---");
        Cliente cliente1 = new Cliente("CLI-067", "Indústria", "Premium", consultor1);
        cliente1.exibirInformacoes();

        System.out.println("\n--- SERVIÇO ---");
        Servico servico1 = new Servico("Monitoramento de máquinas", "Telemetria industrial");
        servico1.exibirInformacoes();

        System.out.println("\n--- CONTRATO ---");
        Contrato contrato1 = new Contrato("25/12/2025", "Ativo", cliente1, servico1);
        contrato1.exibirInformacoes();

        System.out.println("\n--- TELEMETRIA ---");
        Telemetria telemetria1 = new Telemetria("Leitura de temperatura", "Sucesso", "02/03/2026 18:11", servico1);
        telemetria1.exibirInformacoes();

        System.out.println("\n--- INSIGHTS ---");
        Insights insight1 = new Insights("Alerta", "Temperatura acima da média", "04/09/2026 15:31", contrato1);
        insight1.exibirInformacoes();


    }
}