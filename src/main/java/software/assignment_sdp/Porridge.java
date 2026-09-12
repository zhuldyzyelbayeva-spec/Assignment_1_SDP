package software.assignment_sdp;

import java.util.List;
import java.util.ArrayList;

public class Porridge {
    private String grain;
    private String liquid;
    private boolean butter;
    private List<String> fruits;
    private List<String> nutsAndSeeds;

    private Porridge(Builder builder) {
        this.grain = builder.grain;
        this.liquid = builder.liquid;
        this.butter = builder.butter;
        this.fruits = builder.fruits;
        this.nutsAndSeeds = builder.nutsAndSeeds;
    }

    @Override
    public String toString() {
        return "Porridge {" +
                "grain='" + grain + '\'' +
                ", liquid='" + liquid + '\'' +
                ", butter=" + butter +
                ", fruits=" + fruits +
                ", nutsAndSeeds=" + nutsAndSeeds +
                '}';
    }

    public static class Builder {
        private String grain;
        private String liquid;
        private boolean butter;
        private List<String> fruits;
        private List<String> nutsAndSeeds;

        public Builder setGrain(String grain) {
            this.grain = grain;
            return this;
        }

        public Builder setLiquid(String liquid) {
            this.liquid = liquid;
            return this;
        }

        public Builder addButter(boolean butter) {
            this.butter = butter;
            return this;
        }

        public Builder addFruit(String fruit) {
            if (this.fruits == null) {
                this.fruits = new ArrayList<>();
            }
            this.fruits.add(fruit);
            return this;
        }

        public Builder addNutOrSeed(String nutOrSeed) {
            if (this.nutsAndSeeds == null) {
                this.nutsAndSeeds = new ArrayList<>();
            }
            this.nutsAndSeeds.add(nutOrSeed);
            return this;
        }

        public Porridge build() {
            return new Porridge(this);
        }
    }
}