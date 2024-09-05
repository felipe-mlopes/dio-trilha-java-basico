public class ChequeEspecial {
    private static final double LIMITE_INICIAL = 1000.00;

    private double limite;

    public ChequeEspecial(double limite) {
        this.limite = ChequeEspecial.LIMITE_INICIAL;
    }

    public double getLimite() {
        return limite;
    }
    
    protected void aumentarLimite(double valor) {
        limite += valor;
    }

    protected void reduzirLimite(double valor) {
        if (limite > 0) {
            limite -= valor;
        } else {
            System.out.println("O limite está zerado.");
        }
    }

}
