package liv.duda.Model;

import jakarta.persistence.*;
import java.math.BigDecimal;

@Entity(name = "ProdutoModel")
@Table(name = "tb_produto")
public class ProdutosModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome")
    private String nome;

    private Integer estoque;

    @Column(name = "preco")
    private BigDecimal preco;

    public ProdutosModel(String nome, Integer estoque, BigDecimal preco) {
        this.nome = nome;
        this.estoque = estoque;
        this.preco = preco;
    }

    public ProdutosModel() {
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getEstoque() {
        return estoque;
    }

    public void setEstoque(Integer estoque) {
        this.estoque = estoque;
    }

    // ✅ corrigido
    public BigDecimal getPreco() {
        return preco;
    }

    // ✅ corrigido
    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }
}