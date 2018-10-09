package sut.sa.g21.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.*;
@Entity
@Getter @Setter
@Table(name="Product")
public class Product{
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private @NonNull Long productId;
    private @NonNull String ProductName;   
    private @NonNull String ProductDetail;
   

    
    @ManyToMany(fetch= FetchType.LAZY)
    @JoinTable(name = "ProductPreorder",
    joinColumns = {
        @JoinColumn(name = "Product", referencedColumnName = "ProductId")},
    inverseJoinColumns = {
        @JoinColumn(name = "Preorder", referencedColumnName = "PreId")})
    private List<Preorder> abc= new ArrayList<>();
    
     
    
    public Product(){}
    

    public Product(String productName, String productDetail) {
      this.ProductName = productName;
      this.ProductDetail =productDetail;

    }
}