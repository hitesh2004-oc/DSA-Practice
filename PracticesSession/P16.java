package PracticesSession;

public class P16 {
	public static void main(String[] args) {
		String words[] = {"hey","aeo","mu","ooo","artro"};
		int count  = 0;
        for(int i = 0; i<words.length; i++){
            String str = words[i];
            char a = str.charAt(0);
            char b = str.charAt(str.length() - 1);
            if((a == 'a' || a == 'e' || a == 'i' || a == 'o' || 
            a == 'u') && (b == 'a' || b == 'e' || b == 'i' || b == 'o' || b == 'u'))
            count++;

            
        }
        System.out.println(count);
	}

}
