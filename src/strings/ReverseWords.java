package strings;

public class ReverseWords {

    public String reverseWords(String input){
        String[] arr = input.split(" ");
        int iteration = arr.length/2;
       for(int j=0; j<iteration; j++){
            String temp = arr[j];
            arr[j] = arr[arr.length-1-j];
            arr[arr.length-1-j] = temp;
        }
        return String.join(" ", arr);
    }

    public static void main(String a[]){
        ReverseWords reverseWords = new ReverseWords();
        System.out.println(reverseWords.reverseWords("I love you Cherry"));
    }
}
