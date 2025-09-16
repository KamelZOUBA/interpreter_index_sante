package fr.softwaymedical.diagnostic.interpreter_index_sante;

import java.util.ArrayList;
import java.util.List;

/**
 * class qui interprète l'index de santé d'un patient pour le rediriger vers la(les) bonne(s) unité(s) médicale(s)
 */
public class InterpreterIndexSante {
    public List<String> execute(int indexSante) {
        List<String> unitesMedicales = new ArrayList<>();
        if (indexSante == 0)
            return unitesMedicales;
        if (indexSante % 3 == 0)
            unitesMedicales.add("Cardiologie");
        if (indexSante % 5 == 0)
            unitesMedicales.add("Traumatologie");
        return unitesMedicales;
    }
}
