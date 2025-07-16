package snack2;

public class ContoBancario {
    
    private int numeroConto;
    private double saldo;
    private double deposito;
    private double prelievo;

    public ContoBancario(int numeroConto){
        this.numeroConto = numeroConto;
        saldo = 0;
    }

    public double deposito(double deposito){
        this.deposito = deposito;
        saldo = saldo + deposito;
        return saldo;
    }

    public double prelievo(double prelievo){
        this.prelievo = prelievo;
        if((saldo-prelievo)<0){
            System.out.println("Saldo insufficiente per procedere con l'operazione.");
        }else{
            saldo = saldo - prelievo;
        }
        return saldo;
    }

    public double getSaldo() {
        System.out.println("Il tuo saldo è " + saldo + " euro.");
        return saldo;
    }
}
