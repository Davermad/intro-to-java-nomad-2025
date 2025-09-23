public class Problem11 {
    public static void main(String[] args) {
        int currentPopulation = 312032486;
        int secondsInYear = 365 * 24 * 60 * 60;

        int birthsPerYear = secondsInYear / 7;
        int deathsPerYear = secondsInYear / 13;
        int immigrantsPerYear = secondsInYear / 45;

        int yearlyChange = birthsPerYear - deathsPerYear + immigrantsPerYear;

        for (int year = 1; year <= 5; year++) {
            currentPopulation += yearlyChange;
            System.out.println("Year " + year + " population: " + currentPopulation);
        }
    }
}
