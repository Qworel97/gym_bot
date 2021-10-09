package openbot.gym.core.service.workout;

import java.time.Instant;

public class Workout {

    private String userId;
    private String workoutId;
    private Instant workoutStart;
    private Instant workoutEnd;

    public Workout() {
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

    public Instant getWorkoutStart() {
        return workoutStart;
    }

    public void setWorkoutStart(Instant workoutStart) {
        this.workoutStart = workoutStart;
    }

    public Instant getWorkoutEnd() {
        return workoutEnd;
    }

    public void setWorkoutEnd(Instant workoutEnd) {
        this.workoutEnd = workoutEnd;
    }
}
