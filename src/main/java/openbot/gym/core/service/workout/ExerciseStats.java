package openbot.gym.core.service.workout;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ExerciseStats {

    private final int numberOfSets;
    private final List<Integer> numberOfRepeats;
    private final List<Double> weight;

    public ExerciseStats(int numberOfSets, List<Integer> numberOfRepeats, List<Double> weight) {
        this.numberOfSets = numberOfSets;
        this.numberOfRepeats = numberOfRepeats;
        this.weight = weight;
    }

    public int getNumberOfSets() {
        return numberOfSets;
    }

    public List<Integer> getNumberOfRepeats() {
        return numberOfRepeats;
    }

    public List<Double> getWeight() {
        return weight;
    }

    static class ExerciseStatsBuilder {
        private final int numberOfSets;
        private List<Integer> numberOfRepeats;
        private List<Double> weight;

        public ExerciseStatsBuilder(int numberOfSets) {
            this.numberOfSets = numberOfSets;
        }

        public ExerciseStatsBuilder withSimpleRepeat(int repeat) {
            this.numberOfRepeats = Collections.nCopies(numberOfSets, repeat);
            return this;
        }

        public ExerciseStatsBuilder withSimpleWeight(Double weight) {
            this.weight = Collections.nCopies(numberOfSets, weight);
            return this;
        }

        public ExerciseStatsBuilder withRepeat(Integer... repeat) {
            if (repeat.length != numberOfSets) {
                throw new IllegalArgumentException();
            }
            this.numberOfRepeats = Arrays.asList(repeat);
            return this;
        }

        public ExerciseStatsBuilder withWeight(Double... repeat) {
            if (repeat.length != numberOfSets) {
                throw new IllegalArgumentException();
            }
            this.weight = Arrays.asList(repeat);
            return this;
        }

        public ExerciseStats build() {
            return new ExerciseStats(this.numberOfSets, this.numberOfRepeats, this.weight);
        }
    }
}
