package openbot.gym.core.processor;

import openbot.gym.core.ProcessorQualifier;

public interface IProcessor {

    ProcessorQualifier getQualifier();

    String process(String userId, String command);

}
