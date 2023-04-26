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
        return "O deparatamento medico agradece a mensagem: " + mensagem;
    }

    public String receberPedido(String mensagem) {
        return "A Secretaria vai analisar a sugestão: " + mensagem;
    }
}
