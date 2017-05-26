package com.github.tonywell.assembly.task;

import com.github.tonywell.assembly.extensions.FileSet;
import org.gradle.api.NamedDomainObjectContainer;
import org.gradle.api.logging.Logger;
import org.gradle.api.logging.Logging;
import org.gradle.api.tasks.TaskAction;

/**
 * Created with IntelliJ IDEA.
 * User: tonywill
 * Email: tongwei1985@gmail.com
 * Date: 2017/5/23
 * Time: 下午4:51
 */
public class ZipTask extends AbstractTask {

    private static final Logger logger = Logging.getLogger(ZipTask.class);

    public ZipTask() {
        dependsOn("build");
    }
    @TaskAction
    public void zip() {
        logger.info("zip ing....");
        NamedDomainObjectContainer<FileSet> fileSets = (NamedDomainObjectContainer<FileSet>)getProject().getExtensions().getByName("fileSets");
        fileSets.forEach(
                fileSet -> System.out.println(((FileSet)fileSet).getDirectory() + " : " + ((FileSet)fileSet).getOutputDirectory())
        );
        //        Arrays.asList(getProject().getExtensions().getByName("fileSets")).forEach(
//                fileSet -> System.out.println(((FileSet)fileSet).getDirectory() + " : " + ((FileSet)fileSet).getOutputDirectory())
//        );
    }

//    public doZip()
    
}
