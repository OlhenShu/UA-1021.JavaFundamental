package Viktoriia.practicalTasks.pt4;

import java.util.Scanner;

enum Continent {
    EURASIA, SOUTH_AMERICA, NORTH_AMERICA, AFRICA, OCEANIA, ANTARCTICA
}
public class Country {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String country;
        Continent continent = null;
        System.out.println("Input name of the country:");
        country = scanner.nextLine();
        boolean countryExist = true;
        switch ((country.toLowerCase())) { //lists of countries are not completed to finish task quicker
            case "antarctica":
                continent = Continent.ANTARCTICA;
                break;
            case "australia", "papua new guinea", "new zealand", "fiji":
                continent = Continent.OCEANIA;
                break;
            case "uganda", "tanzania", "south africa", "kenya", "ethiopia":
                continent = Continent.AFRICA;
                break;
            case "usa", "canada", "mexico", "guatemala", "cuba", "haiti":
                continent = Continent.NORTH_AMERICA;
                break;
            case "brazil", "colombia", "argentina", "chile", "peru":
                continent = Continent.SOUTH_AMERICA;
                break;
            case "ukraine", "france", "japan", "india", "georgia":
                continent = Continent.EURASIA;
                break;
            default:
                System.out.println("There are not such country");
                countryExist = false;
        }
        if (countryExist) {
            System.out.println(country + " is a country of " + continent);
        }
    }
}
