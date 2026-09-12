import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    private static int w = 100;
    private static int padding = 5;
    private static int ind = 5;
    private static String sCap = String.format("|%" + (padding - 1) + "s", "");
    private static String eCap = String.format("%" + (padding - 1) + "s|%n", "");
    public static void main(String[] args) {
        String bar = "";
        for (int i = 0; i < w + (2 * padding); i ++) bar += "-";;

        String name = "Sai Anirvinya Kolli";
        String prospectiveCareer = "Data Science";
        String[] hobbies = {"Eating", "Drinking", "Sleeping"};
        String[] techCategories = {
                "Java",
                "Python",
                "C++",
                "Web-dev",
                "Arduino",
                "Game-dev",
                "3D Modeling",
        };
        int[] techCatVals = {4, 4, 2, 3, 2, 5, 4};

        String aboutMe = "My name is Sai Anirvinya Kolli, and I am a student at the Morris County School of Technology in the Academy for Computer and Information Sciences. I am interested in computer science and technology, particularly programming, game design, and 3D modeling. I enjoy learning about how technology can be used to solve problems and create new experiences.";
        String quote = "\"We should add carpet to the wheels\"";
        String author = "Gurusaran Sathish";

        System.out.println(bar);

        nLine();
        System.out.printf(sCap + "%-" + w + "s"+ eCap, name);
        nLine();
        System.out.printf(sCap + "%-" + w + "s" + eCap, "About Me:");
        for (String l : pForm(aboutMe, (w-ind) )) {
            System.out.printf(sCap + "%" + ind + "s%-"+ (w - ind) +"s" +eCap, "", l);
        }
        nLine();
        System.out.printf(sCap + "%-"+ (w - prospectiveCareer.length()) +"s%-"+prospectiveCareer.length()+"s" + eCap, "Prospective Career:", prospectiveCareer);
        nLine();
        System.out.printf(sCap + "%-" + w + "s" + eCap, "Hobbies:");
        for (String h: hobbies){
            System.out.printf(sCap + "%" + ind + "s%-"+ (w - ind) +"s" +eCap, "", h);
        }
        nLine();
        for (int i = 0; i < techCategories.length; i++){
            String skillBar = "";
            for (int j = 0; j < techCatVals[i]*2; j ++) skillBar += "=";
            System.out.printf(sCap + "%-"+ (w - 12) +"s[%-10s]" + eCap, techCategories[i], skillBar);
        }
        nLine();
        for (String l : pForm(quote, (w-ind) )) {
            System.out.printf(sCap + "%" + ind + "s%-"+ (w - ind) +"s" +eCap, "", l);
        }
        System.out.printf(sCap + "%" + (ind + 3) + "s%-"+ (w - (ind+3) ) +"s" +eCap, "", "--" + author);

        nLine();
        System.out.println(bar);

    }

    private static void nLine(){
        System.out.printf(sCap + "%" + w +"s" + eCap, " ");
    }

    private static ArrayList<String> pForm(String text, int len){
        String[] words = text.split(" ");
        ArrayList<String> sentences = new ArrayList<>();
        sentences.add("");
        int cc = 0;
        for (String w : words) {
            if (cc + w.length() + 1 > len){
                sentences.add("");
                cc = 0;
            }
            cc += w.length() + 1;
            String newSent = sentences.getLast() + w + " ";
            sentences.set(sentences.size() - 1, newSent);

        }
        return sentences;
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