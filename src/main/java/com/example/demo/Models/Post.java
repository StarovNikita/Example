package com.example.demo.Models;
import javax.persistence.*;


@Entity
@Table(name = "Post")
public class Post {

    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Long id;
    private  String NameOfProduct;
    //private float Cost;
    private String DescriptionOfProduct;

    public Post(String nameOfProduct, String descriptionOfProduct) {

        this.NameOfProduct = nameOfProduct;
        this.DescriptionOfProduct = descriptionOfProduct;
    }
    public  Post(){}

    /*public float getCoast() {
        return Cost;
    }

    public void setCoast(float cost) {
        Cost = cost;
    }*/

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
