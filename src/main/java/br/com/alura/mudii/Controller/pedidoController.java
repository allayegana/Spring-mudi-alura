package br.com.alura.mudii.Controller;


import br.com.alura.mudii.Repository.PedidoRepository;
import br.com.alura.mudii.dto.NovoPedidos;
import br.com.alura.mudii.modelo.Pedido;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;


@Controller
@RequestMapping("pedido")
public class pedidoController {
    @Autowired
    private PedidoRepository pedidoRepository;

    @GetMapping("/formulario")
    public String formulario(NovoPedidos novoPedidos){
        return "pedido/formulario";
    }


        @PostMapping("/novo")
        public String pedidosFormularios(@Valid NovoPedidos novoPedidos, BindingResult result){
        if (result.hasErrors()){
            return "pedido/formulario";
        }
            Pedido pedido = novoPedidos.toPedido();
             pedidoRepository.save(pedido);
            return "redirect:/home";
        }
}
