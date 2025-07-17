package snack3;

public class RegistroStudenti {

    private String studenti[];
    private int indiceArray;

    public RegistroStudenti(){
        studenti = new String[10];
        indiceArray = 0;
    }
                 
        //nadava usato insieme alla classe studente, per recuperare gli studenti da "snack1"
        //e  non doverli riscrivere

    // public void aggiungiStudente(Studente studente){
    //     if(indiceArray < registro.length){
    //         registro[indiceArray] = studente;
    //         indiceArray++
    //     }else {
    //         System.out.println("Registro pieno.");
    //     }
    // }

    

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
