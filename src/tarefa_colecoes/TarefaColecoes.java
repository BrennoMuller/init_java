package tarefa_colecoes;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TarefaColecoes {
	
	public static void part1(String lista){
		List<String> nomes = new ArrayList<String>(); 
		String[] a = lista.split(",");
		
		
		
		for (String nome : a) {
			nomes.add(nome);
		}
		
		Collections.sort(nomes);
		
		System.out.println(nomes);
		
	}
	
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
		if (args[0].contains("-m") || args[0].contains("-f")) {
			part2(args[0]);
		}else {
			part1(args[0]);
		}

	}
	

}
