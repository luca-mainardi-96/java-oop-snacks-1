package snack4;

import java.util.Scanner;

public class app {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Domanda d1 = new Domanda(
            "Qual è la capitale d'Italia?",
            "Roma"
        );

        System.out.println("Domanda:");
        System.out.println(d1.getTesto());
        System.out.print("La tua risposta: ");
        String rispostaUtente = input.nextLine();

        d1.stampaRisultato(rispostaUtente);

    }
}

