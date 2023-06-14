public class Product {
    private String name;
    private String type;
    private String cloure;
    private String location;
    private int wrrinte;

    public Product(String name,String type,String cloure,String location,int wrrinte) {
        this.name=name;
        this.type=type;
        this.cloure=cloure;
        this.location=location;
        this.wrrinte=wrrinte;
    }

    public Product() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCloure() {
        return cloure;
    }

    public void setCloure(String cloure) {
        this.cloure = cloure;
    }
    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
    public int getWrrinte() {
        return wrrinte;
    }

    public void setWrrinte(int wrrinte) {
        this.wrrinte = wrrinte;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", cloure='" + cloure + '\'' +
                ",location='" + location +'\''+
                ", wrrinte=" + wrrinte +
                '}';
    }
}
