// (SERVICES) Responsável pela lógica de negócio relacionada aos utilizadores. Ele actua como uma camada intermediária entre o controlador (ou resource) e o repositório.
package com.mycompany.SrpingBootWeb_maven.services;

import com.mycompany.SrpingBootWeb_maven.entities.Category;
import com.mycompany.SrpingBootWeb_maven.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {
    @Autowired
    private CategoryRepository repository;
    
    public List<Category> findAll(){
        return repository.findAll();
    }
    
    public Category findById(Long id){
        Optional<Category> obj = repository.findById(id);
        return obj.get();
    }
}
