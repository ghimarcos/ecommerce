package dominio;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
/*Essa classe está juntando os dois IDs tanto de pedido quanto de produto em uma classe*/
public class ItensPedidoPK {

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name="pedido_id")
    private Pedido pedido;
    @ManyToOne
    @JoinColumn(name="produto_id")
    private Produto produto;
}
