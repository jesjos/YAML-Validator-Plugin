package at.zierler.gradle;

import at.zierler.gradle.internal.YamlValidatorTaskImpl;
import org.gradle.api.Plugin;
import org.gradle.api.Project;

public class YamlValidatorPlugin implements Plugin<Project> {

    static final String TASK_NAME = "validateYaml";

    @Override
    public void apply(Project project) {

        project.getExtensions().create("yamlValidator", YamlValidatorExtension.class);
        project.getTasks().create(TASK_NAME, YamlValidatorTaskImpl.class);
    }

}