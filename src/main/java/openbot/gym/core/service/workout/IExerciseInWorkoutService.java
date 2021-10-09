package openbot.gym.core.service.workout;

public interface IExerciseInWorkoutService {

    ExerciseInWorkout start(String userId, String workoutId, String exerciseId);

    ExerciseInWorkout finish(String userId, String workoutId, String exerciseId, ExerciseStats stats);
}
