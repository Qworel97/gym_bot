package openbot.gym.core.service.user;

public interface IUserService {

    UserInfo register(String userId);

    void updateState(UserInfo userInfo);

    UserInfo getState(String userId);
}
