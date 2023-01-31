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
1, 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71,
73, 79, 83, 89, 97, 101, 103, 107, 109, 113, 127, 131, 137, 139, 149, 151, 157,
163, 167, 173, 179, 181, 191, 193, 197, 199, 211, 223, 227, 229, 233, 239, 241,
251, 257, 263, 269, 271, 277, 281, 283, 293, 307, 311, 313, 317, 331, 337, 347,
349, 353, 359, 367, 373, 379, 383, 389, 397, 401, 409, 419, 421, 431, 433, 439,
443, 449, 457, 461, 463, 467, 479, 487, 491, 499,
```

### Ejercicio 2

Realiza un programa que lea el fichero creado en el ejercicio anterior y que muestre los números por pantalla.

### Ejercicio 3

Escribe un programa que guarde en un fichero el contenido de otros dos ficheros, de tal forma que en el fichero resultante aparezcan las líneas de los primeros dos ficheros mezcladas, es decir, la primera línea será del primer fichero, la segunda será del segundo fichero, la tercera será la siguiente del primer fichero, etc.
Los nombres de los dos ficheros origen y el nombre del fichero destino se deben pasar como argumentos en la línea de comandos.
Hay que tener en cuenta que los ficheros de donde se van cogiendo las líneas pueden tener tamaños diferentes.

### Ejercicio 4

Realiza un programa que sea capaz de ordenar alfabéticamente las palabras contenidas en un fichero de texto. El nombre del fichero que contiene las palabras se debe pasar como argumento en la línea de comandos. El nombre del fichero resultado debe ser el mismo que el original añadiendo la coletilla sort, por ejemplo palabras_sort.txt. Suponemos que cada palabra ocupa una línea.

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
