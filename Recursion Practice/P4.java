package Recursive;

public class P4 {

    static String[] words = {"zero","one","two","three","four","five","six","seven","eight","nine"};

    public static String spell(int n) {
        if(n<10) return words[n];

        return spell(n/10) + " " + words[n%10];
    }

    public static void main(String[] args) {
        System.out.println(spell(12));
    }
}