package ejemplo.entidades;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Empleado {
    private String nombre;
    private String departamento;
    private double salario;
    private int edad;


    @Override
    public String toString() {
        return nombre + " - " + departamento + " - $" + salario + " (" + edad + " años)";
    }
}

