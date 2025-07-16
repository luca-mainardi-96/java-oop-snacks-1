package snack1;

public class Studente {

private String nome;
private String cognome;
private int eta;
private String studente;

    public Studente(String nome, String cognome, int eta){
        this.nome = nome;
        this.cognome= cognome;
        this.eta = eta;

        studente = nome + " " + cognome + ", " + eta;
        System.out.println(studente);
    }

}
    