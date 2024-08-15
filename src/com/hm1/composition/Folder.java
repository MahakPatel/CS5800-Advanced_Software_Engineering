package com.hm1.composition;

import java.util.ArrayList;
import java.util.List;

class Folder {
    private String name;
    private List<Folder> subFolders;
    private List<File> files;

    public Folder(String name) {
        this.name = name;
        this.subFolders = new ArrayList<>();
        this.files = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Folder> getSubFolders() {
        return subFolders;
    }

    public void setSubFolders(List<Folder> subFolders) {
        this.subFolders = subFolders;
    }

    public List<File> getFiles() {
        return files;
    }

    public void setFiles(List<File> files) {
        this.files = files;
    }

    public void addSubFolder(Folder folder) {
        subFolders.add(folder);
    }

    public void addFile(File file) {
        files.add(file);
    }

    public void print() {
        printFolderContents(this, 0);
    }

    private void printFolderContents(Folder folder, int level) {
        for (int i = 0; i < level; i++) {
            System.out.print("  ");
        }
        System.out.println("Folder: " + folder.getName());

        for (File file : folder.getFiles()) {
            for (int i = 0; i < level + 1; i++) {
                System.out.print("  ");
            }
            file.print();
        }

        for (Folder subFolder : folder.getSubFolders()) {
            printFolderContents(subFolder, level + 1);
        }
    }
}