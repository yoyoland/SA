package sut.sa.g21.entity;
import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.*;
@Entity
@Getter @Setter
@Table(name="Status")
public class Status{
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private @NonNull Long statusId;
    private @NonNull String statusName;

    public Status(){}
    public Status(String statusName){
        this.statusName = statusName;
        
    }
    public Status(Long statusId){
        this.statusId = statusId;
    }
}