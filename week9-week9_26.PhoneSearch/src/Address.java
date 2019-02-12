public class Address {

    private String street;
    private String city;

    public Address() {
    }
    
    public Address(String street, String address) {
        this.street = street;
        this.city = address;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setStreet(String street) {
        this.street = street;
    }
    
    @Override
    public String toString() {
        if(this.city == null || this.street == null){
            return "address unknown";
        }
        else{
            return "address: " + this.street + " " + this.city;
        }
    }
}