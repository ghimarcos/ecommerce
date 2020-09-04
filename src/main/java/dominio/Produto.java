package dominio;

import lombok.Data;
import org.springframework.lang.Nullable;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;

@Data
public class Produto implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Nullable
    private String descricao;
    @Nullable
    private BigDecimal preco;
    //private String foto;
    @Nullable
    private LocalDate dataValidade;
    @Nullable
    private BigDecimal promocao;
    @ManyToOne
    private UnidadeMedida unidadeMedida;
    @Nullable
    private String tamanhoUnidade;

}
