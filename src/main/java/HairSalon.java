import java.util.Arrays;
import java.util.Optional;

public class HairSalon {

    private String[] openingDays = { "Monday", "Tuesday" };

    // This method should return the openingDays array.
    public String[] getOpeningDays() {
        return openingDays;
    }

    // This method should return true if the weekday passed in is present in the
    // openingDays array.
    // If not it should return false. If the String passed in does not end in the
    // letters "day",
    // it should throw an IllegalArgumentException with a message explaining that
    // only weekdays are valid.
    public boolean isOpen(String weekDay) throws Exception {
        if (!weekDay.endsWith("day")) {
            throw new Exception();
        }

        Optional<String> val = Arrays.stream(openingDays).filter((v) -> {
            return v.equalsIgnoreCase(weekDay);
        })
                .findFirst();
        // System.out.println(val.get());
        return val.isPresent();

        // return false;
    }

}
