package openbot.gym.core.service.exercise;

import java.util.List;

public interface IExerciseService {

    List<Exercise> getByGroup(ExerciseGroup group);

    Exercise getById(String exerciseId);
}
