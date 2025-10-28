 # Trabajo Práctico Funcional – Programación III  
 ## Mi nombre es Santiago Tejada y mi legajo es 50181  
## Objetivo General  
  Aplicar programación funcional en Java utilizando Streams y expresiones lambda para procesar colecciones de 
  forma declarativa, reemplazando estructuras imperativas tradicionales por un enfoque más limpio y expresivo.  
 
 ## Casos Prácticos:  
 -Alumno(nombre, nota, curso)  
  Obtener los nombres de alumnos aprobados (nota ≥ 7) en mayúsculas y ordenados.
  Calcular el promedio general de notas.
  Agrupar alumnos por curso.
  Obtener los 3 mejores promedios.

-Producto(nombre, categoría, precio, stock)
  Listar los productos con precio > 100 ordenados por precio descendente.
  Agrupar por categoría y calcular el stock total.
  Generar un String con nombre y precio separados por ;.
  Calcular el precio promedio general y por categoría.

-Libro(título, autor, páginas, precio)
  Listar títulos de libros con más de 300 páginas.
  Calcular el promedio de páginas.
  Agrupar por autor y contar cuántos libros tiene cada uno.
  Obtener el libro más caro.

-Empleado(nombre, departamento, salario, edad)
  Listar empleados con salario > 2000 ordenados descendentemente.
  Calcular el salario promedio general.
  Agrupar por departamento y sumar salarios.
  Obtener los 2 empleados más jóvenes.
  
-Tecnologías utilizadas  
  Java 17+
  API Streams
  Expresiones Lambda
  Collectors (groupingBy, averagingDouble, joining, etc.)

## Conclusión
El trabajo permite afianzar el uso de la programación funcional en Java, comprendiendo el pipeline de Streams y 
la manipulación eficiente de listas mediante operaciones de filtrado, mapeo, reducción, agrupamiento y ordenamiento.
En resumen, el trabajo muestra cómo los Streams hacen el código más corto y legible, sin tener que usar tantos bucles ni estructuras repetitivas.
Para ejecutar el proyecto, solo hay que abrirlo en IntelliJ IDEA, buscar la clase Main y ejecutar el programa. Los resultados se muestran directamente en la consola.
