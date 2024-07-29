package RealEstate;


public abstract class Property {
    private String streetAddress;
    private String zip;
    private int listPrice=0;
    private int appraisalPrice=0;

    public Property(String streetAddress, String zip) {
        this.streetAddress = streetAddress;
        this.zip = zip;
    }

    public Property() {
        this.streetAddress = "Property";
        this.zip = "00000";

    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public int getListPrice() {
        return listPrice;
    }

    public void setListPrice(double d){
        this.listPrice = (int) d;
    }

    public int getAppraisalPrice() {
        return appraisalPrice;
    }

    protected void setAppraisalPrice(int appraisalPrice) {
        this.appraisalPrice = appraisalPrice;
    }

    public abstract int calculateAppraisalPrice();

}