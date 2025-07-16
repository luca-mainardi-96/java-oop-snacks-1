package snack3;

public class RegistroStudenti {

    private String studenti[];
    private int indiceArray;

    public RegistroStudenti(){
        studenti = new String[10];
        indiceArray = 0;
    }

    public void AggiungiStudente(String nome, String cognome){
       if (indiceArray < studenti.length) {
            String nomeCompleto = nome + " " + cognome;
            studenti[indiceArray] = nomeCompleto;
            indiceArray++;
        } else {
            System.out.println("Il registro è pieno.");
        } 
    }
    
    public void stampaRegistro(){
        for(int i=0; i<indiceArray; i++){
            System.out.println(studenti[i]);
        }
    }
}


// Snack 3: Registro Studenti
// Crea una classe RegistroStudenti che rappresenti un registro di studenti. Utilizza un array privato per memorizzare oggetti Studente. Implementa un costruttore senza parametri per inizializzare il registro vuoto e un metodo pubblico per aggiungere studenti al registro. Aggiungi un metodo che stampi la lista degli studenti.