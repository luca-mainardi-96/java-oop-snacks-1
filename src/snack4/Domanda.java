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



// Snack 4
// Creare una classe che rappresenta una domanda di un quiz a risposta aperta. La classe dovrà permettere di:
// - salvare il testo della domanda e la risposta corretta
// - fornire un metodo per verificare se una risposta dell'utente è corretta
// - aggiungere un metodo che stampa direttamente il risultato
// Fare una classe Main con metodo main che ponga la domanda, faccia rispondere l'utente con uno Scanner e validi la risposta.