// (SERVICES) Responsável pela lógica de negócio relacionada aos utilizadores. Ele actua como uma camada intermediária entre o controlador (ou resource) e o repositório.
package com.mycompany.SrpingBootWeb_maven.services;

import com.mycompany.SrpingBootWeb_maven.entities.Order;
import com.mycompany.SrpingBootWeb_maven.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class OrderService {
    @Autowired
    private OrderRepository repository;
    
    public List<Order> findAll(){
        return repository.findAll();
    }
    
    public Order findById(Long id){
        Optional<Order> obj = repository.findById(id);
        return obj.get();
    }
}
