import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        int w = 50;
        String bar = generateBar(w);
        String name = "Sai Anirvinya Kolli";
        String prospectiveCareer = "Data Science";
        String[] hobbies = {"", "", ""};
        String[] techCategories = {
                "Java",
                "Python",
                "C++",
                "Web-dev",
                "Arduino",
                "Game-dev",
                "3D Modeling"
        };
        int[] techCatVals = {4, 4, 2, 3, 2, 5, 4};

        String aboutMe = "";
        String quote = "";

        System.out.println(bar);

        System.out.printf("|%-48s|%n", name);
        System.out.printf("|%48s|%n", " ");
        System.out.printf("|%15s %31s|%n", "Possible Career:", prospectiveCareer);
        System.out.printf("|%48s|%n", " ");

        for (int i = 0; i < techCategories.length-1; i++){
            String sBar = "";
            for (int j = 0; j < techCatVals[i]; j ++) sBar += "=";
            System.out.printf("|%-40s [%-5s]|%n", techCategories[i], sBar);
        }

        System.out.println(bar);


    }

    private static String generateBar(int w){
        String bar = "";
        for (int i = 0; i < w; i ++) bar += "_";
        return bar;
    }
}

/*
Requirements
    Name
    Prospective Career
    3 Hobbies/ECs
    ___________________
    Show skill level in tech categories
        Labels must be right-aligned to a uniform column
        Skill bar: Each category must have a visual bar to indicate proficiency.
        Java
        Python
        C++
        Web-Dev
        Arduino
        2 Custom (Game dev, 3D Modeling Software)
    Extras:
        About me bio
        ASCII art border
        Words to live by
*/