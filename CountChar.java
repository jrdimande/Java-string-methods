public class CountChar{
    public static void main(String[] args) {
        
        String words = "Hello worldll!";
        int length = words.length();

        int count = 0; 

        for (int i = 0; i < length ; i++){
            if (words.charAt(i) == 'l'){
                count++;
            }

        }
        System.out.println(count);

    }
}