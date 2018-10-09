package sut.sa.g21.controller;
import java.util.Collection;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import sut.sa.g21.entity.User;
import sut.sa.g21.entity.Product;
import sut.sa.g21.entity.Preorder;
import sut.sa.g21.entity.Status;
import sut.sa.g21.repository.UserRepository;
import sut.sa.g21.repository.ProductRepository;
import sut.sa.g21.repository.PreorderRepository;
import sut.sa.g21.repository.StatusRepository;

@RestController
public class Controller{
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private ProductRepository productRepository;
    @Autowired
    private PreorderRepository preorderRepository;
    @Autowired
    private StatusRepository statusRepository;

    // --------------- Customer ------------------

    @GetMapping("/Users")
    public Collection<User> user(){
        return userRepository.findAll();
    }
    @GetMapping("/User/{userId}")
    public Optional<User> takeinUserByid(@PathVariable Long userId ){
        return userRepository.findById(userId);
    }


    // ---------------  Product ---------------

    @GetMapping("/Product")
    public Collection<Product> product(){
        return productRepository.findAll();
    }
    
    @GetMapping("/Product/{productId}")
    public Optional<Product> takeinProductByid(@PathVariable Long productId ){
        return productRepository.findById(productId);
    }

    // --------------- Preorder --------------

    @GetMapping("/Preorder")
    public Collection<Preorder> preorder(){
        return preorderRepository.findAll();
    }
    @GetMapping("/Preorder/{preId}")
    public Optional<Preorder> takeinReportByid(@PathVariable Long preId ){
        return preorderRepository.findById(preId);
    }

    // --------------- Status --------------
    @GetMapping("/Status")
    public Collection<Status> status(){
        return statusRepository.findAll();
    }

    @GetMapping("/Status/{Status_id}")
    public Optional<Status> takeinStatusByid(@PathVariable Long statusId ){
        return statusRepository.findById(statusId);
    }

}