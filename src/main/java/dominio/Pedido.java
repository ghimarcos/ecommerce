package dominio;

import lombok.Data;
import org.springframework.lang.Nullable;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Data
public class Pedido implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @OneToMany
    private List<ItensPedido> itensPedidos = new ArrayList<>();
    @ManyToOne
    private FormaPagamento formaPagamento;
    @ManyToOne
    private CondPagamento condiPagamento;

    @Nullable
    private LocalDate dataPedido;
    @Nullable
    private LocalDate dataEntrega;

    @ManyToOne
    private Endereco endereco;

    @ManyToOne
    private Usuario usuario;
}
