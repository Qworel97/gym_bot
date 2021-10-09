package openbot.gym.core.service.user;

import openbot.gym.core.ProcessorQualifier;

import java.util.Map;

public class UserInfo {

    private String userId;

    private ProcessorQualifier processorQualifier;
    private Map<String, Object> stateData;

    public UserInfo() {
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public ProcessorQualifier getProcessorQualifier() {
        return processorQualifier;
    }

    public void setProcessorQualifier(ProcessorQualifier processorQualifier) {
        this.processorQualifier = processorQualifier;
    }

    public Map<String, Object> getStateData() {
        return stateData;
    }

    public void setStateData(Map<String, Object> stateData) {
        this.stateData = stateData;
    }
}
