import Entity.productoEntity;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Named;
import java.util.List;

@Named("inicioBean")
@RequestScoped
public class InicioBean {
    
    private final programService servicio = new programService();

    public List<productoEntity> getProductos() {
        return servicio.listar();
    }
    
}
