# Clasificación de Animales

Este proyecto es una aplicación en Java que permite clasificar animales en tres categorías: terrestres, aéreos y acuáticos. Los animales se ingresan por consola y se almacenan en una lista y un mapa para su clasificación. Finalmente, se muestra la lista de animales agrupados por tipo.

## Características

- Clasificación de animales por tipo: terrestre, aéreo, acuático.
- Uso de streams para procesar y mostrar los datos.
- Interacción mediante consola para ingresar los datos.

## Estructura del Proyecto

- `src/main/java/Model/Animal.java`: Clase que representa un animal con atributos como nombre, tipo y género.
- `src/main/java/Services/ServiceAnimal.java`: Clase que contiene la lógica para agregar animales y mostrar la clasificación.
- `src/main/java/Main.java`: Clase principal que interactúa con el usuario para ingresar los datos y mostrar los resultados.

## Requisitos

- Java 8 o superior.
- Maven para la gestión de dependencias.

## Ejecución

1. Clona este repositorio:
   ```bash
   git clone https://github.com/jorgeiudigital/clasificacion-animales.git

Ingrese el nombre del animal: Oso
Ingrese el tipo del animal (terrestre, aéreo, acuático): terrestre
Ingrese el género del animal (masculino, femenino): masculino
¿Desea ingresar otro animal? (si/no): si
Ingrese el nombre del animal: Ballena
Ingrese el tipo del animal (terrestre, aéreo, acuático): acuático
Ingrese el género del animal (masculino, femenino): femenino
¿Desea ingresar otro animal? (si/no): no

Salida:

terrestre:
Oso
acuático:
Ballena