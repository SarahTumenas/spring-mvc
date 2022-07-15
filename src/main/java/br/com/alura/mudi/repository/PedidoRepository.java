package br.com.alura.mudi.repository;

import br.com.alura.mudi.model.Pedido;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@Repository
public class PedidoRepository {

    @PersistenceContext
    private EntityManager entityManager;


    public List <Pedido> recuperaTodosOsPedidos() {
        Query query = entityManager.createQuery("select p from Pedido p", Pedido.class);
        return query.getResultList();
    }
}
