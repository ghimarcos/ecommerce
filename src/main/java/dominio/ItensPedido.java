package dominio;

import lombok.Data;
import org.springframework.lang.Nullable;

import javax.persistence.EmbeddedId;
import java.io.Serializable;
import java.math.BigDecimal;

@Data
public class ItensPedido implements Serializable {
    private static final long serialVersionUID = 1L;

    @EmbeddedId
    public ItensPedidoPK id = new ItensPedidoPK(); /*@EmbeddedID -> criando um id composto por dois ids
    na classe ItensPedidoPK e passando para o ID dessa classe*/

    @Nullable
    private Produto produto;
    @Nullable
    private BigDecimal quantidade;
}
