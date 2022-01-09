package day04;

import java.time.LocalDate;

public abstract class WebShopItem {

    public static final int DEFAULT_EXPIRE=3;

    private String name;
    private int price;
    private LocalDate expirationDate;

    public WebShopItem(String name, int price) {
        this.name = name;
        this.price = price;
    }

     public LocalDate getExpireDate() {
        if(expirationDate == null){
            throw new IllegalStateException("Expiration date is null!");
        }
        return expirationDate;
    }

    public void setExpirationDate(LocalDate expirationDate) {
        this.expirationDate = expirationDate;
    }

    public abstract WebShopItem copy();

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }
}
