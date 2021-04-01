package br.com.alura.mudii.Repository;


import br.com.alura.mudii.modelo.Pedido;
import br.com.alura.mudii.modelo.StatusPedido;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PedidoRepository extends JpaRepository<Pedido, Long> {

    List<Pedido> findByStatus(StatusPedido status, Sort sort);
}
