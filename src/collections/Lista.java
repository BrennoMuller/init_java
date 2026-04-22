package collections;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Collections;

public class Lista {

	public static void main(String[] args) {
		exemploListaSimples();
	}
	
	
	private static void exemploListaSimples() {
		List<String> lista = new LinkedList<String>();
		lista.add("brenno");
		lista.add("a");
		lista.add("ricardo");
		lista.add("suguro");
		
		Collections.sort(lista);
		
		System.out.println(lista);
		
	}

}
