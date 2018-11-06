package aplicacao;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/*
 * recomendação de leitura para entender Stream
 * https://www.oracle.com/technetwork/pt/articles/java/streams-api-java-8-3410098-ptb.html
 */
public class Programa {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(3,4,5,10,7);
		
		//Cria uma stream<Tipo> a partir da lista
		Stream<Integer> st1 = list.stream(); 
		
		//Imprime uma array com o stream convertido em vetor através do toArray()
		System.out.println(Arrays.toString(st1.toArray()));

	}

}
