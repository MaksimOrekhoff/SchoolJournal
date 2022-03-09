import java.util.ArrayList;

public class Journal {
    ArrayList<Pupul> pupils;

    Journal() {
        pupils = new ArrayList<>();
    }

    public void addPupil(Pupul pupul) {
        pupils.add(pupul);
    }

    public int getPupilsTotalCount() {
        return pupils.size();
    }

    public int getPupilsWithExcellentMarksCount() {
        int pupilWithExcellentMarks = 0;

        for (Pupul pupul : pupils
        ) {
            if (pupul.hasOnlyExcellentMarks()) {
                pupilWithExcellentMarks += 1;
            }
        }
        return pupilWithExcellentMarks;
    }

    public float getPupilsWithExcellentMarksPercent() {
        return (float) getPupilsWithExcellentMarksCount() / getPupilsTotalCount();
    }

    public void printAvgMarks() {
        System.out.println("Avg grade");
        for (Pupul pupul : pupils
        ) {
            System.out.println(pupul.name + " " + pupul.avgMark());
        }
    }

    public void printPupilsWithExcellentMarksPercent() {
        System.out.println("percentage of excellent students " +  getPupilsWithExcellentMarksPercent());

    }
}
