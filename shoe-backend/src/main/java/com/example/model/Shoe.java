package com.example.model;

import jakarta.persistence.*;

@Entity
@Table(name = "SHOE")
public class Shoe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name = "pName")
    private String pName;

    @Column(name = "pPrice")
    private double pPrice;

    @Column(name = "pBrand")
    private String pBrand;

    @Column(name = "pDesc")
    private String pDesc;

    @Column(name = "pImage")
    private String pImage;

    // Default constructor
    public Shoe() {
    }
    // Parameterized constructor
    public Shoe(String pName, double pPrice, String pBrand, String pDesc, String pImage) {
        this.pName = pName;
        this.pPrice = pPrice;
        this.pBrand = pBrand;
        this.pDesc = pDesc;
        this.pImage = pImage;
    }

    // Getters and setters
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getpName() {
        return pName;
    }
    public void setpName(String pName) {
        this.pName = pName;
    }
    public double getpPrice() {
        return pPrice;
    }
    public void setpPrice(double pPrice) {
        this.pPrice = pPrice;
    }
    public String getpBrand() {
        return pBrand;
    }
    public void setpBrand(String pBrand) {
        this.pBrand = pBrand;
    }
    public String getpDesc() {
        return pDesc;
    }
    public void setpDesc(String pDesc) {
        this.pDesc = pDesc;
    }
    public String getpImage() {
        return pImage;
    }
    public void setpImage(String pImage) {
        this.pImage = pImage;
    }
}
