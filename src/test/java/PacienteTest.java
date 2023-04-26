import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PacienteTest {
    @Test
    void deveAgendaConsulta() {
        Paciente paciente1 = new Paciente();
        assertEquals("A Recepção agradeçe o seu contato.\n"+
                        " O Medico respondeu e confirmou conforme a mensagem a seguir.\n"+
                        ">>O departamento Medico confirma sua consulta - 20/05/2023 as 18:00 hs",
                paciente1.marcarConsulta("20/05/2023 as 18:00 hs"));
    }

    @Test
    void devePedirReceita() {
        Paciente paciente1 = new Paciente();
        assertEquals("A Recepção agradeçe o seu contato.\n"+
                        "O medico respondeu seu pedido e respondeu conforme a  mensagem a seguir.\n" +
                        ">>O departamento Medico vai analisar o seu pedido se aceito enviarar por email a Recita : Mediformina 500mg",
                paciente1.pedirReceita("Mediformina 500mg"));
    }


    @Test
    void deveReceberReclamacao() {
        Paciente paciente1 = new Paciente();
        assertEquals("A Recepção agradeçe o seu contato.\n"+
                "O Medico respondeu sua demanda conforme mensagem a seguir.\n" +
                        ">>O deparatamento medico agradece a mensagem e analisarar sua demanda: Medico não foi atencioso",
                paciente1.reclamarMedico("Medico não foi atencioso"));
    }
}