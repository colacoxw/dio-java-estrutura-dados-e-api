import java.util.*;

public class ExemploSet {
    public static void main(String[] args) {
        System.out.println("Crie um conjunto e adicione as notas:");
        Set<Double> notas = new HashSet<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));
        System.out.println(notas);

        //Não é possivel fazer pelo fato que estamos utilizando HashSet, isso acaba deixando desordenado
        //System.out.println("Exiba a posição da nota 5: ");
        //System.out.println("Insira a nota 8 na posição 7: ");
        //System.out.println("Substitua a nota 5.0 pela nota 6.0");

        System.out.println("Confira se a nota 5.0 está no conjunto: " + notas.contains(5.0));

        //System.out.println("Exiba a terceira nota adicionada");

        System.out.println("Exbia a menor nota: " + Collections.min(notas));

        System.out.println("Exbia a maior nota: " + Collections.max(notas));

        System.out.println("Exibir a soma dos valores: ");
        Iterator<Double> interator = notas.iterator();
        Double soma = 0.0;
        while(interator.hasNext()) {
            soma += interator.next();
        }
        System.out.println("Exibindo a soma dos valores: " + soma);

        System.out.println("Exiba a média das notas: " + (soma / notas.size()));

        System.out.println("Remova a nota 0: ");
        notas.remove(0.0);
        System.out.println(notas);

        System.out.println("Remova as notas menores que 7 e exiba a lista: ");
        Iterator<Double> iterator1 = notas.iterator();
        while(iterator1.hasNext()) {
            Double next = iterator1.next();
            if(next < 7) iterator1.remove();
        }
        System.out.println(notas);

        System.out.println("Exiba todas as notas na ordem em que foram informadas:");
        Set<Double> notas2 = new LinkedHashSet<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));
        System.out.println(notas2);

        System.out.println("Exbia todas as notas de ordem crescente: ");
        Set<Double> notas3 = new TreeSet<>(notas2);
        System.out.println(notas3);

        System.out.println("Apague todo o conjunto");
        notas.clear();
        System.out.println("O conjunto 1 está vazio? " + notas.isEmpty());
        System.out.println("O conjunto 2 está vazio? " + notas2.isEmpty());
    }
}
