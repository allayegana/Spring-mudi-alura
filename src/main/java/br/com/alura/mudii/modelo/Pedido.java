package br.com.alura.mudii.modelo;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.annotation.Id;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Configuration
public class Pedido {
    @Id
    @SequenceGenerator(name = "idpd_Sequence", sequenceName = "idpd_Sequence", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "idpd_Sequence")
    @Column(name = "ID")
    private Long id;


    private String nomeProduto;
    private BigDecimal valorNegociacao;
    private LocalDate DataEntrega;
    private String UrlProduto;
    private String descricaoProduto;
    private String UrlImage;

    @Enumerated(EnumType.STRING)
    private StatusPedido status;

    public StatusPedido getStatus() {
        return status;
    }

    public void setStatus(StatusPedido status) {
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public BigDecimal getValorNegociacao() {
        return valorNegociacao;
    }

    public void setValorNegociacao(BigDecimal valorNegociacao) {
        this.valorNegociacao = valorNegociacao;
    }

    public LocalDate getDataEntrega() {
        return DataEntrega;
    }

    public void setDataEntrega(LocalDate dataEntrega) {
        DataEntrega = dataEntrega;
    }

    public String getUrlProduto() {
        return UrlProduto;
    }

    public void setUrlProduto(String urlProduto) {
        UrlProduto = urlProduto;
    }

    public String getDescricaoProduto() {
        return descricaoProduto;
    }

    public void setDescricaoProduto(String descricaoProduto) {
        this.descricaoProduto = descricaoProduto;
    }

    public String getUrlImage() {
        return UrlImage;
    }

    public void setUrlImage(String urlImage) {
        UrlImage = urlImage;
    }
}
