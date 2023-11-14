package main.java;

import main.java.one.digitalinnovation.NoDuplo;

public class ListaDuplamenteEncadeada<T> {

  private NoDuplo<T> primeiroNo;
  private NoDuplo<T> ultimoNo;

  private int tamanhoLista;

  public ListaDuplamenteEncadeada() {
    primeiroNo = null;
    ultimoNo = null;
    this.tamanhoLista = 0;
  }

  public void add(T conteudo) {
    NoDuplo<T> novoNo = new NoDuplo<>(conteudo);
    novoNo.setNoProximo(null);
    novoNo.setNoPrevio(ultimoNo);
    if(primeiroNo == null) {
      primeiroNo = novoNo;
    }
    if(ultimoNo != null){
      ultimoNo.setNoProximo(novoNo);
    }
    ultimoNo = novoNo;
  }

  public T get(int index) {
    return this.getNo(index).getConteudo();
  }

  private NoDuplo<T> getNo(int index) {
    NoDuplo<T> noAuxiliar = primeiroNo;

    for (int i = 0; (i < index) && (noAuxiliar != null); i++) {
      noAuxiliar = noAuxiliar.getNoProximo();
    }

    return noAuxiliar;
  }

  public int size() {
    return tamanhoLista;
  }

}