// (SERVICES) Responsável pela lógica de negócio relacionada aos utilizadores. Ele actua como uma camada intermediária entre o controlador (ou resource) e o repositório.
package com.mycompany.SrpingBootWeb_maven.services;

import com.mycompany.SrpingBootWeb_maven.entities.Product;
import com.mycompany.SrpingBootWeb_maven.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
	@Autowired
	private ProductRepository repository;

	public List<Product> findAll(){
		return repository.findAll();
	}

	public Product findById(Long id){
		Optional<Product> obj = repository.findById(id);
		return obj.get();
	}

}
