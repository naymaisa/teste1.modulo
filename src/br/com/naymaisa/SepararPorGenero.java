package br.com.naymaisa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SepararPorGenero {

    public static List<String> separarPorGenero() {
        Scanner scanner = new Scanner(System.in);
        List<String> pessoas = new ArrayList<>();

        while (true) {
            System.out.println("Digite o nome e o sexo da pessoa (nome-sexo), ou digite 'sair' para terminar:");
            String entrada = scanner.nextLine();

            if (entrada.equalsIgnoreCase("sair")) {
                break;
            }

            if (entrada.contains("-")) {
                pessoas.add(entrada.trim());
            } else {
                System.out.println("Entrada inválida! Por favor, use o formato 'nome-sexo'.");
            }
        }


        List<String> grupoFeminino = pessoas.stream()
                .filter(p -> p.split("-")[1].trim().equalsIgnoreCase("F"))
                .map(p -> p.split("-")[0].trim())
                .collect(Collectors.toList());


        System.out.println("\nGrupo Feminino:");
        grupoFeminino.forEach(System.out::println);

        return grupoFeminino;
    }
}
