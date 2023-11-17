import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> perguntas = new ArrayList<>(){{
            add("Telefonou para a vítima?");
            add("Esteve no local do crime?");
            add("Mora perto da vítima?");
            add("Devia para a vítima?");
            add("Já trabalhou com a vítima?");
        }};

        int quantidadeDeSim = 0;

        for(int i =0; i < perguntas.size(); i++) {
            System.out.println(perguntas.get(i));
            String resposta = scanner.next();
            if (Objects.equals(resposta, "S")) {
                quantidadeDeSim++;
            }
        }

        if(quantidadeDeSim == 2) {
            System.out.println("Suspeito");
        } else if(quantidadeDeSim < 2 && quantidadeDeSim > 5) {
            System.out.println("Cúmplice");
        }
        else if(quantidadeDeSim <= 5){
            System.out.println("Assassina");
        } else {
            System.out.println("Inocente");
        }
    }
}
