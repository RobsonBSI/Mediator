public class Atendente {

    private static Atendente instancia = new Atendente();

    private Atendente() {}

    public static Atendente getInstancia() {
        return instancia;
    }

    public String receberHorarioDiaConsulta(String mensagem) {
        return "A Recepção agradeçe o seu contato.\n"+
                " O Medico respondeu e confirmou conforme a mensagem a seguir.\n" +
                ">>" + Medico.getInstancia().receberAgendamento(mensagem);
    }

    public String receberReclamacaoMedico(String mensagem) {
        return "A Recepção agradeçe o seu contato.\n"+
                "O Medico respondeu sua demanda conforme mensagem a seguir.\n" +
                ">>" + Medico.getInstancia().receberReclamacao(mensagem);
    }

    public String receberPedidoReceita(String mensagem) {
        return "A Recepção agradeçe o seu contato.\n"+
                "O medico respondeu seu pedido e respondeu conforme a  mensagem a seguir.\n" +
                ">>" + Medico.getInstancia().receberPedido(mensagem);
    }




}
