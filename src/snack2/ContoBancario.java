package snack2;

public class ContoBancario {
    
    private String numeroConto;
    private double saldo;

    public ContoBancario(String numeroConto){
        this.numeroConto = numeroConto;
        saldo = 0;
    }

    public void deposito(double importo){
        if(importo >= 0){
            this.saldo += importo; 
        }else{
            System.out.println("Impossibile depositare importo negativo.");
        }
    }

    public void prelievo(double importo){
        if(importo >= 0 && importo <= saldo){
            this.saldo -= importo;
        }else{
            System.out.println("Impossibile prelevare");
        }
        
    }

    public double getSaldo() {
        System.out.println("Il tuo saldo è " + saldo + " euro.");
        return saldo;
    }
}
