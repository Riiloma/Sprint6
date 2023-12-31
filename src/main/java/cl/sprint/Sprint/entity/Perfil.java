package cl.sprint.Sprint.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table(name ="perfl")
public class Perfil {
    @Id
    @Column(nullable = false)//nulllable hace que las tablas no sean nulas
    private int id_perfil;

    @Column(length = 50, nullable = false)//length es el largo de caracteres
    private String descripcion;

    @Column(nullable = false)
    private boolean estado;

    @OneToMany(mappedBy = "perfil")
    private List<Usuario> usuarios;
}
