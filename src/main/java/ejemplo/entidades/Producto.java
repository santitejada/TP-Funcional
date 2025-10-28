package ejemplo.entidades;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Producto {
    private String nombre;
    private String categoria;
    private double precio;
    private int stock;


    @Override
    public String toString() {
        return nombre + " - " + categoria + " - $" + precio + " (Stock: " + stock + ")";
    }
}

