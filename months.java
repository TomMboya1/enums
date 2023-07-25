import java.time.Month;

public enum months {
    January, February, March, April, May, June, July, August, September, October, November, December;

    public static void main(String[] args) {

        for (Month month : Month.values()) {
            String name = month.name();
            if (name.endsWith("y") || name.endsWith("Y")) {
                System.out.println(name + " ends with y");
            } else {
                System.out.println(name + " doesn't end with y");
            }
        }

    }
}
