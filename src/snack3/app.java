package snack3;

public class app {
    public static void main(String[] args) {
        RegistroStudenti r1 = new RegistroStudenti();
        r1.AggiungiStudente("A", "B");
        r1.AggiungiStudente("C", "X");
        r1.AggiungiStudente("Y", "Z");
        r1.AggiungiStudente("A", "B");
        r1.AggiungiStudente("C", "X");
        r1.AggiungiStudente("Y", "Z");
        r1.AggiungiStudente("A", "B");
        r1.AggiungiStudente("C", "X");
        r1.AggiungiStudente("Y", "Z");
        r1.AggiungiStudente("A", "B");
        r1.AggiungiStudente("C", "X");
        r1.AggiungiStudente("Y", "Z");
        r1.stampaRegistro();
    }
    
}
