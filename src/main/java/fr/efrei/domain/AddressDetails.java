package fr.efrei.domain;

public class AddressDetails {
    private String streetAddress;
    private String postalAddress;


    private AddressDetails() {}

    private AddressDetails(Builder builder) {
        this.postalAddress = builder.postalAddress;
        this.streetAddress = builder.streetAddress;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public String getPostalAddress() {
        return postalAddress;
    }

    @Override
    public String toString() {
        return "AddressDetails{" +
                "Street Address : '" + streetAddress + '\'' +
                "| Postal Address : '" + postalAddress + '\'' +
                "}\n";
    }

    public boolean isEmpty (){
        if (streetAddress == null && postalAddress == null){
            return true;
        }
        return false;
    }

    public static class Builder{
        private String streetAddress;
        private String postalAddress;


        public Builder setStreetAddress(String streetAddress) {
            this.streetAddress = streetAddress;
            return this;
        }

        public Builder setPostalAddress(String postalAddress) {
            this.postalAddress = postalAddress;
            return this;
        }

        public Builder copy(AddressDetails addressDetails) {

            this.streetAddress = addressDetails.streetAddress;
            this.postalAddress = addressDetails.postalAddress;
            return this;
        }

        public AddressDetails build(){
            return new AddressDetails(this);

        }
    }
}
