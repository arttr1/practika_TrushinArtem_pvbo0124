public class ThrowsDemo1 {

    // Задание 5
    public void getDetails(String key) {
        if (key == null) {
            throw new NullPointerException("null key in getDetails");
        }
        System.out.println("Processing data for: " + key);
    }

    // Задание 6
    public void printMessage(String key) {
        try {
            String message = getDetailsWithReturn(key);
            System.out.println(message);
        } catch (NullPointerException e) {
            System.err.println("Handled in printMessage: " + e.getMessage());
        }
    }

    public String getDetailsWithReturn(String key) {
        if (key == null) {
            throw new NullPointerException("null key in getDetails");
        }
        return "data for " + key;
    }
}