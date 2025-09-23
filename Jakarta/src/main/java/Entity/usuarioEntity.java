package Entity;
import jakarta.persistence.*;

@Entity
@Table(name = "usuarios")
public class usuarioEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable=false, length=100)
    private String nombre;

    @Column(nullable=false, length=100)
    private String email;

    @Column(nullable=false, length=255)
    private String contraseña;

    @Column(nullable=false)
    private boolean estado;

    @Column(nullable=false)
    private boolean rol;
}
