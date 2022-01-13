package day04;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class Mapper {
    private List<SubjectMap> subjectMaps = new ArrayList<>();


    public Mapper(String filename) {
        readFromFile(Path.of(filename));
    }

    private void readFromFile(Path path) {
        try (BufferedReader reader = Files.newBufferedReader(path)) {
            String line = null;
            List<String> lines = new ArrayList<>();
            while (null != (line = reader.readLine())) {
                lines.add(line);
                if (lines.size() == 4) {
                    subjectMaps.add(composeSubjectMap(lines));
                    lines.clear();
                }
            }
        } catch (IOException exception) {
            throw new IllegalStateException("Can not read file!");
        }
    }

    public int getWeeklyLessonsCount(String teacher) {
        int result = 0;
        for (SubjectMap actual: subjectMaps) {
            if (actual.getTeacher().equals(teacher)) {
                result += actual.getLessonsPerWeek();
            }
        }
        return result;
    }

    private SubjectMap composeSubjectMap(List<String> lines) {
        return new SubjectMap(
                lines.get(0),
                lines.get(1),
                lines.get(2),
                Integer.parseInt(lines.get(3)));
    }

    public List<SubjectMap> getSubjectMaps() {
        return subjectMaps;
    }
}
