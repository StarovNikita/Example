package com.example.demo.Models;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Post {

    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Long id;
    private String NameOfProduct;
    private float Coast;
    private String DescriptionOfProduct;

    public float getCoast() {
        return Coast;
    }

    public void setCoast(float coast) {
        Coast = coast;
    }

    public String getDescriptionOfProduct() {
        return DescriptionOfProduct;
    }

    public void setDescriptionOfProduct(String descriptionOfProduct) {
        DescriptionOfProduct = descriptionOfProduct;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNameOfProduct() {
        return NameOfProduct;
    }

    public void setNameOfProduct(String nameOfProduct) {
        NameOfProduct = nameOfProduct;
    }
}
