package openbot.gym.core.service.workout;

public interface IWorkoutService {

    Workout startWorkout(String userId);

    Workout finishWorkout(String userId);
}
