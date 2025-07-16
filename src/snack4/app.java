package snack4;

import java.util.Scanner;

public class app {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Domanda domanda = new Domanda(
            "Qual è la capitale d'Italia?",
            "Roma"
        );

        System.out.println("DOMANDA:");
        System.out.println(domanda.getTesto());
        System.out.print("La tua risposta: ");
        String rispostaUtente = input.nextLine();

        domanda.stampaRisultato(rispostaUtente);

        input.close();
    }
}

