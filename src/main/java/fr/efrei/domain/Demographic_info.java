package fr.efrei.domain;

public class Demographic_info {
    private Race race;
    private String sex;


    private Demographic_info (Builder builder) {
        this.race = builder.race;
        this.sex = builder.sex;
    }

    public Race getRace() {
        return race;
    }

    public String getSex() {
        return sex;
    }

    @Override
    public String toString() {
        return "Demographic_info { " +
                race + " | Sex='" + sex + '\'' +
                '}';
    }

    public boolean isEmpty (){
        if (race == null && sex == null){
            return true;
        }
        return false;
    }

    public static class Builder {
        private Race race;
        private String sex;

        public Builder setRace(Race race) {
            this.race = race;
            return this;
        }

        public Builder setSex(String sex) {
            this.sex = sex;
            return this;
        }

        public Builder copy (Demographic_info info) {
            this.race = info.race;
            this.sex = info.sex;
            return this;
        }

        public Demographic_info build () {
            return new Demographic_info(this);
        }
    }
}
