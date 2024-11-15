package cliente;

import contas.Conta;

public class TestaBanco {

	public static void main(String[] args) {
		Cliente lucas = new Cliente();
		lucas.nome = "Lucas";
		lucas.CPF = "111.111.111.11";
		lucas.profissao = "Progamador";

		Conta contaLucas = new Conta();
		contaLucas.deposita(100);
	}

}
