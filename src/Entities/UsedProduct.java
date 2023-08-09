package Entities;

import java.time.LocalDate;
import java.util.Date;

public class UsedProduct extends Product {

    private LocalDate manufacturedDate;

    public UsedProduct(){
        super();
    }

    public UsedProduct(String name, Double price, LocalDate manufacturedDate) {
        super(name, price);
        this.manufacturedDate = manufacturedDate;
    }

    public LocalDate getManufacturedDate() {
        return manufacturedDate;
    }

    public void setManufacturedDate(LocalDate manufacturedDate) {
        this.manufacturedDate = manufacturedDate;
    }
    @Override
    public String priceTag(){

        return super.getName() + "(used) $ " + getPrice() + " (Manufacture date: " + manufacturedDate + ")";
    }
}
