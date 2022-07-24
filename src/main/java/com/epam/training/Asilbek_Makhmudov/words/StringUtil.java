package com.epam.training.Asilbek_Makhmudov.words;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringUtil {
    public static int countEqualIgnoreCaseAndSpaces(String[] words, String sample) {
        if (words == null || sample == null) return 0;
        int i = 0;
        for (String word : words) {
            if ((word.strip()).equalsIgnoreCase(sample.strip())) i++;
        }
        return i;
    }

    public static String[] splitWords(String text) {
        if (text == null || text.length() == 0) {
            return null;
        }
        Pattern p1 = Pattern.compile("[ ,.;:?!]+");
        String[] s = p1.split(text);
        int empty = 0;
        if (s == null || s.length == 0) return null;
        for (String value : s) {
            if (value == null || value.length() == 0) empty++;
            if (empty == s.length) return null;
        }
        if (s[0] == null || s[0].length() == 0){
            return Arrays.copyOfRange(s, 1 ,s.length);
        }
        return s;
    }

    public static String convertPath(String path, boolean toWin) {
        if (path == null || path.length() == 0) return null;
        Pattern p1 = Pattern.compile("~");
        Matcher u = p1.matcher(path);
        Pattern p2 = Pattern.compile("/");
        Matcher ui = p2.matcher(path);
        Pattern p3 = Pattern.compile("C:");
        Matcher w = p3.matcher(path);
        Pattern p4 = Pattern.compile("\\\\");
        Matcher wi = p4.matcher(path);
        int c1 = 0; // ~ counter
        int c2 = 0; // / counter
        int c3 = 0; // C: counter
        int c4 = 0; // \ counter
        while (u.find()) {
            c1++;
        }
        while (ui.find()) {
            c2++;
        }
        while (w.find()) {
            c3++;
        }
        while (wi.find()) {
            c4++;
        }
        if (c1 > 1) return null; //double ~
        if (c1 > 0 && c4 > 0) return null; // ~ with \
        if (c3 > 1) return null; // double C:
        if (c3 > 0 && c2 > 0) return null; // C: with /
        if (c2 > 0 && c4 > 0) return null; // \ with /
        if (c1 > 0){
            if (!path.startsWith("~")) return null;
        }
        if (c3 > 0){
            if (!path.startsWith("C")) return null;
        }
        if (toWin){
            if (path.equals("/")) return "C:\\";
            String newPath = path.replace("/" , "\\");
            String newestPath = newPath.replace("~" , "C:\\User");
            if (!newestPath.startsWith("C") && newestPath.contains("\\") && !path.startsWith("..")
                    && !path.startsWith("d")){
                StringBuilder sb = new StringBuilder(newestPath.length() + 2);
                sb.append(newestPath);
                return sb.insert(0, "C:").toString();
            } else return newestPath;
        }
        else{
            if (path.equals("C:\\")) return "/";
            String newPath = path.replace("\\" , "/");
            String newestPath = newPath.replace("C:/User" , "~");
            if (!newestPath.startsWith("~") && newestPath.contains("/") && !path.startsWith("..")
                    && !path.startsWith("d") && path.startsWith("C:\\User")){
                StringBuilder sb = new StringBuilder(newestPath.length() + 2);
                sb.append(newestPath);
                return sb.insert(0, "~").toString();
            } else return newestPath.replace("C:", "");
        }
    }
    public static String joinWords(String[] words) {
        if (words == null || words.length == 0) return null;
        StringBuilder newString = new StringBuilder(words.length);
        for (String word : words) {
            if (word == null || word.length() == 0) continue;
            newString.append(word).append(", ");
        }
        if (newString.length() == 0) return null;
        else {
            newString.deleteCharAt(newString.length() -1);
            newString.deleteCharAt(newString.length() -1);
            newString.insert(0, "[");
            newString.insert(newString.length(), "]");
            return newString.toString();
        }
    }

    public static void main(String[] args) {
        System.out.println("Test 1: countEqualIgnoreCaseAndSpaces");
        String[] words = new String[]{" WordS    \t", "words", "w0rds", "WOR  DS", };
        String sample = "words   ";
        int countResult = countEqualIgnoreCaseAndSpaces(words, sample);
        System.out.println("Result: " + countResult);
        int expectedCount = 2;
        System.out.println("Must be: " + expectedCount);
        System.out.println("Test 2: splitWords");
        String text = "   ,, first, second!!!! third";
        String[] splitResult = splitWords(text);
        System.out.println("Result : " + Arrays.toString(splitResult));
        String[] expectedSplit = new String[]{"first", "second", "third"};
        System.out.println("Must be: " + Arrays.toString(expectedSplit));
        System.out.println("Test 3: convertPath");
        String unixPath = "/some/unix/path";
        String convertResult = convertPath(unixPath, true);
        System.out.println("Result: " + convertResult);
        String expectedWinPath = "C:\\some\\unix\\path";
        System.out.println("Must be: " + expectedWinPath);
        System.out.println("Test 4: joinWords");
        String[] toJoin = new String[]{"go", "with", "the", "", "FLOW"};
        String joinResult = joinWords(toJoin);
        System.out.println("Result: " + joinResult);
        String expectedJoin = "[go, with, the, FLOW]";
        System.out.println("Must be: " + expectedJoin);
    }
}