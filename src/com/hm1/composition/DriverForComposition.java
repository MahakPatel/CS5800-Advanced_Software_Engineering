package com.hm1.composition;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DriverForComposition {
    public static void run() {

        // Creating the directory structure
        Folder phpDemo1 = new Folder("php_demo1");
        Folder sourceFiles = new Folder("Source Files");
        Folder phalcon = new Folder(".phalcon");
        Folder app = new Folder("app");
        Folder cache = new Folder("cache");
        Folder publicFolder = new Folder("public");

        Folder config = new Folder("config");
        Folder controllers = new Folder("controllers");
        Folder models = new Folder("models");
        Folder library = new Folder("library");
        Folder migrations = new Folder("migrations");
        Folder views = new Folder("views");


        File htaccess = new File(".htaccess");
        File htrouterPhp = new File(".htrouter.php");
        File indexHtml = new File("index.html");

        app.addSubFolder(config);
        app.addSubFolder(controllers);
        app.addSubFolder(migrations);
        app.addSubFolder(models);
        app.addSubFolder(library);
        app.addSubFolder(views);

        publicFolder.addFile(htaccess);
        publicFolder.addFile(htrouterPhp);
        publicFolder.addFile(indexHtml);

        sourceFiles.addSubFolder(phalcon);
        sourceFiles.addSubFolder(app);
        sourceFiles.addSubFolder(cache);
        sourceFiles.addSubFolder(publicFolder);

        phpDemo1.addSubFolder(sourceFiles);

        // Printing the initial directory structure
        System.out.println("Initial Directory Structure:");
        phpDemo1.print();
        System.out.println();

        // Deleting the folder "app"
        System.out.println("Deleting the folder 'app':");
        sourceFiles.getSubFolders().remove(app);
        System.out.println();

        // Printing the directory structure after deleting "app"
        System.out.println("Directory Structure after deleting 'app':");
        phpDemo1.print();
        System.out.println();

        // Deleting the folder "public"
        System.out.println("Deleting the folder 'public':");
        sourceFiles.getSubFolders().remove(publicFolder);
        System.out.println();

        // Printing the directory structure after deleting "public"
        System.out.println("Directory Structure after deleting 'public':");
        phpDemo1.print();
    }
}
