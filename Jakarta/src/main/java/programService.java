
import Entity.pedidoEntity;
import Entity.productoEntity;
import Entity.usuarioEntity;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import java.util.List;


public class programService {
    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("miPU");

    public List<productoEntity> listar() {
        EntityManager em = emf.createEntityManager();
        List<productoEntity> productos = em.createQuery("SELECT u FROM productos u", productoEntity.class).getResultList();
        em.close();
        return productos;
    }

    public List<usuarioEntity> usuariosPedido() {
        EntityManager em = emf.createEntityManager();
        List<usuarioEntity> usuarios = em.createQuery("SELECT u FROM usuarios u INNER JOIN pedidos p ON u.id= p.idUsuario ", usuarioEntity.class).getResultList();
        em.close();
        return usuarios;
    }
    
}
