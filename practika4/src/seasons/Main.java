package seasons;

public class Main {
    public enum Season {
        SUMMER(25) {
            @Override
            public String getDescript() {
                return "warm season";
            }
        },
        AUTUMN(10),
        WINTER(-5),
        SPRING(15);

        private final int averageTemperature;

        Season(int averageTemperature) {
            this.averageTemperature = averageTemperature;
        }

        public int getAverageTemperature(){
            return averageTemperature;
        }

        public String getDescript(){
            return "cold season";
        }
    }

    public static void favMessage(Season season){
        switch (season){
            case SUMMER:
                System.out.println("I love summer");
                break;
            case AUTUMN:
                System.out.println("I don't love autumn");
                break;
            case WINTER:
                System.out.println("I love winter");
                break;
            case SPRING:
                System.out.println("I don't love winter");
                break;
        }
    }

    public static void main(String[] args) {
    Season favSeas = Season.WINTER;
    System.out.println("MY FAVOURITE SEASON IS " + favSeas + "\n");

    for (Season season : Season.values()){
        System.out.println(season + " - average temperature: " + season.getAverageTemperature() + ", description: " + season.getDescript());
    }

    }
}