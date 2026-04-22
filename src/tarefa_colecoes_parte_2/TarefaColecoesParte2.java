package tarefa_colecoes_parte_2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class TarefaColecoesParte2 {

	
	public static void part2(String lista){
		
		
		List<String> masculino = new ArrayList<String>(); 
		List<String> feminino = new ArrayList<String>(); 
		
		String[] a = lista.split(",");
		
		for (String nome : a) {
			
			if (nome.contains("-m")) {
				masculino.add(nome);
			}
			
			
			if (nome.contains("-f")) {
				feminino.add(nome);
			}
			
		}
		
		 System.out.println("masculino");
		 System.out.println(masculino);
		 System.out.println("feminino");
		 System.out.println(feminino);
		
	}
	
	public static void main(String[] args) {		
		part2(args[0]);
	}
	
}


