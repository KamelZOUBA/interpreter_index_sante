package softwaymedical.diagnostic.interpreter_index_sante;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class InterpreterIndexSanteTest {
    private InterpreterIndexSante interpreterIndexSante;

    @BeforeEach
    void setUp() {
        interpreterIndexSante = new InterpreterIndexSante();
    }

    @Test
    void casZeroDoitRenvoyerNull() {

        //GIVEN

        //WHEN
        String diagnostic = interpreterIndexSante.execute(0);


        //THEN
        assertThat(diagnostic).isNull();
    }

    @Test
    void casUnDoitRenvoyerNull() {

        //GIVEN

        //WHEN
        String diagnostic = interpreterIndexSante.execute(1);


        //THEN
        assertThat(diagnostic).isNull();
    }

    @Test
    void casTroisDoitRenvoyerCardiologie() {

        //GIVEN

        //WHEN
        String diagnostic = interpreterIndexSante.execute(3);


        //THEN
        assertThat(diagnostic).isEqualTo("Cardiologie");
    }

    @Test
    void casSixDoitRenvoyerCardiologie() {
        //GIVEN

        //WHEN
        String diagnostic = interpreterIndexSante.execute(6);


        //THEN
        assertThat(diagnostic).isEqualTo("Cardiologie");
    }

    @Test
    void casCinqDoitRenvoyerTraumatologie() {
        //GIVEN

        //WHEN
        String diagnostic = interpreterIndexSante.execute(5);


        //THEN
        assertThat(diagnostic).isEqualTo("Traumatologie");
    }

    @Test
    void casDixDoitRenvoyerTraumatologie() {
        //GIVEN

        //WHEN
        String diagnostic = interpreterIndexSante.execute(10);


        //THEN
        assertThat(diagnostic).isEqualTo("Traumatologie");
    }

    @Test
    void casQuinzeDoitRenvoyerCardiologieEtTraumatologie() {
        //GIVEN

        //WHEN
        String diagnostic = interpreterIndexSante.execute(15);


        //THEN
        assertThat(diagnostic).isEqualTo("Traumatologie");
    }

}