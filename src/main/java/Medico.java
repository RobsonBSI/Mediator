public class Medico implements Expecializacao {

    private static Medico instancia = new Medico();

    private Medico() {}

    public static Medico getInstancia() {
        return instancia;
    }

    public String receberAgendamento(String mensagem) {
        return "O departamento Medico confirma sua consulta - " + mensagem;
    }

    public String receberReclamacao(String mensagem) {
        return "O deparatamento medico agradece a mensagem e analisarar sua demanda: " + mensagem;
    }

    public String receberPedido(String mensagem) {
        return "O departamento Medico vai analisar o seu pedido se aceito enviarar por email a Recita : " + mensagem;
    }
}
