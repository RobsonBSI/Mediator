public class Paciente {
    public String marcarConsulta(String mensagem) {
        return Atendente.getInstancia().receberHorarioDiaConsulta(mensagem);
    }

    public String reclamarMedico(String mensagem) {
        return Atendente.getInstancia().receberReclamacaoMedico(mensagem);
    }

    public String pedirReceita(String mensagem) {
        return Atendente.getInstancia().receberPedidoReceita(mensagem);
    }

}
