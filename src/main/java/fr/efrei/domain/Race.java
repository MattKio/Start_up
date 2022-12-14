package fr.efrei.domain;

public class Race {
    private String id;
    private String description;

    private Race() {}

    private Race(Builder builder) {
        this.id = builder.ID;
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
        return  id + '\'' +
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
        private String ID;
        private String description;


        public Builder setID(String ID) {
            this.ID = ID;
            return this;
        }

        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }

        public Builder copy(Race race) {

            this.ID = race.id;
            this.description = race.description;
            return this;
        }

        public Race build(){
            return new Race(this);

        }
    }
}
