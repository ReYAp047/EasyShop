package miniP.model;

import java.sql.ResultSet;
import java.sql.SQLException;
import miniP.controler.ProductBd;

public class Product {
    private int idP;
    private String name;
    private String category;
    private float price;
    private String description;
    private int amoount;
    private int idV;

    public Product(int idP, String name, String category, int price, String description, int amoount, int idV) {
        this.idP = idP;
        this.name = name;
        this.category = category;
        this.price = price;
        this.description = description;
        this.amoount = amoount;
        this.idV = idV;
    }

    public Product() {
    }

    public Product(String nom, String category, float prix, String description,int amoount) {
        this.name = nom;
        this.category = category;
        this.price = prix;
        this.description = description;
        this.amoount = amoount;        
//To change body of generated methods, choose Tools | Templates.
    }

    public int getIdP() {
        return idP;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public float getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public int getAmoount() {
        return amoount;
    }

    public int getIdV() {
        return idV;
    }

    public void setIdP(int idP) {
        this.idP = idP;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setAmoount(int amoount) {
        this.amoount = amoount;
    }

    public void setIdV(int idV) {
        this.idV = idV;
    }
        public static ResultSet getAllProducts() throws ClassNotFoundException, SQLException {
        ResultSet rs = ProductBd.allProducts();
        return rs;
    }
        public static ResultSet getProductsbyName(String name) throws ClassNotFoundException, SQLException {
        ResultSet rs = ProductBd.ProductsName(name);
        return rs;
    }
        
        public static ResultSet getAllCtegory() throws ClassNotFoundException, SQLException {
        ResultSet rs = ProductBd.allCategory();
        return rs;
    }
        public static ResultSet getProductsByCategory(String cat) throws ClassNotFoundException, SQLException {
        ResultSet rs = ProductBd.allProductsByCategory(cat);
        return rs;
    }
                
      public static ResultSet getProductsByName(String filterName) throws ClassNotFoundException, SQLException {
        ResultSet rs = ProductBd.allProductsByName(filterName);
        return rs;
    }
      public static int UpdatAmount(String name, String amount) throws ClassNotFoundException, SQLException{
        int rs = ProductBd.UpdatAmount(name,amount);
        return rs;
    }           
        
    
    
}
