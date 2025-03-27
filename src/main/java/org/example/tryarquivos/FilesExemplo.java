package org.example.tryarquivos;

import java.io.File;
import java.io.IOException;

public class FilesExemplo {
    public static void main(String[] args) throws IOException {
        var homedir = new File(System.getProperty("user.home"));

        var f = new File(homedir, "IdeaProjects/meuprimeiroprojetojava/conf");
        var newFile = f.createNewFile();



        if (f.exists() && f.isFile() && f.canRead()) {
            var confdir = new File(homedir, "IdeaProjects/meuprimeiroprojetojava/config");
            confdir.mkdir();
            f.renameTo(new File(confdir, "conf"));
        } else {
            System.out.println("Deu erro");
        }
    }
}
