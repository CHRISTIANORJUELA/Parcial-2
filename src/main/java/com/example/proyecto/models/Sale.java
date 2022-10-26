package com.example.proyecto.models;

public class Sale {
    private String codeSale;
    private String daySale;
    private String client;
    private String nameProduct;
    private int stockSaleProduct;

    public Sale(String codeSale, String daySale, String client, String nameProduct, int stockSaleProduct) {
        this.codeSale = codeSale;
        this.daySale = daySale;
        this.stockSaleProduct = stockSaleProduct;
        this.client = client;
        this.nameProduct = nameProduct;
    }

    public String getCodeSale() {
        return codeSale;
    }

    public void setCodeSale(String codeSale) {
        this.codeSale = codeSale;
    }

    public String getDaySale() {
        return daySale;
    }

    public void setDaySale(String daySale) {
        this.daySale = daySale;
    }

    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public int getStockSaleProduct() {
        return stockSaleProduct;
    }

    public void setStockSaleProduct(int stockSaleProduct) {
        this.stockSaleProduct = stockSaleProduct;
    }
}
