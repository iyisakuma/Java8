package br.com.iyisakuma.cap3;

@FunctionalInterface
public interface Validador<T>{
    boolean valida(T t);
}
