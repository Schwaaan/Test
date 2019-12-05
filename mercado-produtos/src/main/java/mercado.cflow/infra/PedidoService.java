package mercado.cflow.infra;

import java.util.ArrayList;
import java.util.List;
import mercado.cflow.domain.Pedido;
import mercado.cflow.domain.Produto;

public class PedidoService {


  public List<Produto> produtos = new ArrayList<Produto>();

  public PedidoService() {
    produtos.add(new Produto("iphone", 10, 100.0, 10));
    produtos.add(new Produto("xiaomi", 10, 1000.0, 50));
    produtos.add(new Produto("ipad", 10, 3300.0, 5));
  }

  public Produto buscaPeloCodigo(Integer codigoProduto) {
    for (Produto produto : produtos) {

      if (produto.getCodigoProduto().equals(codigoProduto)) {
        return produto;
      }

    }
    return null;
  }

  public Pedido fazerPedido(Integer codigo, Integer quantidadePedida, Integer discount) {
    Produto produto = buscaPeloCodigo(codigo);
    if (quantidadePedida <= produto.getTotalEmEstoque()) {
      Pedido pedido = new Pedido();
      pedido.setQuantityPedida(quantidadePedida);
      pedido.setDiscount(discount);
      pedido.setProduto(produto);
      System.out.println("Pedido feito com sucesso");
      return pedido;
    } else {
      System.out.println("quantidade Esgotada");
    }
    return null;
  }



}
