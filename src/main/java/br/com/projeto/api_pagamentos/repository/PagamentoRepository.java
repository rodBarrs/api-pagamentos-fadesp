package br.com.projeto.api_pagamentos.repository;

import br.com.projeto.api_pagamentos.model.Pagamento;
import br.com.projeto.api_pagamentos.model.enumeration.StatusPagamento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PagamentoRepository extends JpaRepository<Pagamento, Long> {
    List<Pagamento> findByCodigoDebito(int codigoDebito);
    List<Pagamento> findByCpfCnpjPagador(String pagador);
    List<Pagamento> findByStatus(StatusPagamento status);
    List<Pagamento> findByStatusNot(StatusPagamento status);
}
