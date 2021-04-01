package br.com.alura.mudii.dto;


import br.com.alura.mudii.modelo.Pedido;
import br.com.alura.mudii.modelo.StatusPedido;
import org.springframework.context.annotation.Configuration;

import javax.validation.constraints.NotBlank;
import java.math.BigDecimal;
import java.time.LocalDate;

@Configuration
public class NovoPedidos {

    @NotBlank
    private String nomeProduto;
    private BigDecimal valorNegociacao;
    @NotBlank
    private String  UrlProduto;
    private LocalDate dataEntregar;
    @NotBlank
    private String   UrlImage;
    private String descricaoProduto;
    private StatusPedido status;

    public StatusPedido getStatus() {
        return status;
    }

    public void setStatus(StatusPedido status) {
        this.status = status;
    }

    public String getDescricaoProduto() {
        return descricaoProduto;
    }

    public void setDescricaoProduto(String descricaoProduto) {
        this.descricaoProduto = descricaoProduto;
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

    public String getUrlProduto() {
        return UrlProduto;
    }

    public void setUrlProduto(String urlProduto) {
        UrlProduto = urlProduto;
    }

    public LocalDate getDataEntregar() {
        return dataEntregar;
    }

    public void setDataEntregar(LocalDate dataEntregar) {
        this.dataEntregar = dataEntregar;
    }

    public String getUrlImage() {
        return UrlImage;
    }

    public void setUrlImage(String urlImage) {
        UrlImage = urlImage;
    }


    public Pedido toPedido() {

        Pedido pedido = new Pedido();

        pedido.setValorNegociacao(valorNegociacao);
        pedido.setDescricaoProduto(descricaoProduto);
        pedido.setDataEntrega(dataEntregar);
        pedido.setNomeProduto(nomeProduto);
        pedido.setUrlImage(UrlImage);
        pedido.setUrlProduto(UrlProduto);
        pedido.setStatus(status.ENTREGUE);

     return pedido;

    }
}
