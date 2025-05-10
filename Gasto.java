import java.time.LocalDate;

public class Gasto {
private LocalDate fecha;
private String categoria;
private double monto;
private String descripcion;

public Gasto(LocalDate fecha, String categoria, double monto, String descripcion) {
this.fecha = fecha;
this.categoria = categoria;
this.monto = monto;
this.descripcion = descripcion;
}

public LocalDate getFecha() {
return fecha;
}

public String getCategoria() {
return categoria;
}

public double getMonto() {
return monto;

}

public String getDescripcion() {
return descripcion;
}

@Override
public String toString() {
return fecha + " - " + categoria + ": $" + monto + " (" + descripcion + ")";
}
}
