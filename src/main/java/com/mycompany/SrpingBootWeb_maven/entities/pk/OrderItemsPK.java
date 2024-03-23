package com.mycompany.SrpingBootWeb_maven.entities.pk;

import com.mycompany.SrpingBootWeb_maven.entities.Order;
import com.mycompany.SrpingBootWeb_maven.entities.Product;
import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import java.io.Serializable;
import java.util.Objects;

@Embeddable // É usada para marcar uma classe como uma classe incorporável, ou seja, podem ser incluídos como parte de outra entidade(class) persistente.
public class OrderItemsPK implements Serializable{
    
    @ManyToOne
    @JoinColumn(name = "order_id")
    private Order order;
    
    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;
    
    
    public Order getOrder() {
        return order;
    }
    
    public void setOrder(Order order) {
        this.order = order;
    }
    
    public Product getProduct() {
        return product;
    }
    
    public void setProduct(Product product) {
        this.product = product;
    }
    
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 29 * hash + Objects.hashCode(this.order);
        hash = 29 * hash + Objects.hashCode(this.product);
        return hash;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final OrderItemsPK other = (OrderItemsPK) obj;
        if (!Objects.equals(this.order, other.order)) {
            return false;
        }
        return Objects.equals(this.product, other.product);
    }
    
}
