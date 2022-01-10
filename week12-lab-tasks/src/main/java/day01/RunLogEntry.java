package day01;

import java.time.LocalDate;

public class RunLogEntry {
    private double distance;
    private LocalDate date;

    public RunLogEntry(double distance, LocalDate date) {
        this.distance = distance;
        this.date = date;
    }

    public RunLogEntry(String line) {
        String[] parts = line.split("km;");
        this.distance = Double.parseDouble(parts[0].trim());
        this.date = LocalDate.parse(parts[1]);
    }

    public double getDistance() {
        return distance;
    }

    public LocalDate getDate() {
        return date;
    }
}
