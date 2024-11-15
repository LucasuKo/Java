package contas;

public class TestaMetodo {

	public static void main(String[] args) {
		Conta contaLucas = new Conta();

		contaLucas.deposita(100);

		contaLucas.deposita(70);
		System.out.println(contaLucas.getSaldo());

		contaLucas.saca(200);
		System.out.println("O saldo antes da transferencia é:" + contaLucas.getSaldo());

		Conta contaMaria = new Conta();
		contaMaria.deposita(1000);

		System.out.println("O saldo da maria antes da transferencia é :" + contaMaria.getSaldo());

		contaMaria.transfere(300, contaLucas);

		System.out.println("O saldo da Maria depois da transferencia é: " + contaMaria.getSaldo());
		System.out.println("O saldo da Lucas depois da transferencia é: " + contaLucas.getSaldo());

	}

}
