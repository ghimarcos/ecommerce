package dominio;

import lombok.Data;
import org.springframework.lang.Nullable;

import javax.persistence.*;
import java.io.Serializable;

@Data
public class Usuario implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Nullable
    private String login;
    @Nullable
    private String senha;
    @Nullable
    private String perfil;
    @Nullable
    private String listaTelefones;
    @OneToMany
    private Endereco endereco;
}
