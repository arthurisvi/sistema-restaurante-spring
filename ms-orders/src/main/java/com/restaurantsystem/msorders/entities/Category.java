package com.restaurantsystem.msorders.entities;

public enum Category {
    STARTER("Entrada"),
    MAIN("Prato principal"),
    DESSERT("Sobremesa"),
    DRINK("Bebidas"),
    ALCOHOLIC("Bebidas alcoolicas");

    private String productCategory;

    Category(){

    }
    Category(String describe){
        this.productCategory = describe;
    }

    public String getDescription(){
        return productCategory;
    }
}
