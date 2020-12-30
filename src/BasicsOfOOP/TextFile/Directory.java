package BasicsOfOOP.TextFile;

import java.util.ArrayList;
import java.util.List;

public class Directory {
    private String name;
    private List<File> fileList = new ArrayList<>();

    public Directory(String name) {
        this.name = name;
    }

    public void createNewFile(File file) {
        fileList.add(file);
    }

    public void renameFile(String name, String newName) {
        for (File file : fileList) {
            if (file.getName().equals(name)) {
                file.setName(newName);
            }
        }
    }

    public void printDataOfFile(String name) {
        for (File file : fileList) {
            if (file.getName().equals(name)) {
                System.out.println(file.getData());
            }
        }
    }

    public void addData(String name, String data) {
        for (File file : fileList) {
            if (file.getName().equals(name)) {
                file.setData(file.getData() + data);
            }
        }
    }

    public void deleteFile(String name) {
        for (File file : fileList) {
            if (file.getName().equals(name)) {
                fileList.remove(file);
            }
        }
    }

    public void showAllFilesInDirectory() {
        fileList.forEach(System.out::println);
    }
}
