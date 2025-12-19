package Grade.Calculato;

public class Student {
    public String name;
    public double[] grades;

    public Student(String name, double[] grades) {
        this.name = name;
        this.grades = grades;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double calcAvrage() {
        double sum = 0;
        for (double i : grades) {
            sum += i;

        }
        return sum / grades.length;
    }

    public double minGrade() {
        double min = grades[0];
        for (double i : grades) {
            if (i < min) {
                min = i;
            }
        }
        return min;
    }

    public double maxGrade() {
        double max = grades[0];
        for (double i : grades) {
            if (i > max) {
                max = i;
            }
        }
        return max;
    }

    public boolean qualification(){
        boolean qualification;
        if (calcAvrage() < 10) {
            qualification = true;
        } else {
            qualification = false;
        }
        return qualification;
    }
}