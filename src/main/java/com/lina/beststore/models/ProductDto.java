package com.lina.beststore.models;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import org.springframework.web.multipart.MultipartFile;

public class ProductDto {
    @NotEmpty(message = "The name is required")
    private String Name;
    @NotEmpty(message = "The brand is required")
    private String Brand;
    @NotEmpty(message = "The category is required")
    private String Category;
    @Min(0)
    private double price;
    @Size(min = 10 , message = "The description should be at least 10 characters")
    @Size(max = 2000, message = "The description cannot exceed 2000 characters")
    private String Description;
    private MultipartFile imageFile;

    public @NotEmpty(message = "The name is required") String getName() {
        return Name;
    }

    public void setName(@NotEmpty(message = "The name is required") String name) {
        Name = name;
    }

    public @NotEmpty(message = "The brand is required") String getBrand() {
        return Brand;
    }

    public void setBrand(@NotEmpty(message = "The brand is required") String brand) {
        Brand = brand;
    }

    public @NotEmpty(message = "The category is required") String getCategory() {
        return Category;
    }

    public void setCategory(@NotEmpty(message = "The category is required") String category) {
        Category = category;
    }

    @Min(0)
    public double getPrice() {
        return price;
    }

    public void setPrice(@Min(0) double price) {
        this.price = price;
    }

    public @Size(min = 10, message = "The description should be at least 10 characters") @Size(max = 2000, message = "The description cannot exceed 2000 characters") String getDescription() {
        return Description;
    }

    public void setDescription(@Size(min = 10, message = "The description should be at least 10 characters") @Size(max = 2000, message = "The description cannot exceed 2000 characters") String description) {
        Description = description;
    }

    public MultipartFile getImageFile() {
        return imageFile;
    }

    public void setImageFile(MultipartFile imageFile) {
        this.imageFile = imageFile;
    }
}
