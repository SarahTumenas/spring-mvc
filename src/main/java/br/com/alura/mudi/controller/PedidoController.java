package br.com.alura.mudi.controller;

import br.com.alura.mudi.dto.RequisiscaoNovoPedido;
import br.com.alura.mudi.model.Pedido;
import br.com.alura.mudi.repository.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.naming.Binding;
import javax.validation.Valid;

@Controller
@RequestMapping("pedido")
public class PedidoController {

    @Autowired
    private PedidoRepository pedidoRepository;

    @GetMapping("formulario")
    public String formulario(RequisiscaoNovoPedido requesicao) {
        return "pedido/formulario";

    }

    @PostMapping("novo")
    public String novo(@Valid RequisiscaoNovoPedido requesicao, BindingResult result) {

        if (result.hasErrors()) {
            return "pedido/formulario";
        }

        Pedido pedido = requesicao.toPedido();
        pedidoRepository.save(pedido);

        return "pedido/formulario";
    }

}
