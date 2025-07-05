package PracticeSessionAssignments.June19;

import java.util.Scanner;

public class VowelCounter {
    static int spaceCount=0;
    static int countVowel(String s){
        char[] vowels={'a','e','i','o','u'};
        int count=0;
        s.toLowerCase();
        for (int i = 0; i < s.length(); i++) {
            for(char c:vowels){
                if(c==s.charAt(i)){
                    count++;
                }
            }
            if(s.charAt(i)==' '){
               spaceCount+=1;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String : ");
        String s=sc.nextLine();
        int vowelCount=countVowel(s);
        int consonantCount=s.length()-vowelCount-spaceCount;
        System.out.println("Vowel Count : "+vowelCount);
        System.out.println("Consonant Count : "+consonantCount);
        System.out.println("Spaces Count : "+spaceCount);
        System.out.println(s.length());

    }
}
