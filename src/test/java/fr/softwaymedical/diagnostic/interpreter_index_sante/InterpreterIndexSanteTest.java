package fr.softwaymedical.diagnostic.interpreter_index_sante;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class InterpreterIndexSanteTest {
    private InterpreterIndexSante interpreterIndexSante;

    @BeforeEach
    void setUp() {
        interpreterIndexSante = new InterpreterIndexSante();
    }

    @ParameterizedTest(name = "pour index de santé {0}")
    @ValueSource(ints = {0, 1, 34})
    void casNonMultipleTroisOuCinqDoitRenvoyerVide(int indexSante) {

        //GIVEN

        //WHEN
        List<String> diagnostic = interpreterIndexSante.execute(indexSante);


        //THEN
        assertThat(diagnostic).isEmpty();
    }


    @ParameterizedTest(name = "pour index de santé {0}")
    @ValueSource(ints = {3, 6, 33})
    void casIndexMultipleTroisDoitRenvoyerCardiologie(int indexSante) {

        //GIVEN

        //WHEN
        List<String> diagnostic = interpreterIndexSante.execute(indexSante);


        //THEN
        assertThat(diagnostic).hasSize(1);
        assertThat(diagnostic.get(0)).isEqualTo("Cardiologie");
    }


    @ParameterizedTest(name = "pour index de santé {0}")
    @ValueSource(ints = {5, 10, 55})
    void casMultipleCinqDoitRenvoyerTraumatologie(int indexSante) {
        //GIVEN

        //WHEN
        List<String> diagnostic = interpreterIndexSante.execute(indexSante);


        //THEN
        assertThat(diagnostic).hasSize(1);
        assertThat(diagnostic.get(0)).isEqualTo("Traumatologie");
    }

    @ParameterizedTest(name = "pour index de santé {0}")
    @ValueSource(ints = {15, 30, 90})
    void casMultipleTroisEtCinqDoitRenvoyerCardiologieEtTraumatologie(int indexSante) {
        //GIVEN

        //WHEN
        List<String> diagnostic = interpreterIndexSante.execute(indexSante);


        //THEN
        assertThat(diagnostic).hasSize(2).containsAll(Arrays.asList("Traumatologie", "Cardiologie"));
    }

}