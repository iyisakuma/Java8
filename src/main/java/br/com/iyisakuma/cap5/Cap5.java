package br.com.iyisakuma.cap5;

import br.com.iyisakuma.modelo.Usuario;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Cap5 {
    public static void main(String[] args) {
        Usuario user1 = new Usuario("Paulo Silveira", 150);
        Usuario user2 = new Usuario("Rodrigo Turini", 120);
        Usuario user3 = new Usuario("Guilherme Silveira", 190);
        Usuario user4 = new Usuario("", 180);
        Usuario user5 = new Usuario(null, 140);

        List<Usuario> usuarios = new ArrayList<>();
        usuarios.add(user1);
        usuarios.add(user2);
        usuarios.add(user3);
        usuarios.add(user4);
        usuarios.add(user5);

        System.out.println("********************");
        System.out.println("Antes do sort");
        usuarios.forEach(System.out::println);
        System.out.println();

        System.out.println("********************");
        System.out.println("Depois do Sort");
        usuarios.removeIf(u-> u.getNome() == null || u.getNome().isEmpty());
        usuarios.sort((u1,u2) -> u1.getNome().compareTo(u2.getNome()));
        usuarios.forEach(System.out::println);
    }
}
