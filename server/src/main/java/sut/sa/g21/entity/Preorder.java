package sut.sa.g21.entity;
import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.*;
import java.util.List;
@Entity
@Getter @Setter
@Table(name="Preorder")
public class Preorder{
     @Id
     @GeneratedValue(strategy= GenerationType.IDENTITY)
    private @NonNull Long preId;
    private @NonNull String preName;
    private double totalPrice;

    @ManyToOne()
    @JoinColumn(name= "userId")
    private User user;
    
    @ManyToMany(mappedBy = "abc", fetch = FetchType.LAZY)
    private List<Product> product;

    @ManyToOne()
    @JoinColumn(name= "statusId")
    private Status status;

    protected Preorder(){}
    public Preorder(String preName,double totalPrice){
        this.preName = preName;
        this.totalPrice = totalPrice;
    }
}