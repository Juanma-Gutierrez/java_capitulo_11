# java_capitulo_11

Soluciones a los ejercicios del libro **Aprende Java con ejercicios** de Luis José Sánchez (_Edición 2019_).

Este libro está a la venta en <https://leanpub.com/aprendejava>

![image](https://user-images.githubusercontent.com/101201349/198890431-a5598843-2252-4e82-a764-bb1380121200.png)

## Listado de ejercicios

[Ejercicio 1](#ejercicio-1)
[Ejercicio 2](#ejercicio-2)
[Ejercicio 3](#ejercicio-3)
[Ejercicio 4](#ejercicio-4)
[Ejercicio 5](#ejercicio-5)
[Ejercicio 6](#ejercicio-6)

---

### Ejercicio 1

Escribe un programa que guarde en un fichero con nombre primos.dat los números primos que hay entre 1 y 500.

```
2
3
5
7
11
13
17
19
...
491
499
```

### Ejercicio 2

Realiza un programa que lea el fichero creado en el ejercicio anterior y que muestre los números por pantalla.

```
2
3
5
7
11
13
17
19
...
491
499
```

### Ejercicio 3

Escribe un programa que guarde en un fichero el contenido de otros dos ficheros, de tal forma que en el fichero resultante aparezcan las líneas de los primeros dos ficheros mezcladas, es decir, la primera línea será del primer fichero, la segunda será del segundo fichero, la tercera será la siguiente del primer fichero, etc.
Los nombres de los dos ficheros origen y el nombre del fichero destino se deben pasar como argumentos en la línea de comandos.
Hay que tener en cuenta que los ficheros de donde se van cogiendo las líneas pueden tener tamaños diferentes.

```
Archivo generado correctamente.
Se ha generado correctamente el fichero: SalidaEjercicio3.txt
```

### Ejercicio 4

Realiza un programa que sea capaz de ordenar alfabéticamente las palabras contenidas en un fichero de texto. El nombre del fichero que contiene las palabras se debe pasar como argumento en la línea de comandos. El nombre del fichero resultado debe ser el mismo que el original añadiendo la coletilla sort, por ejemplo palabras_sort.txt. Suponemos que cada palabra ocupa una línea.

```
Ejemplo:
palabras.txt
perro
gato
hombre
coche
mujer
niño
100
20
010
casa

palabras_sort.txt
010
100
20
casa
coche
gato
hombre
mujer
niño
perro
```

### Ejercicio 5

Escribe un programa capaz de quitar los comentarios de un programa de Java.
Se utilizaría de la siguiente manera:

```
quita_commentarios PROGRAMA_ORIGINAL PROGRAMA_LIMPIO

Por ejemplo:
quita_comentarios hola.java holav2.java
```

Crea un fichero con nombre holav2.java que contiene el código de hola.java pero sin los comentarios.

### Ejercicio 6

Realiza un programa que diga cuántas ocurrencias de una palabra hay en un fichero. Tanto el nombre del fichero como la palabra se deben pasar como argumentos en la línea de comandos.
