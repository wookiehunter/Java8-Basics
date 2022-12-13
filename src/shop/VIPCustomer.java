package shop;

public class VIPCustomer extends Customer {
    private String base;

    public VIPCustomer() {}

    public VIPCustomer(String base) {
        this.base = base;
    }

    public String getBase() {
        return base;
    }

    public void setBase(String base) {
        this.base = base;
    }
}
