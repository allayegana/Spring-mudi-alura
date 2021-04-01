package br.com.alura.mudii.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/oferta")
public class ofertaController {


    @GetMapping
    public String getFormulariosParaOferta(){

        return "oferta/home";
    }
}
