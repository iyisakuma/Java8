package br.com.iyisakuma.cap4;

import br.com.iyisakuma.modelo.Usuario;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Cap4 {
    public static void main(String[] args) {
        Usuario user1 = new Usuario("Paulo Silveira", 150);
        Usuario user2 = new Usuario("Rodrigo Turini", 120);
        Usuario user3 = new Usuario("Guilherme Silveira", 190);

        List<Usuario> usuarios = new ArrayList<>();
        usuarios.add(user1);
        usuarios.add(user2);
        usuarios.add(user3);

        Consumer<Usuario> mostraMensagem = u -> System.out.println("Antes de imprimir os nomes");
        Consumer<Usuario> imprimeNome = System.out::println;

        /*
        * A interface Consumer eh uma interface funcional, isto eh existe apenas
        * um metodo ABSTRATO, porem a partir do java 8 eh capaz de se criar default metodos
        *por exemplo, o metodo andThen(Consumer<t>)
        *  */

        usuarios.forEach( mostraMensagem.andThen(imprimeNome));


        /**
         * Alem do Consumer, foi criado a interface funcional: Predicate. Que permite
         * testar objetos de um determinado tipo
         * */

        System.out.println("****************************************");
        System.out.println("Teste de Predicate");
        System.out.println("****************************************");
        Predicate<Usuario> notaMaiorQue160 = u -> u.getPontos() > 160;
        usuarios.removeIf(notaMaiorQue160);
        usuarios.forEach(System.out::println);
    }
}
