package com.github.tonywell.assembly;

import com.github.tonywell.assembly.task.ZipTask;
import org.gradle.api.Plugin;
import org.gradle.api.Project;
import org.gradle.api.tasks.TaskContainer;

/**
 * Created with IntelliJ IDEA.
 * User: tonywill
 * Email: tongwei1985@gmail.com
 * Date: 2017/5/23
 * Time: 下午9:46
 */
public class AssemblyPlugin implements Plugin<Project>{

    @Override
    public void apply(Project project) {
        TaskContainer taskContainer = project.getTasks();
        taskContainer.create("doZip", ZipTask.class);
    }
}
