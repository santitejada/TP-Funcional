🧩 Trabajo Práctico Funcional – Programación III
🎯 Objetivo General

  Aplicar programación funcional en Java utilizando Streams y expresiones lambda para procesar colecciones de 
  forma declarativa, reemplazando estructuras imperativas tradicionales por un enfoque más limpio y expresivo.

🧠 Conceptos Clave

  Stream API: flujo de datos que permite aplicar transformaciones (map, filter, sorted).
  Collectors: operaciones terminales para agrupar, contar, promediar, unir, etc.
  Expresiones Lambda: facilitan la escritura de código conciso y declarativo.
  Inmutabilidad: evita errores y efectos secundarios al manipular colecciones.

🧮 Casos Prácticos
1️⃣ Alumno(nombre, nota, curso)

  Obtener los nombres de alumnos aprobados (nota ≥ 7) en mayúsculas y ordenados.
  Calcular el promedio general de notas.
  Agrupar alumnos por curso.
  Obtener los 3 mejores promedios.

2️⃣ Producto(nombre, categoría, precio, stock)

  Listar los productos con precio > 100 ordenados por precio descendente.
  Agrupar por categoría y calcular el stock total.
  Generar un String con nombre y precio separados por ;.
  Calcular el precio promedio general y por categoría.

3️⃣ Libro(título, autor, páginas, precio)

  Listar títulos de libros con más de 300 páginas.
  Calcular el promedio de páginas.
  Agrupar por autor y contar cuántos libros tiene cada uno.
  Obtener el libro más caro.

4️⃣ Empleado(nombre, departamento, salario, edad)

  Listar empleados con salario > 2000 ordenados descendentemente.
  Calcular el salario promedio general.
  Agrupar por departamento y sumar salarios.
  Obtener los 2 empleados más jóvenes.

🧩 Tecnologías utilizadas

  Java 17+
  API Streams
  Expresiones Lambda
  Collectors (groupingBy, averagingDouble, joining, etc.)
  
🏁 Conclusión

El trabajo permite afianzar el uso de la programación funcional en Java, comprendiendo el pipeline de Streams y 
la manipulación eficiente de listas mediante operaciones de filtrado, mapeo, reducción, agrupamiento y ordenamiento.
