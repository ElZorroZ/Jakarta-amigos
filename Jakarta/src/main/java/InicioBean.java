import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Named;

@Named("inicioBean")
@RequestScoped
public class InicioBean {
    private String nombre;
    private String mensaje;

    public void saludar() {
        if (nombre == null || nombre.isEmpty()) {
            mensaje = "Por favor, ingrese un nombre.";
        } else {
            mensaje = "Hola, " + nombre + "!";
        }
    }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public String getMensaje() { return mensaje; }
    
}
