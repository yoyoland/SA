package sut.sa.g21.controller;
import com.example.demo.entity.*;
import com.example.demo.repository.*;
import java.util.Collection;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import sut.sa.g21.entity.Customer;
import sut.sa.g21.entity.Product;
import sut.sa.g21.entity.Report;
import sut.sa.g21.entity.Status;
import sut.sa.g21.repository.CustomerRepository;
import sut.sa.g21.repository.ProductRepository;
import sut.sa.g21.repository.ReportRepository;
import sut.sa.g21.repository.StatusRepository;

@RestController
public class Controller{
    @Autowired
    private CustomerRepository customerRepository;
    @Autowired
    private ProductRepository productRepository;
    @Autowired
    private ReportRepository reportRepository;
    @Autowired
    private StatusRepository statusRepository;

    // --------------- Customer ------------------

    @GetMapping("/Customer")
    public Collection<Customer> customer(){
        return customerRepository.findAll();
    }
    @GetMapping("/Customer/{Customer_id}")
    public Optional<Customer> takeinCustomerByid(@PathVariable Long Customer_id ){
        return customerRepository.findById(Customer_id);
    }


    // ---------------  Product ---------------

    @GetMapping("/Product")
    public Collection<Product> product(){
        return productRepository.findAll();
    }
    
    @GetMapping("/Product/{Product_id}")
    public Optional<Product> takeinProductByid(@PathVariable Long Product_id ){
        return productRepository.findById(Product_id);
    }

    // --------------- Report --------------

    @GetMapping("/Report")
    public Collection<Report> report(){
        return reportRepository.findAll();
    }
    @GetMapping("/Report/{Report_id}")
    public Optional<Report> takeinReportByid(@PathVariable Long Report_id ){
        return reportRepository.findById(Report_id);
    }

    // --------------- Status --------------
    @GetMapping("/Status")
    public Collection<Status> status(){
        return statusRepository.findAll();
    }

    @GetMapping("/Status/{Status_id}")
    public Optional<Status> takeinStatusByid(@PathVariable Long Status_id ){
        return statusRepository.findById(Status_id);
    }

}