package org.example.algaworks;

import java.util.List;
import java.util.stream.Collectors;
public class Listas {
    public static List retornaNumerosPares(List<Integer> numeros){
       return numeros.stream().filter(e -> (e % 2 == 0)).collect(Collectors.toList());
    }
}
