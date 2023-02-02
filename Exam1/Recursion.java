public class Recursion {

    public static void main(String[] args) {
        
        // Remove letters (30 pts)

        // Instructions (Important!)

        // Without using arrays or loops or regular expressions, apply recursion to remove specific letters in
        // your full name.

        // 1. If the last letter of your surname is a vowel, remove all vowels in
        // your full name.

        // 2. If the last letter of your surname is a consonant, remove all
        // consonants in your full name.

        // 3. Use only lowercase letters
        
        // 4. Each letter should be removed one by one.

        // Example:
        // Full name is "elizer ponio jr".
        // The output should be "lzr pn jr".

        // Put your complete name in the "fullName" variable.
        // Example:
        // String fullName = "elizer ponio jr";

        String fullName = "dan niel a añasco";

        removeLetter(fullName);
        
    }

    static void removeLetter(String str) {
      
        if (str.length()==0){
            return;
        }

    
        char vowel = str.charAt(0);
        if (vowel == 'b' | vowel == 'c' | vowel == 'd' | vowel == 'f' | vowel == 'g'| vowel == ' '){
            System.out.print(vowel);

        }

        removeLetter(str.substring(1)); 

    }
}