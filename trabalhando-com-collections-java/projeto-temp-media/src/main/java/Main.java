import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Double> temperatura = new ArrayList<>();

        List<Meses> meses = new ArrayList<>(){{
            add(new Meses("Janeiro"));
            add(new Meses("Fevereiro"));
            add(new Meses("Março"));
            add(new Meses("Abril"));
            add(new Meses("Maio"));
            add(new Meses("Junho"));
        }};

        for(int i = 0; i < meses.size(); i++){
            System.out.println("Digite a temperatura do mes " + meses.get(i) + ":");
            temperatura.add(scanner.nextDouble());
        }

        Iterator<Double> iterator = temperatura.iterator();
        Double somaTemperatura = 0d;
        while(iterator.hasNext()){
            Double next = iterator.next();
            somaTemperatura += next;
        }
        double mediaTemperatura = (somaTemperatura / temperatura.size());

        System.out.println("A média semestral das temperaturas foi: " + mediaTemperatura);
        for(int i = 0; i < meses.size(); i++){
            if(temperatura.get(i) > mediaTemperatura){
                System.out.println("No mês " + meses.get(i) + " a temperatura ultrapassou a média, sendo ela: " + temperatura.get(i));
            }
        }

    }
}
