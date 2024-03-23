// É uma interface que estende JpaRepository, uma interface fornecida pelo Spring Data JPA.
// Ele fornece métodos para realizar operações de persistência relacionadas aos usuários no banco de dados, como salvar, excluir, atualizar e recuperar usuários.

package com.mycompany.SrpingBootWeb_maven.repositories;

import com.mycompany.SrpingBootWeb_maven.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
