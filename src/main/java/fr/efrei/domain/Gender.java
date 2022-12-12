package fr.efrei.domain;

public class Gender {
    private String id;
    private String description;

    private Gender() {}

    private Gender(Builder builder) {
        this.id = builder.id;
        this.description = builder.description;
    }


    public String getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }


    @Override
    public String toString() {
        return  "ID Gender : '" + id + '\'' +
                " | Description'" + description + '\'' +
                '}';
    }

    public boolean isEmpty (){
        if (id == null && description == null){
            return true;
        }
        return false;
    }

    public static class Builder{
        private String id;
        private String description;


        public Gender.Builder setId(String id) {
            this.id = id;
            return this;
        }

        public Gender.Builder setDescription(String description) {
            this.description = description;
            return this;
        }

        public Gender.Builder copy(Gender sex) {

            this.id = sex.id;
            this.description = sex.description;
            return this;
        }

        public Gender build(){
            return new Gender(this);

        }
    }
}
