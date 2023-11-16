import java.util.LinkedList;
import java.util.Queue;

public class Main {
  public static void main(String[] args) {
    Queue<Carro> carroQueue = new LinkedList<>();

    carroQueue.add(new Carro("Ford"));
    carroQueue.add(new Carro("Fiat"));
    carroQueue.add(new Carro("Toyota"));

    System.out.println(carroQueue.add(new Carro("Peugeot")));
    System.out.println(carroQueue);

    System.out.println(carroQueue.offer(new Carro("Renault")));
    System.out.println(carroQueue);

    System.out.println(carroQueue.peek());
    System.out.println(carroQueue);

    System.out.println(carroQueue.poll());
    System.out.println(carroQueue);

    System.out.println(carroQueue.isEmpty());

    System.out.println(carroQueue.size());
  }
}
