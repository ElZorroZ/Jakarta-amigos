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

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public Long getTextoProducto() {
        return textoProducto;
    }

    public void setTextoProducto(Long textoProducto) {
        this.textoProducto = textoProducto;
    }

    public categoriaEntity getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(categoriaEntity idCategoria) {
        this.idCategoria = idCategoria;
    }
}
