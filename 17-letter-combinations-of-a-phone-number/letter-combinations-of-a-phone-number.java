class Solution {
    public List<String> letterCombinations(String digits) {
        if(digits==null || digits.length()==0) return new ArrayList<>();

        Map<Character, String> digitsToLetters = new HashMap<>();
        digitsToLetters.put('2', "abc");
        digitsToLetters.put('3', "def");
        digitsToLetters.put('4', "ghi");
        digitsToLetters.put('5', "jkl");
        digitsToLetters.put('6', "mno");
        digitsToLetters.put('7', "pqrs");
        digitsToLetters.put('8', "tuv");
        digitsToLetters.put('9', "wxyz");

        List<String> result = new ArrayList<>();
        backtrack(digits, 0, new StringBuilder(), result, digitsToLetters);
        return result;
    }
    private void backtrack(String digits, int index, StringBuilder combination, List<String> result, Map<Character, String> digitsToLetters){
        if(index==digits.length()){
            result.add(combination.toString());
            return;
        }

        String letters=digitsToLetters.get(digits.charAt(index));
        for(char letter : letters.toCharArray()){
            combination.append(letter);
            backtrack(digits, index+1, combination, result, digitsToLetters);
            combination.deleteCharAt(combination.length()-1);
        }
    }
}