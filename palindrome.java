public class palindrome{
    public static void main(String[] args) {

        String name1 = "ana";
        String reversed_name1 = "";

        for(int i = name1.length() - 1; i >= 0; i--){
            reversed_name1 += name1.charAt(i);
            System.out.println(reversed_name1);
        }

        if (name1.toLowerCase().equals(reversed_name1)){
            System.out.println("The word is a palidrome");
        }
        else{
            System.out.println("Não são iguais");
        }


    }
}