public class v18 {    //Count the num of words in sentence
    public static void main(String[] args) {
        String sentence="Count the number of words in a sentence";
        String[]words=sentence.trim().split("\\s+");
        int count= words.length;
        System.out.println(count);

        //manual without using split
        int counts=0;
        boolean inWord=false;
        for (int i=0;i<sentence.length();i++){
            char ch=sentence.charAt(i);
            if (!Character.isWhitespace(ch)){
                if (!inWord){
                    counts++;
                    inWord=true;
                }
            } else {
                inWord=false;
            }
        }
        System.out.println(counts);
    }
}
