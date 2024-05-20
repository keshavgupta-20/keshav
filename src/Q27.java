class Q27{

    public static String moveSpecialCharacters(String str){
        String sp =  "[^a-zA-Z0-9\\s+]";
        String spc = "";
        String c = "";
        for (int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if (String.valueOf(ch).matches(sp)){
                spc = spc + ch;
            }
            else{
                c = c+ ch;
            }
        }
        return (c + spc);

        //Implement your code here and change the return value accordingly

    }

    public static void main(String args[]){
        String str = "He@#$llo!*&";
        System.out.println(moveSpecialCharacters(str));
    }

}
