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
}