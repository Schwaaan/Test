package mercado.cflow;


import java.util.Scanner;
import mercado.cflow.domain.Pedido;
import mercado.cflow.infra.PedidoService;

public class Apllication {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    System.out.println("qual codigo do produto?");
    String codigoProduto = scanner.next();
    Integer codigoProduto1 = new Integer(codigoProduto);
    System.out.println(codigoProduto);
    System.out.println("qual a quantidade?");
    String pergunta2 = scanner.next();
    Integer resposta2 = new Integer(pergunta2);
    PedidoService pedidoService = new PedidoService();
    Pedido pedido = pedidoService.fazerPedido(codigoProduto1, resposta2,10 );
    System.out.println("Produto: " + pedido.getProduto().getNome());
    System.out.println("Quantidade do Pedido: " + pedido.getQuantityPedida() + " unidades");
    System.out.println("Quantidade que Sobrou no Estoque: " + pedido.getEstoqueFinal());
    System.out.println("Desconto : " + pedido.getDiscount() + "%");
    System.out.println("Total : R$" + pedido.getTotalPedido());
  }

}
