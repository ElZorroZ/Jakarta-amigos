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

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public productoEntity getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(productoEntity idProducto) {
        this.idProducto = idProducto;
    }

    public int getPrecioTotal() {
        return precioTotal;
    }

    public void setPrecioTotal(int precioTotal) {
        this.precioTotal = precioTotal;
    }

    public usuarioEntity getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(usuarioEntity idUsuario) {
        this.idUsuario = idUsuario;
    }
}
