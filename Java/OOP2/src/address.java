public class address {
    String district;
    String city;
    String country;
    
    public address(String district, String city, String country) {
        this.district = district;
        this.city = city;
        this.country = country;
    }
    @Override
    public String toString() {
        return district + " " +city + " " + country;
    }

    
}
