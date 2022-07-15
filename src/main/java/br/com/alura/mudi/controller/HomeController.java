package br.com.alura.mudi.controller;


import br.com.alura.mudi.model.Pedido;
import br.com.alura.mudi.repository.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


import java.util.List;


@Controller
public class HomeController {

       @Autowired
       private PedidoRepository pedidoRepository;
       @GetMapping("/home")
       public String home(Model model) {

            List<Pedido> pedidos = pedidoRepository.findAll();


            model.addAttribute("pedidos", pedidos);

            return "home";
        }

}
