class Solution {
    public boolean isPalindrome(String s) {
    
        ArrayList<Character> list = new ArrayList<>();
        
        for(char i : s.toLowerCase().toCharArray()){
            if((i >= 97 && i <= 122) || (i >= 48 && i <= 57))
                list.add(i);
        }

        for(int i = 0, j = list.size() - 1; i <= j; i++){
            if(list.get(i) != list.get(j))
                return false;

            j--;

        }

        return true;

    }
}
