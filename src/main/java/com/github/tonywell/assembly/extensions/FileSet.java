package com.github.tonywell.assembly.extensions;

/**
 * Created with IntelliJ IDEA.
 * User: tonywill
 * Email: tongwei1985@gmail.com
 * Date: 2017/5/25
 * Time: 下午4:57
 */
public class FileSet {

    public String mName;

    public String directory;

    public String outputDirectory;

    public FileSet(String name) {
        this.mName = name;
    }

    public String getDirectory() {
        return directory;
    }

    public void setDirectory(String directory) {
        this.directory = directory;
    }

    public String getOutputDirectory() {
        return outputDirectory;
    }

    public void setOutputDirectory(String outputDirectory) {
        this.outputDirectory = outputDirectory;
    }

    public String getName() {
        return mName;
    }

    
}
