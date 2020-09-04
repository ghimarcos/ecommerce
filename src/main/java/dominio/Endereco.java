package dominio;

import lombok.Data;
import org.springframework.lang.Nullable;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.io.Serializable;

@Data
public class Endereco implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Nullable
    private String rua;
    @Nullable
    private String bairro;
    @Nullable
    private String cep;
    @Nullable
    private String numero;

    private String complemento;
    @ManyToOne
    private Cidade cidade;

}
