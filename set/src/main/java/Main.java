import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Set<Carro> hashSetCarros = new HashSet<>();

        hashSetCarros.add(new Carro("Ford"));
        hashSetCarros.add(new Carro("Jeep"));
        hashSetCarros.add(new Carro("Fiat"));
        hashSetCarros.add(new Carro("Toyota"));
        hashSetCarros.add(new Carro("Honda"));

        System.out.println(hashSetCarros);

        System.out.println("----------------");

        Set<Carro> treeSet = new TreeSet<>();
        treeSet.add(new Carro("Ford"));
        treeSet.add(new Carro("Jeep"));
        treeSet.add(new Carro("Fiat"));
        treeSet.add(new Carro("Toyota"));
        treeSet.add(new Carro("Honda"));

        System.out.println(treeSet);
    }
}
