package snack4;

public class Domanda {
    private String testo;
    private String rispostaCorretta;

    public Domanda(String testo, String rispostaCorretta) {
        this.testo = testo;
        this.rispostaCorretta = rispostaCorretta;
    }

    public String getTesto() {
        return testo;
    }

    public boolean verificaRisposta(String rispostaUtente) {
        return rispostaUtente.trim().equalsIgnoreCase(rispostaCorretta.trim());
    }

    public void stampaRisultato(String rispostaUtente) {
        if (verificaRisposta(rispostaUtente)) {
            System.out.println("Risposta corretta!");
        } else {
            System.out.println("Risposta sbagliata.");
            System.out.println("Risposta corretta: " + rispostaCorretta);
        }
    }
}
