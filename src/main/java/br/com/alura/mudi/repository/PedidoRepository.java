package br.com.alura.mudi.repository;

import br.com.alura.mudi.model.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;




@Repository
public interface PedidoRepository extends JpaRepository<Pedido, Long> {
}
