public interface Expecializacao {
    String receberReclamacao(String mensagem);
    String  receberAgendamento(String mensagem);
    String receberPedido(String mensagem);
}
