package tarefa_controleDeFluxo;

public class ControleFluxo {

	public static void main(String[] args) {
		int a = 2;
		int b = 3;
		int c = 1;
		int d = 2;
		
		float media = (a + b + c + d) / 4;
		
		if (media >= 7) {
			System.out.print("Aprovado");
		}else if (media >= 5) {
			System.out.print("Recuperação");
		}else {
			System.out.print("Reprovado");
		}
		
		


	}

}
