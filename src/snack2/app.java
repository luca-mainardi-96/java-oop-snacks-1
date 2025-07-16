package snack2;

public class app {
    public static void main(String[] args) {
        
        ContoBancario c1 = new ContoBancario(1);

        c1.deposito(1500);
        c1.prelievo(800);
        c1.getSaldo();

    }
}
