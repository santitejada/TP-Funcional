package ejemplo.entidades;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Alumno {
    private String nombre;
    private double nota;
    private String curso;


    @Override
    public String toString() {
        return nombre + " (" + curso + ") - Nota: " + nota;
    }
}

