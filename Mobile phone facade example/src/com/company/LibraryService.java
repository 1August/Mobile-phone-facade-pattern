package com.company;

public class LibraryService {
    History history;
    Fantasy fantasy;
    Horror horror;

    public void iPhoneSale(){
        System.out.println("IPhone has a sale!");
    }
    public void samsunSale(){
        System.out.println("Samsung has a sale!");
    }
    public void xiaomiSale(){
        System.out.println("Xiaomi has a sale!");
    }

    public LibraryService() {}
    public LibraryService(History history, Fantasy fantasy, Horror horror) {
        this.history = history;
        this.fantasy = fantasy;
        this.horror = horror;
    }
}
