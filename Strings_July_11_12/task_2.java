package Strings_July_11_12;

public class task_2 {
    public static void main(String[] args) {

//First create one string and copy and paste paragragh below.
//And make modifications on the given paragraph listed below.
//Make sure to create multiple string with each sentence from given paragraph
//Make sure each sentence start with an upper case letter.
//Make sure the city name starts with the capital letter.
//Make sure the rest of the letters are lowercase.
//Make sure to change the name, age and city information based on your information
//make sure to get rid of the empty spaces in front and end of the sentences.

//after you make the modification check each sentence’s length
//Print each sentence and make sure they are correctly modified.
//Print 1st, 4th and 5th indexed characters for each sentence
//At the end combine all the sentence to get proper paragraph with modified sentences


//hello my name is <yourname>.       i am <yourage> years old.  i live in <yourcity>.
// I have been in IT industry for about 6 years. I STarted as MAnual TESter
// and NOW I am doiNG AuTomaTion Testing. I have experience in EducatION,
// energy,finance and some manY Other AREAs. i HAve scrum master and Oracle
// java Programmer certificates.   i love JaVA.   I designed and DEVELoped
// many automation test cases using BDD FRamework

        String str1 = "hi! My name is- What? My name is-Who? My name is Chika-chika <yourname>.";
        String str2 = "i am <yourage> years old.";
        String str3 = " i live in <yourcity>.";
        String str4 = "I have been in Music industry for a long time.";
        String str5 = " Before I was famous I  worked odd jobs and NOW i am a famous rapper.";
        String str6 = " While i may sound like a complete jerk in my music, i am actually not that bad of a guy.";
        String str7 = " i don't have scrum master and Oracle java Programmer certificates.";
        String str8 = "i love my daughter. ";
        String str9 = " I won over 100 awards in the music industry and have been nominated over 300 times.";


        System.out.println(str1.replace("h", "H").replace("<yourname>", "Slim Shady").trim());
        System.out.println(str2.replace("i", "I").replace("<yourage>", "49").trim());
        System.out.print(str3.toLowerCase().replaceFirst("i", "I").replace("<yourcity>", " Detroit, Michigan ").trim());
        System.out.print(str5.toLowerCase().replaceFirst("i", "I").replace("NOW i am", "now I am").trim());
        System.out.println(str6.toLowerCase().replaceFirst("i", "I").trim());
        System.out.print(str7.toLowerCase().replace("i", "I").trim());
        System.out.print(str8.toLowerCase().replace("i", "I").trim());
        System.out.println(str9.toLowerCase().replaceFirst("i", "I").trim().replace("300", "three hundred"));



        System.out.println(str1.length());
        System.out.println(str2.length());
        System.out.println(str3.length());
        System.out.println(str4.length());
        System.out.println(str5.length());
        System.out.println(str6.length());
        System.out.println(str7.length());
        System.out.println(str8.length());
        System.out.println(str9.length());

       String result = str1+ str2 + str3 + str4 + str5 + str6 + str7 + str8 + str9;
//        System.out.println(str1.charAt(1) + " " + str1.charAt(4) + " " + str1.charAt(5));
//        System.out.println(str2.charAt(1) + " " + str2.charAt(4) + " " + str2.charAt(5));
//        System.out.println(str3.charAt(1) + " " + str3.charAt(4) + " " + str3.charAt(5));
//        System.out.println(str4.charAt(1) + " " + str4.charAt(4) + " " + str4.charAt(5));
//       System.out.println(str5.charAt(1) + " " + str5.charAt(4) + " " + str5.charAt(5));
//        System.out.println(str6.charAt(1) + " " + str6.charAt(4) + " " + str6.charAt(5));
//        System.out.println(str7.charAt(1) + " " + str7.charAt(4) + " " + str7.charAt(5));
//     System.out.println(str8.charAt(1) + " " + str8.charAt(4) + " " + str8.charAt(5));
//      System.out.println(str9.charAt(1) + " " + str9.charAt(4) + " " + str9.charAt(5));

    //    String result = str1+ str2 + str3 + str4 + str5 + str6 + str7 + str8 + str9;


    }
}


