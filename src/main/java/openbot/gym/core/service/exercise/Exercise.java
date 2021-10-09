package openbot.gym.core.service.exercise;

public class Exercise {

    private String userId;
    private String exerciseId;
    private ExerciseGroup group;
    private String name;

    public Exercise() {
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getExerciseId() {
        return exerciseId;
    }

    public void setExerciseId(String exerciseId) {
        this.exerciseId = exerciseId;
    }

    public ExerciseGroup getGroup() {
        return group;
    }

    public void setGroup(ExerciseGroup group) {
        this.group = group;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
