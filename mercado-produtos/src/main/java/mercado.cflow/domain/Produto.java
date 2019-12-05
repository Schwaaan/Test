package mercado.cflow.domain;

public class Produto {

  private String nome;
  private Integer totalEmEstoque;
  private Double valor;
  private Integer codigoProduto;

  public Produto(String nome, Integer totalEmEstoque, Double valor, Integer codigoProduto) {
    this.nome = nome;
    this.totalEmEstoque = totalEmEstoque;
    this.valor = valor;
    this.codigoProduto = codigoProduto;
  }

  public String getNome() {
    return nome;
  }

  public Integer getCodigoProduto() {
    return codigoProduto;
  }

  public void setCodigoProduto(Integer codigoProduto) {
    this.codigoProduto = codigoProduto;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public Integer getTotalEmEstoque() {
    return totalEmEstoque;
  }

  public void setTotalEmEstoque(Integer totalEmEstoque) {
    this.totalEmEstoque = totalEmEstoque;
  }

  public Double getValor() {
    return valor;
  }

  public void setValor(Double valor) {
    this.valor = valor;
  }
}