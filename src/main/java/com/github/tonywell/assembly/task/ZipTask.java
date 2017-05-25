package com.github.tonywell.assembly.task;

import com.github.tonywell.assembly.extensions.FileSet;
import org.gradle.api.NamedDomainObjectContainer;
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
