package day01;

import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Running {
    private List<RunLogEntry> log = new ArrayList<>();

    public Running(Path path) {
        try (Scanner scanner = new Scanner(path)) {
            String line = scanner.nextLine();
            while (scanner.hasNext()) {
                line = scanner.nextLine();
                log.add(new RunLogEntry(line));
            }
        } catch (IOException e) {
            throw new IllegalStateException("Can not read file!", e);
        }
    }

    public double getTotalDistance(int year, int month) {
        double total = 0;
        for (RunLogEntry rle: log) {
            if (rle.getDate().getYear() == year && rle.getDate().getMonthValue() == month) {
                total += rle.getDistance();
            }
        }
        return total;
    }

    public List<RunLogEntry> getLog() {
        return log;
    }
}
