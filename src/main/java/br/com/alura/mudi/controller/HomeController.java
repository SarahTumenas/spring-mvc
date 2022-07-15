package br.com.alura.mudi.controller;


import br.com.alura.mudi.model.Pedido;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;


@Controller
public class HomeController {

    @PersistenceContext
    private EntityManager entityManager;

        @GetMapping("/home")
        public String home(Model model) {
            Query query = entityManager.createQuery("select p from Pedido p", Pedido.class);
            List<Pedido> pedidos = query.getResultList();

            model.addAttribute("pedidos", pedidos);

            return "home";
        }

}
