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
		Stream<Integer> st1 = list.stream().map(x -> x *10);//multiplica o elemento por 10 
		
		//Imprime uma array com o stream convertido em vetor através do toArray()
		System.out.println(Arrays.toString(st1.toArray()));
		
		//Cria uma stream de Strings
		Stream<String> st2 = Stream.of("Ana", "Maria", "João", "Bob");
		System.out.println(Arrays.toString(st2.toArray()));
		
		//Stream de Iteração
		Stream<Integer> st3 = Stream.iterate(0,  x-> x+2);
		System.out.println(Arrays.toString(st3.limit(10).toArray()));//limit(y) limita até quantas vezes irá repetir
		
		//Sequencia de fibonacci
		Stream<Long> st4 = Stream.iterate(new Long[] {0L, 1L}, p -> new Long[] {p[1], p[0]+p[1]}).map(p -> p[0]);
		System.out.println(Arrays.toString(st4.limit(15).toArray()));
	}

}
