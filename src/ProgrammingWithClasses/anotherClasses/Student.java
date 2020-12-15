package ProgrammingWithClasses.anotherClasses;

import java.util.Arrays;

public class Student {

    String name;
    int numberOfGroup;
    int[] progress;

    public int[] getProgress() {
        return progress;
    }

    public Student(String name, int numberOfGroup, int[] progress) {
        this.name = name;
        this.numberOfGroup = numberOfGroup;
        this.progress = progress;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", numberOfGroup = " + numberOfGroup +
                ", progress = " + Arrays.toString(progress) +
                '}';
    }

    public static void findStudentsWithHighRating(Student[] students) {
        for (int i = 0; i < students.length; i++) {
            int[] progress = students[i].getProgress();
            boolean highRating = true;
            for (int j = 0; j < progress.length; j++) {
                if (progress[j] < 9) {
                    highRating = false;
                }
            }
            if (highRating) {
                System.out.println(students[i]);
            }
        }
    }
}
