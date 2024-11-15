package variaveis;

public class TestandoCodicionais {

	public static void main(String[] args) {

		System.out.println("Testando condicionais. ");
		int idade = 20;
		int quantidadePessoa = 3;
		boolean acompanhado = quantidadePessoa >= 2;

		System.out.println("Valor de acompanhado é " + acompanhado);
		if (idade >= 18 && acompanhado) {
			System.out.println("voce pode comprar bebidas");
		} else {
			System.out.println("voce não pode comprar bebidas");
		}

	}

}
