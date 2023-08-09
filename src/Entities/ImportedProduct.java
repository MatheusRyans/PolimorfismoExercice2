package Entities;

import org.w3c.dom.ls.LSOutput;

public class ImportedProduct extends Product{

    private Double customsFee;

    public ImportedProduct(){
        super();
    }
    public ImportedProduct(String name, Double price, Double customsFee) {
        super(name, price);
        this.customsFee = customsFee;
    }
    @Override
    public String priceTag(){

        return  super.getName() + " $ " +  totalPrice() + "(Custom fee: $" + customsFee + ")" ;
    }

    public Double totalPrice(){
        return super.getPrice() + customsFee;
    }
}
