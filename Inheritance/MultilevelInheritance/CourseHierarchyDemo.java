// Base Class: Course
class Course {
    String courseName;
    int duration; // in weeks

    Course(String courseName, int duration) {
        this.courseName = courseName;
        this.duration = duration;
    }

    void displayDetails() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration + " weeks");
    }
}

// Subclass: OnlineCourse
class OnlineCourse extends Course {
    String platform;
    boolean isRecorded;

    OnlineCourse(String courseName, int duration, String platform, boolean isRecorded) {
        super(courseName, duration);
        this.platform = platform;
        this.isRecorded = isRecorded;
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Platform: " + platform);
        System.out.println("Recorded: " + (isRecorded ? "Yes" : "No"));
    }
}

// Subclass: PaidOnlineCourse
class PaidOnlineCourse extends OnlineCourse {
    double fee;
    double discount; // percentage

    PaidOnlineCourse(String courseName, int duration, String platform, boolean isRecorded,
                     double fee, double discount) {
        super(courseName, duration, platform, isRecorded);
        this.fee = fee;
        this.discount = discount;
    }

    double calculateFinalFee() {
        return fee - (fee * discount / 100);
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Fee: ₹" + fee);
        System.out.println("Discount: " + discount + "%");
        System.out.println("Final Fee: ₹" + calculateFinalFee());
    }
}

// Driver Class
public class CourseHierarchyDemo {
    public static void main(String[] args) {
        // Objects for each level
        Course basicCourse = new Course("Mathematics", 8);
        OnlineCourse onlineCourse = new OnlineCourse("Data Science", 12, "Coursera", true);
        PaidOnlineCourse paidCourse = new PaidOnlineCourse("Java Programming", 10, "Udemy", true, 5000, 20);

        // Display details
        System.out.println("=== Basic Course ===");
        basicCourse.displayDetails();

        System.out.println("\n=== Online Course ===");
        onlineCourse.displayDetails();

        System.out.println("\n=== Paid Online Course ===");
        paidCourse.displayDetails();
    }
}
