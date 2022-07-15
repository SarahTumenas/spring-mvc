package br.com.alura.mudi.controller;

import br.com.alura.mudi.model.Pedido;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

@Controller
public class HomeController {

        @GetMapping("/home")
        public String home(Model model) {
            Pedido pedido = new Pedido();
            pedido.setNomeProduto("Xiaomi Redmi Note 11");
            pedido.setValorNegociado(new BigDecimal("1379.99"));
            pedido.setDataDaEntrega(LocalDate.now());
            pedido.setUrlProduto("https://www.amazon.com.br/Xiaomi-Redmi-Note-11-Graphite/dp/B09QSB4N2C/ref=sr_1_7?keywords=xiaomi&qid=1657832416&sr=8-7&ufe=app_do%3Aamzn1.fos.25548f35-0de7-44b3-b28e-0f56f3f96147");
            pedido.setUrlImagem("https://m.media-amazon.com/images/I/51e3KdrHuCL._AC_SL1080_.jpg");
            pedido.setDescricao("Xiaomi Redmi Note 11 - Graphite Gray 6GB Ram 128GB Rom");


            List<Pedido> pedidos = Arrays.asList(pedido);

            model.addAttribute("pedidos", pedidos);

            return "home";
        }

}
