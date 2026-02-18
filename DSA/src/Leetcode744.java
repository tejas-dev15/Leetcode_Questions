public class Leetcode744 {
    public char nextGreatestLetter(char[] letters, char target) {
        int left = 0;
        int right = letters.length -1;

        int mid = left + (right - left)/2;

        while(left <= right){
            mid = left + (right - left)/2;

            if(letters[mid]<= target){
                left = mid + 1;
            }
            else {
                right = mid -1;
            }
        }

        if(left > letters.length -1 ){
            return letters[0];
        }else{
            return letters[left];
        }
    }
}
