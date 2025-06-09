package Services;

import Model.Animal;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class ServiceAnimal {
    private Map<String, List<Animal>> clasificacion = new TreeMap<>();
    private List<Animal> animales = new ArrayList<>();

    public void agregarAnimal(String nombre, String tipo, String genero) {
        Animal animal = new Animal(nombre, tipo, genero);
        animales.add(animal);
        clasificacion.computeIfAbsent(tipo, k -> new ArrayList<>()).add(animal);
    }

    public void mostrarClasificacion() {
        clasificacion.forEach((tipo, listaAnimales) -> {
            System.out.println(tipo + ":");
            listaAnimales.stream()
                    .map(Animal::getNombre)
                    .forEach(nombre -> System.out.println("  " + nombre));
        });

    }
}
