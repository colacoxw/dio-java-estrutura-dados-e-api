import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, String> aluno = new HashMap<>();

        aluno.put("Nome", "Rafael");
        aluno.put("Idade", "18");
        aluno.put("Media", "10");
        aluno.put("Turma", "AX");

        System.out.println(aluno);
        System.out.println(aluno.keySet());
        System.out.println(aluno.values());

        List<Map<String, String>> listaAlunos= new ArrayList<>();
        listaAlunos.add(aluno);


        Map<String, String> aluno2 = new HashMap<>();

        aluno2.put("Nome", "Maria");
        aluno2.put("Idade", "21");
        aluno2.put("Media", "7.4");
        aluno2.put("Turma", "BX");

        listaAlunos.add(aluno2);
        System.out.println(listaAlunos);

        System.out.println(aluno.containsKey("Nome"));
    }
}
