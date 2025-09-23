package Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "pedidos")
public class pedidoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable=false, length=100)
    private String nombre;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    private productoEntity idProducto;

    @Column(nullable=false)
    private int precioTotal;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    private usuarioEntity idUsuario;
}
