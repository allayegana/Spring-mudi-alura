package br.com.alura.mudii.API;//package br.com.omni.mudi.API;


//import br.com.omni.mudi.Repository.PedidoRepository;
//import br.com.omni.mudi.modelo.Pedido;
//import br.com.omni.mudi.modelo.StatusPedido;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.domain.Sort;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;

//@RestController
//@RequestMapping("/api/pedidos")
//public class PedidoRest {
//
//    @Autowired
//    private PedidoRepository pedidoRepository;
//
//
//    @GetMapping("aguardando")
//     public List<Pedido> getRespositoryPedido(){
//         Sort sort = Sort.by("id").descending();
//
//         return pedidoRepository.findByStatus(StatusPedido.ENTREGUE , sort);
//     }
//
//
//}
