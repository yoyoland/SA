package sut.sa.g21.entity;
import javax.persistence.*;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.*;
@Getter @Setter
@Table(name="User")
public class User{
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private @NonNull Long userId;
    private @NonNull String userFname;
    private @NonNull String userLname;
    private String userAddress;
    private @NonNull String userEmail;
    private @NonNull String userTel;
 
    public User(){}
    public User(Long userId,String userFname,String userLname,String userAddress,String userEmail,String userTel){
        this.userId = userId;
        this.userFname = userFname;
        this.userLname = userLname;
        this.userAddress = userAddress;
        this.userEmail = userEmail;
        this.userTel = userTel;
    }
}