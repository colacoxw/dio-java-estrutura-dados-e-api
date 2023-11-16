package main.java;

public class Main {
  public static void main(String[] args) {
    
    ListaDuplamenteEncadeada<String> minhaListaDuplamenteEncadeada = new ListaDuplamenteEncadeada<>();

    minhaListaDuplamenteEncadeada.add("NO 1");
    minhaListaDuplamenteEncadeada.add("NO 2");
    minhaListaDuplamenteEncadeada.add("NO 3");
    minhaListaDuplamenteEncadeada.add("NO 4");
    minhaListaDuplamenteEncadeada.add("NO 5");
    minhaListaDuplamenteEncadeada.add("NO 6");
    minhaListaDuplamenteEncadeada.add("NO 7");

    System.out.println(minhaListaDuplamenteEncadeada);

    minhaListaDuplamenteEncadeada.remove(3);
    minhaListaDuplamenteEncadeada.add(3, "99");

    System.out.println(minhaListaDuplamenteEncadeada);
    System.out.println(minhaListaDuplamenteEncadeada.get(3));
  }
}
