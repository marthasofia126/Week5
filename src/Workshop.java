public abstract class Workshop {
    private String title;
    private int capacity;
    private int enrolled;

    public Workshop(String title, int capacity) {
        if (title == null || title.trim().isEmpty() || capacity <= 0) {
            throw new IllegalArgumentException("Invalid Room Title or Number capacity");
        } else {
            String cleaned_title = title.trim();
            this.title = cleaned_title;
            this.capacity = capacity;
            enrolled = 0;
        }
    }

    public String getTitle() {
        return title;
    }

    public int getEnrolled() {
        return enrolled;
    }

    public int getRemainingSeats() {
        int remaining_seats;
        remaining_seats = capacity - enrolled;
        return remaining_seats;
    }

    public boolean reserve(int seats) {
        if (seats <= getRemainingSeats() && seats > 0) {
            enrolled += seats;
            return true;
        } else {
            return false;
        }
    }
    public abstract int getFeePerSeat();
}
