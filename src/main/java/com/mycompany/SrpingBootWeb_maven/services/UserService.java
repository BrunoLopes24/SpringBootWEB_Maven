// (SERVICES) Responsável pela lógica de negócio relacionada aos utilizadores. Ele actua como uma camada intermediária entre o controlador (ou resource) e o repositório.
package com.mycompany.SrpingBootWeb_maven.services;

import com.mycompany.SrpingBootWeb_maven.entities.User;
import com.mycompany.SrpingBootWeb_maven.repositories.UserRepository;
import com.mycompany.SrpingBootWeb_maven.services.exceptions.DatabaseException;
import com.mycompany.SrpingBootWeb_maven.services.exceptions.ResourceNotFoundException;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;

@Service
public class UserService {
    @Autowired
    private UserRepository repository;
    
    public List<User> findAll(){
        return repository.findAll();
    }
    
    public User findById(Long id){
        Optional<User> obj = repository.findById(id);
        return obj.orElseThrow(() -> new ResourceNotFoundException(id));
    }
    
    public User insert(User obj){
        return repository.save(obj);
    }
    
    public void deleteById(Long id){
        try {
            repository.deleteById(id);
        } catch (EmptyResultDataAccessException e) {
            throw new ResourceNotFoundException(id);
        } catch (DataIntegrityViolationException e){
            throw new DatabaseException(e.getMessage());
        }
    }
    
    public User updatebyId(Long id, User obj){
        try {
            User entity = repository.getReferenceById(id);
            updateData (entity,obj);
            return repository.save(entity);
        } catch (EntityNotFoundException e) {
            throw new ResourceNotFoundException(id);
        }
    }
    
    private void updateData(User entity, User obj) {
        entity.setName(obj.getName());
        entity.setEmail(obj.getEmail());
        entity.setPhone(obj.getPhone());
    }
    
}
