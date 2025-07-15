class Solution {
    public boolean isValid(String word) {
        if(word.length() < 3) return false;

        boolean isVowel = false;
        boolean isCons = false;

        for(char c: word.toCharArray()){
            if(!Character.isLetterOrDigit(c)) return false;

            if(hasVowel(c)){
                isVowel = true;
            } else if(Character.isLetter(c)){
                isCons = true;
            }
        }
        return isVowel && isCons;
    }
    private boolean hasVowel(char c){
        c = Character.toLowerCase(c);
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}