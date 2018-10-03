package sut.sa.g21.entity;
import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.*;
import java.util.ArrayList;
import java.util.List;
@Entity
@Getter @Setter
@Table(name="Product")
public class Product{
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private @NonNull Long productId;
    private @NonNull String productName;   
    private String productDetail;
    private double productPrice;
    private String productImgUrl;

    /*
    @ManyToMany(fetch= FetchType.LAZY)
    @JoinTable(name = "Product_Report",
    joinColumns = {
        @JoinColumn(name = "Product", referencedColumnName = "Product_id")},
    inverseJoinColumns = {
        @JoinColumn(name = "report", referencedColumnName = "Report_id")})
    private List<Report> abc= new ArrayList<>();
    */
    
    public Product(){}
    public Product(String productName,String productDetail,double productPrice,String productImgUrl){
      this.productName = productName;
      this.productDetail = productDetail;
      this.productPrice = productPrice;
      this.productImgUrl = productImgUrl;
    }
}