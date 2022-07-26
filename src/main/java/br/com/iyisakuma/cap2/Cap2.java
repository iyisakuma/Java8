package br.com.iyisakuma.cap2;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Cap2 {

    public static void main(String[] args) {
        Usuario user1 = new Usuario("Paulo Silveira", 150);
        Usuario user2 = new Usuario("Rodrigo Turini", 120);
        Usuario user3 = new Usuario("Guilherme Silveira", 190);

        List<Usuario> usuarios = Arrays.asList(user1, user2, user3);
        /**
         * ForEach com classe anonima
         *
         * O foreach recebe como parametro um Consumer<T> que eh uma interface
         * que possui apenas um metodo o accept() o qual diz o que faremos com
         * no foreach
         */
//        usuarios.forEach(new Consumer<Usuario>() {
//            @Override
//            public void accept(Usuario usuario) {
//                System.out.println(usuario.getNome());
//            }
//        });

        /**
        *ForEach com Lambda
         *
         * Lambda no java veio para implementar interfaces com apenas um
         * metodo
        * */
//        usuarios.forEach(u-> System.out.println(u.getNome()));

        /***
         * ForEach com  reference method
         */
        usuarios.forEach(System.out::println);
    }
}
