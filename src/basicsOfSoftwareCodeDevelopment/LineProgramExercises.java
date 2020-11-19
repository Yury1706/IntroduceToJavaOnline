package basicsOfSoftwareCodeDevelopment;

public class LineProgramExercises {

    double a = 1.0;
    double b = 2.0;
    double c = 3.0;
    double x = 180.0;
    double y = 90.0;
    double z;

    public void getZ() {
        z = ((a - 3) * b / 2) + c;
        System.out.println(z);
    }

    public void algebraicValue() {
        z = ((b + (Math.sqrt(Math.pow(b, 2) + 4 * a * c))) / (2 * a))
                - Math.pow(a, 3) * c + Math.pow(b, -2);
        System.out.println(z);
    }

    public void geometricValue() {
        z = (Math.sin(Math.toRadians(x)) + Math.cos(Math.toRadians(y))) / (Math.cos(Math.toRadians(x))
                - Math.sin(Math.toRadians(y))) * Math.tan(Math.toRadians(x * y));
        System.out.println(z);
    }

    public void changePlaces() {
        double r = 321.159;
        String stringR = String.valueOf(r);
        String substr1 = stringR.substring(0, 3);
        String substr2 = stringR.substring(3, 4);
        String substr3 = stringR.substring(4);
        stringR = substr3 + substr2 + substr1;
        r = Double.parseDouble(stringR);
        System.out.println(r);
    }

    public void getTime(int time) {
        int hour = time / 3600;
        int min = time / 60 % 60;
        int sec = time % 60;
        System.out.printf("%02dч:%02dмин:%02dс", hour, min, sec);
        System.out.println();
    }

    public void pointCoordinate(int x, int y) {
        if ((x >= -4 && x <= 4) && (y >= -3 && y <= 4)) {
            System.out.println("true");
        } else System.out.println("false");
    }

    public static void main(String[] args) {
        LineProgramExercises lPEx1 = new LineProgramExercises();
        lPEx1.getZ();
        LineProgramExercises lPEx2 = new LineProgramExercises();
        lPEx2.algebraicValue();
        LineProgramExercises lPEx3 = new LineProgramExercises();
        lPEx3.geometricValue();
        LineProgramExercises lPEx4 = new LineProgramExercises();
        lPEx4.changePlaces();
        LineProgramExercises lPEx5 = new LineProgramExercises();
        lPEx5.getTime(3759);
        LineProgramExercises lPEx6 = new LineProgramExercises();
        lPEx6.pointCoordinate(-4, 5);
    }

}
