package com.example;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.model.Shoe;
import com.example.repository.ShoeRepository;

@SpringBootApplication
public class Main implements CommandLineRunner{
    @Value("${server.port:8080}")
    private String serverPort;

    @Autowired
    private ShoeRepository shoeRepository;

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }

    @Override
    public void run(String... args) {
        if (shoeRepository.count() == 0) {
            shoeRepository.saveAll(List.of(
                new Shoe("4DFWD PULSE SHOES", 160.00, "Adidas", "This product is excluded from all promotional discounts and offers", "/images/img1.png"),
                new Shoe("FORUM MID SHOES", 100.00, "Adidas", "This product is excluded from all promotional discounts and offers", "/images/img2.png"),
                new Shoe("SUPERNOVA SHOES", 150.00, "Adidas", "NMD City Stock 2", "/images/img3.png"),
                new Shoe("BEACH SEASON SHOES", 160.00, "Adidas", "Summer collection", "/images/img4.png"),
                new Shoe("BLACK THADER", 120.00, "Adidas", "Speed Run", "/images/img5.png"),
                new Shoe("FLOWAIR MID SHOES", 160.00, "Adidas", "Speed Run", "/images/img6.png")
            ));
        }

        System.out.println("App is running at port: " + serverPort);
    }
}