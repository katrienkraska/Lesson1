package task5;

public class Address {
    private int  index;
    private String country;
    private String city;
    private  String street;
    private int house;
    private int apartment;

    public Address(int newIndex, String newCountry,
                   String newCity, String newStreet, int newHouse, int newApartment){
index = newIndex;
country = newCountry;
city = newCity;
street = newStreet;
house = newHouse;
apartment = newApartment;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }


    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }



    public int getHouse() {
        return house;
    }

    public void setHouse(int house) {
        this.house = house;
    }



    public int getApartment() {
        return apartment;
    }
    public void setApartment(int apartment) {
        this.apartment = apartment;
    }

    class TestAddress{
        public static void main(String[] args) {
            Address address = new Address(49000, "Ukraine",
                    "Dnipro", "Gagaryna", 50, 334);

            int index = address.index;
            String country = address.country;
            String city = address.city;
            String street = address.street;
            int house = address.house;
            int apartment = address.apartment;
            System.out.println("Index = " + index + "\tCountry = " + country + "\tCity = "+ city +
                    "\tStreet = " + street + "\tHouse = " + house + "\tApartment = " + apartment);
        }
    }
}
