package ejemplo;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import ejemplo.entidades.Alumno;
import ejemplo.entidades.Empleado;
import ejemplo.entidades.Libro;
import ejemplo.entidades.Producto;

import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {

        //      CASO PRÁCTICO - ALUMNOS
        List<Alumno> alumnos = new ArrayList<>();
        Alumno alumno1 = new Alumno("Cande", 8, "3k10");                new Alumno("Ana", 6, "Matemática");
        Alumno alumno2 =new Alumno("Martin", 9, "3k9");
        Alumno alumno3 =new Alumno("Brian", 7, "3k9");
        Alumno alumno4 =new Alumno("Maca", 10, "3k10");
        Alumno alumno5= new Alumno("Bruno", 6, "3k10");

        alumnos.add(alumno1);
        alumnos.add(alumno2);
        alumnos.add(alumno3);
        alumnos.add(alumno4);
        alumnos.add (alumno5);

        // 1. Alumnos aprobados (nota >= 7) en mayúsculas y ordenados

        List<String> aprobados = alumnos.stream()
                .filter(a -> a.getNota() >= 7)
                .map(a -> a.getNombre().toUpperCase())
                .sorted()
                .toList();
        System.out.println("Alumnos aprobados: " + aprobados);

        // 2. Promedio general de notas

        double promedio = alumnos.stream()
                .mapToDouble(Alumno::getNota)
                .average()
                .orElse(0);
        System.out.println("Promedio general: " + promedio);

        // 3. Agrupar por curso

        Map<String, List<Alumno>> porCurso = alumnos.stream()
                .collect(Collectors.groupingBy(Alumno::getCurso));
        System.out.println("Alumnos por curso: " + porCurso);

        // 4. Top 3 mejores promedios

        List<Alumno> top3 = alumnos.stream()
                .sorted(Comparator.comparingDouble(Alumno::getNota).reversed())
                .limit(3)
                .toList();
        System.out.println("Top 3 mejores promedios: " + top3);


        //   CASO PRÁCTICO - PRODUCTOS

        List<Producto> productos = new ArrayList<>();
        Producto producto1 = new Producto("Computadora", "Electronico", 1500, 10);
        Producto producto2 =new Producto("Auriculares", "Electronico", 80, 30);
        Producto producto3 =new Producto("Mesa", "Muebles", 200, 5);
        Producto producto4 =new Producto("Silla", "Muebles", 120, 15);
        Producto producto5 =new Producto("Libro", "Libreria", 50, 20);

        productos.add (producto1);
        productos.add (producto2);
        productos.add (producto3);
        productos.add (producto4);
        productos.add (producto5);


        // 1. Productos con precio > 100, orden descendente

        List<Producto> caros = productos.stream()
                .filter(p -> p.getPrecio() > 100)
                .sorted(Comparator.comparingDouble(Producto::getPrecio).reversed())
                .toList();
        System.out.println("\nProductos caros: " + caros);

        // 2. Agrupar por categoría y sumar stock

        Map<String, Integer> stockPorCategoria = productos.stream()
                .collect(Collectors.groupingBy(
                        Producto::getCategoria,
                        Collectors.summingInt(Producto::getStock)
                ));
        System.out.println("Stock total por categoria: " + stockPorCategoria);

        // 3. String con nombre y precio separados por ";"

        String listado = productos.stream()
                .map(p -> p.getNombre() + " $" + p.getPrecio())
                .collect(Collectors.joining("; "));
        System.out.println("Listado de productos: " + listado);

        // 4. Precio promedio general y por categoría

        double promedioGeneral = productos.stream()
                .mapToDouble(Producto::getPrecio)
                .average().orElse(0);
        System.out.println("Promedio general de precios: " + promedioGeneral);

        Map<String, Double> promedioPorCategoria = productos.stream()
                .collect(Collectors.groupingBy(
                        Producto::getCategoria,
                        Collectors.averagingDouble(Producto::getPrecio)
                ));
        System.out.println("Promedio de precios por categoria: " + promedioPorCategoria);


        //      CASO PRÁCTICO - LIBROS

        List<Libro> libros = new ArrayList<>();
        Libro libro1 =new Libro("El Quijote", "Cervantes", 500, 25.0);
        Libro libro2 =new Libro("1984", "Orwell", 320, 18.5);
        Libro libro3 =new Libro("El Principito", "Saint-Exupéry", 150, 15.0);
        Libro libro4 =new Libro("Fahrenheit 451", "Bradbury", 250, 22.0);
        Libro libro5 =new Libro("It", "Stephen King", 1100, 40.0);

        libros.add(libro1); libros.add(libro2);libros.add(libro3);libros.add(libro4);libros.add(libro5);

        // 1. Títulos con más de 300 páginas, ordenados alfabéticamente

        List<String> titulosLargos = libros.stream()
                .filter(l -> l.getPaginas() > 300)
                .map(Libro::getTitulo)
                .sorted()
                .toList();
        System.out.println("\nLibros con mas de 300 paginas: " + titulosLargos);

        // 2. Promedio de páginas

        double promedioPaginas = libros.stream()
                .mapToInt(Libro::getPaginas)
                .average().orElse(0);
        System.out.println("Promedio de paginas: " + promedioPaginas);

        // 3. Agrupar por autor y contar libros

        Map<String, Long> librosPorAutor = libros.stream()
                .collect(Collectors.groupingBy(
                        Libro::getAutor,
                        Collectors.counting()
                ));
        System.out.println("Cantidad de libros por autor: " + librosPorAutor);

        // 4. Libro más caro

        libros.stream()
                .max(Comparator.comparingDouble(Libro::getPrecio))
                .ifPresent(l -> System.out.println("Libro mas caro: " + l));


        // CASO PRÁCTICO - EMPLEADOS
        List<Empleado> empleados = new ArrayList<>();
        Empleado empleado1= new Empleado("Belen", "Ventas", 2500, 30);
        Empleado empleado2= new Empleado("Ignacio", "IT", 3000, 25);
        Empleado empleado3=new Empleado("Uriel", "RRHH", 1800, 40);
        Empleado empleado4=new Empleado("Coppa", "IT", 2700, 28);
        Empleado empleado5=new Empleado("Zaupa", "Ventas", 2200, 22);


        empleados.add (empleado1); empleados.add (empleado2);empleados.add (empleado3);empleados.add (empleado4);empleados.add (empleado5);

        // 1. Empleados con salario > 2000 ordenados desc
        List<Empleado> bienPagos = empleados.stream()
                .filter(e -> e.getSalario() > 2000)
                .sorted(Comparator.comparingDouble(Empleado::getSalario).reversed())
                .toList();
        System.out.println("\nEmpleados con salario > 2000: " + bienPagos);

        // 2. Salario promedio general
        double promedioSalario = empleados.stream()
                .mapToDouble(Empleado::getSalario)
                .average().orElse(0);
        System.out.println("Salario promedio general: " + promedioSalario);

        // 3. Agrupar por departamento y sumar salarios
        Map<String, Double> salarioPorDepto = empleados.stream()
                .collect(Collectors.groupingBy(
                        Empleado::getDepartamento,
                        Collectors.summingDouble(Empleado::getSalario)
                ));
        System.out.println("Suma de salarios por departamento: " + salarioPorDepto);

        // 4. Nombres de los 2 empleados más jóvenes
        List<String> jovenes = empleados.stream()
                .sorted(Comparator.comparingInt(Empleado::getEdad))
                .limit(2)
                .map(Empleado::getNombre)
                .toList();
        System.out.println("Dos empleados mas jovenes: " + jovenes);
    }
}
