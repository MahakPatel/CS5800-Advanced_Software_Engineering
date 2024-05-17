package Final;

import java.time.LocalTime;

public enum Shift {
    FIRST_SHIFT("8 AM to 4 PM"),
    SECOND_SHIFT("4 PM to 12 AM"),
    THIRD_SHIFT("12 AM to 8 AM");

    private final String availability;

    Shift(String availability) {
        this.availability = availability;
    }

    public String getAvailability() {
        return availability;
    }

    public boolean isWithinShift(LocalTime time) {
        switch (this) {
            case FIRST_SHIFT:
                return !time.isBefore(LocalTime.of(8, 0)) && !time.isAfter(LocalTime.of(16, 0));
            case SECOND_SHIFT:
                return !time.isBefore(LocalTime.of(16, 0)) && time.isBefore(LocalTime.of(23, 59)) || time.equals(LocalTime.of(0, 0));
            case THIRD_SHIFT:
                return time.isAfter(LocalTime.of(0, 0)) && !time.isAfter(LocalTime.of(8, 0));
            default:
                return false;
        }
    }
}

