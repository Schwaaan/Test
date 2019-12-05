package mercado.cflow.domain;

public class Pedido {

  private Produto produto;
  private Integer quantityPedida;
  private Integer discount;


  public Produto getProduto() {
    return produto;
  }

  public void setProduto(Produto produto) {
    this.produto = produto;
  }

  public Integer getQuantityPedida() {
    return quantityPedida;
  }

  public void setQuantityPedida(Integer quantityPedida) {
    this.quantityPedida = quantityPedida;
  }

  public Integer getDiscount() {
    return discount;
  }

  public void setDiscount(Integer discount) {
    this.discount = discount;
  }

  public Double getTotalPedido() {
    Double valorUnitario = this.getProduto().getValor();
    Integer quantidadePedida = this.getQuantityPedida();
    Integer desconto = this.getDiscount();
    Integer totalEmEstoque = getProduto().getTotalEmEstoque();
    Double valorTotal = (valorUnitario * quantidadePedida);
    Double descontoPorcento = desconto / Double.valueOf("100");
    Integer estoqueFinal = totalEmEstoque - quantidadePedida;
    Double total = valorTotal - (valorTotal * descontoPorcento);
    return total;
  }

  public Integer getEstoqueFinal(){
    Integer totalEmEstoque = getProduto().getTotalEmEstoque();
    Integer quantidadePedida = this.getQuantityPedida();
    Integer totalFinalEmEstoque = totalEmEstoque - quantidadePedida;
    return totalFinalEmEstoque;

  }

}
