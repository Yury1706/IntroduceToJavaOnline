package ProgrammingWithClasses;

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

    public static void main(String[] args) {
        Student[] students = new Student[10];
        students[0] = new Student("Ivanov A.A.", 17, new int[]{5, 6, 7, 8, 4});
        students[1] = new Student("Sidorov L.V.", 11, new int[]{9, 10, 9, 9, 10});
        students[2] = new Student("Sobolev E.D.", 1, new int[]{5, 6, 10, 8, 9});
        students[3] = new Student("Smith I.O.", 21, new int[]{8, 6, 9, 8, 4});
        students[4] = new Student("Petrov A.A.", 20, new int[]{9, 9, 9, 9, 9});
        students[5] = new Student("James D.I.", 17, new int[]{5, 6, 7, 8, 3});
        students[6] = new Student("Pointov I.I.", 20, new int[]{5, 5, 9, 7, 4});
        students[7] = new Student("Leonov V.V.", 1, new int[]{10, 10, 10, 10, 10});
        students[8] = new Student("Vasin T.T.", 21, new int[]{5, 8, 7, 8, 9});
        students[9] = new Student("Borgov O.V.", 11, new int[]{9, 9, 9, 10, 10});

        findStudentsWithHighRating(students);
    }
}
