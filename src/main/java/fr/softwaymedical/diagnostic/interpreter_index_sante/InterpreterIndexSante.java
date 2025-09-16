package fr.softwaymedical.diagnostic.interpreter_index_sante;

/**
 * class qui interprète l'index de santé d'un patient pour le rediriger vers le(s) bon(s) service(s)
 */
public class InterpreterIndexSante {
    public String execute(int indexSante) {
        if (indexSante == 0)
            return null;
        if (indexSante % 3 == 0)
            return "Cardiologie";
        if (indexSante % 5 == 0)
            return "Traumatologie";
        return null;
    }
}
