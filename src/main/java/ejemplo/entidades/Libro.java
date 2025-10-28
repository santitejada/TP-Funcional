package ejemplo.entidades;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Libro {
    private String titulo;
    private String autor;
    private int paginas;
    private double precio;


    @Override
    public String toString() {
        return titulo + " - " + autor + " (" + paginas + " pág.) - $" + precio;
    }
}
