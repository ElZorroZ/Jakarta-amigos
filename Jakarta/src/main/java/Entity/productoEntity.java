package Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "productos")
public class productoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable=false, length=100)
    private String nombre;

    @Column(nullable=false)
    private int precio;

    @Column(nullable=false)
    private Long textoProducto;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    private categoriaEntity idCategoria;


}
