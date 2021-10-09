package openbot.gym.core.service.workout;

public class ExerciseInWorkout {

    private String userId;
    private String workoutId;
    private String exerciseId;
    private ExerciseStats exerciseStats;

    public ExerciseInWorkout() {
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getWorkoutId() {
        return workoutId;
    }

    public void setWorkoutId(String workoutId) {
        this.workoutId = workoutId;
    }

    public String getExerciseId() {
        return exerciseId;
    }

    public void setExerciseId(String exerciseId) {
        this.exerciseId = exerciseId;
    }

    public ExerciseStats getExerciseStats() {
        return exerciseStats;
    }

    public void setExerciseStats(ExerciseStats exerciseStats) {
        this.exerciseStats = exerciseStats;
    }
}
