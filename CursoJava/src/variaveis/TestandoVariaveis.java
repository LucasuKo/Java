package variaveis;

public class TestandoVariaveis {

	public static void main(String[] args) {

		System.out.println("Testando condicionais. ");
		int idade = 10;
		int quantidadePessoa = 2;
		if (idade >= 18) {
			System.out.println("voce tem mais de 18 anos");
		} else {
			if(quantidadePessoa >= 2) {
				System.out.println("ok, voce é menor de idade, mas pode comprar pois está acompanhado");
			}
			System.out.println("voce tem menos de 18 anos");
		}

	}

}
