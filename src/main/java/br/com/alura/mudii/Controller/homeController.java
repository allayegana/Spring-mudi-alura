package br.com.alura.mudii.Controller;


import br.com.alura.mudii.Repository.PedidoRepository;
import br.com.alura.mudii.modelo.Pedido;
import br.com.alura.mudii.modelo.StatusPedido;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/home")
public class homeController {

@Autowired
private PedidoRepository pedidoRepository;

   @GetMapping
    public String home(Model model){
        List<Pedido> pedidos = pedidoRepository.findAll();
        model.addAttribute("pedidos" ,pedidos);
        return "home";
    }

    @GetMapping("/{status}")
    public String porStatus(@PathVariable("status") String status, Model model){
        Sort sort = Sort.by("DataEntrega").descending();
        List<Pedido> pedidos = pedidoRepository.findByStatus( StatusPedido.valueOf(status.toUpperCase()), sort);
        model.addAttribute("pedidos" ,pedidos);
        model.addAttribute("status",status);
        return "home";

   }

   @ExceptionHandler({IllegalArgumentException.class})
   public String onError(){

       return "redirect:/home";
  }

}


