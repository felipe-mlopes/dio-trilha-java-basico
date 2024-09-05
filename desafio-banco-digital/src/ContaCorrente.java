public class ContaCorrente extends Conta {
	
	private ChequeEspecial chequeEspecial;

	public ContaCorrente(Cliente cliente) {
		super(cliente);
		this.chequeEspecial = new ChequeEspecial();
	}

	public void sacar(double valor) {
		if (saldo >= valor) {
			saldo -= valor;
		} else if (chequeEspecial.temLimiteDisponivel(valor - saldo)) {
			double valorUsadoChequeEspecial = valor - saldo;
			saldo = 0;
			chequeEspecial.usarChequeEspecial(valorUsadoChequeEspecial);
		} else {
			System.out.println("Saldo insuficiente e limite de cheque especial excedido!");
		}
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("=== Extrato Conta Corrente ===");
		super.imprimirInfosComuns();
		chequeEspecial.imprimirLimite();
	}

	private class ChequeEspecial {
		private static final int LIMITE_INICIAL = 1000;

		private double limite;
		private double limiteUtilizado;

		public ChequeEspecial() {
			this.limite = LIMITE_INICIAL;
			this.limiteUtilizado = 0;
		}

		public boolean temLimiteDisponivel(double valor) {
			return (limite - limiteUtilizado) >= valor;
		}

		public void usarChequeEspecial(double valor) {
            if (temLimiteDisponivel(valor)) {
                limiteUtilizado += valor;
                System.out.println(String.format("Cheque especial usado: %.2f", valor));
            } else {
                System.out.println("Limite de cheque especial excedido!");
            }
        }

        public void imprimirLimite() {
            System.out.println(String.format("Limite Cheque Especial: %.2f", limite));
            System.out.println(String.format("Cheque Especial Usado: %.2f", limiteUtilizado));
            System.out.println(String.format("Limite Disponível: %.2f", limite - limiteUtilizado));
        }
	}
	
}
