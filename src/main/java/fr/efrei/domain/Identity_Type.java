package fr.efrei.domain;

public class Identity_Type {

    private String passeport;
    private String nic;

    public Identity_Type() {
    }

    public String getPasseport() {
        return passeport;
    }

    private Identity_Type(Builder builder) {
        this.passeport = builder.passeport;
        this.nic = builder.nic;
    }

    public String getNic() {
        return nic;
    }

    @Override
    public String toString() {
        return "Identity_Type {" +
                " Passeport  : '" + passeport + '\'' +
                "| NIC : '" + nic + '\'' +
                "}\n";
    }

    public boolean isEmpty (){
        if (passeport == null && nic == null){
            return true;
        }
        return false;
    }

    public static class Builder{

        private String passeport;
        private String nic;


        public Builder setPasseport(String passeport) {
            this.passeport = passeport;
            return this;
        }

        public Builder setNIC(String nic) {
            this.nic = nic;
            return this;
        }

        public Builder copy(Identity_Type identity) {

            this.passeport = identity.passeport;
            this.nic = identity.nic;
            return this;
        }

        public Identity_Type build(){
            return new Identity_Type(this);

        }
    }
}
