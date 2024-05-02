public enum DaysOfWeek {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;

    public static String getDayAsString(DaysOfWeek day) {
        if (day.equals(SATURDAY) || day.equals(SUNDAY)) {
            return "Weekend";
        }
        return day.toString();
    }

    @Override
    public String toString() {
        return this.name().toLowerCase();
    }
}
