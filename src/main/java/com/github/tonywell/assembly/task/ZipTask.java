package com.github.tonywell.assembly.task;

import org.gradle.api.tasks.TaskAction;

/**
 * Created with IntelliJ IDEA.
 * User: tonywill
 * Email: tongwei1985@gmail.com
 * Date: 2017/5/23
 * Time: 下午4:51
 */
public class ZipTask extends AbstractTask {

    @TaskAction
    public void zip() {
        System.out.println("zip doing");
    }

//    public doZip()
    
}
