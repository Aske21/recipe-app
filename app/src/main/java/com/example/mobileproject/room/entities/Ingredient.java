package com.example.mobileproject.room.entities;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.util.Arrays;

@Entity(tableName = "ingredients")
public class Ingredient {

    @PrimaryKey(autoGenerate = true)
    private long recipe_id;
    private String title;
    private String img_url;
    private String ingredients;
    private String Preparation;
    private int rating;


    public Ingredient(long recipe_id, String title, String img_url, String ingredients, int rating, String Preparation) {
        this.recipe_id = recipe_id;
        this.title = title;
        this.img_url = img_url;
        this.ingredients = ingredients;
        this.rating = rating;
        this.Preparation = Preparation;
    }


    // getters

    public long getRecipe_id() {
        return recipe_id;
    }

    public String getTitle() {
        return title;
    }

    public String getIngredients() {
        return ingredients;
    }

    public String getImg_url() {
        return img_url;
    }

    public int getRating() {
        return rating;
    }

    public String getPreparation() { return Preparation; }

    // setters


    public void setRecipe_id(long recipe_id) {
        this.recipe_id = recipe_id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setIngredients(String ingredients) {
        this.ingredients = ingredients;
    }

    public void setImg_url(String img_url) {
        this.img_url = img_url;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public void setPreparation(String preparation) { Preparation = preparation; }
    // to string


    @Override
    public String toString() {
        return "Ingredient{" +
                "recipe_id=" + recipe_id +
                ", title='" + title + '\'' +
                ", img_url='" + img_url + '\'' +
                ", ingredients='" + ingredients + '\'' +
                ", rating=" + rating +
                '}';
    }
}
