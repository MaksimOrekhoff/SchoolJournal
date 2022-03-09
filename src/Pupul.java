public class Pupul {
    String name;
    int [] marks;

    Pupul(String name, int marMath, int markLng, int markPhis) {
        this.name = name;

        this.marks = new int[] {marMath, markLng, markPhis};
    }

    public double avgMark() {
        return (marks[0] + marks[1] + marks[2]) / 3.0;
    }

    public boolean hasOnlyExcellentMarks() {
        for (int mark: marks
             ) {
            if (mark < 5) {
                return false;
            }
        }
        return true;
    }
}
