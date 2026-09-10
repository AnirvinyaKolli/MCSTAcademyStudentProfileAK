public class Main {
    public static void main(String[] args) {
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

        String[] grid = generateBorder(20, 20);
        for (String l : grid){
            System.out.println(l);
        }
    }

    private static String[] generateBorder(int l, int h){
        String[] grid = new String[h+2];
        String bar = "";
        for (int i = 0; i < l; i ++) bar += "_";
        grid[0] = bar;
        grid[grid.length-1] = bar;
        return grid;
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