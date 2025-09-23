
import Entity.pedidoEntity;
import Entity.productoEntity;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import java.util.List;


public class productoService {
    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("miPU");

    public List<productoEntity> listar() {
        EntityManager em = emf.createEntityManager();
        List<productoEntity> productos = em.createQuery("SELECT u FROM Productos u", productoEntity.class).getResultList();
        em.close();
        return productos;
    }
}
