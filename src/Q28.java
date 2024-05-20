// check a program is pallindrome or not
class Q28 {
    public static String reverseEachWord(String str){
        //Implement your code here and change the return value accordingly
        String st2 = "";
        //Implement your code here and change the return value accordingly
        for (int i=str.length()-1; i>=0; i--){
            st2 +=  str.charAt(i);
        }
        return st2;
    }

    public static void main(String args[]){
        String str = "Sun rises in the east";
        System.out.println(reverseEachWord(str));
    }
}