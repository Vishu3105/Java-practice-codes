public class v9 {        //count vowels & const in string
    public static void main(String[] args) {
        String str="Vishwas";
        str = str.toLowerCase();
        int vowels=0,consonants=0;

        // using for and if else
//        for (int i=0;i<str.length();i++) {
//            char ch = str.charAt(i);
//            if (ch >= 'a' && ch <= 'z') {
//                if ("aeiou".indexOf(ch) != -1) {
//                    vowels++;
//                } else
//                    consonants++;
//            }
//        }

        // using switch
//        for (char ch:str.toCharArray()) {
//            switch (ch) {
//                case 'a': case 'e': case 'i': case 'o': case 'u':
//                    vowels++;
//                    break;
//                default:
//                    if (ch > 'a' && ch < 'z')
//                        consonants++;
//            }
//        }

        //using char.isLetter()
        for (char ch:str.toCharArray()){
            if (Character.isLetter(ch)){
                if ("aeiou".indexOf(ch)!=-1) {
                    vowels++;
                }else
                    consonants++;
                }
            }

        System.out.println("vowels: "+vowels);
        System.out.println("consonants: "+consonants);
    }
}
