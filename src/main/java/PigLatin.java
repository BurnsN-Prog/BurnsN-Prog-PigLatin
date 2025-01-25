
public class PigLatin {
    /**
     * Pig latin works as follows: every word has its first character moved to the end, and 'ay' is added to the end of the
     * word.
     *
     *     example:
     *     word = ordway
     *     pig = igpay
     *     latin = atinlay
     *
     * Take in a word and return the pig latin form. You will need to use the substring method of String to break
     * up the string.
     * String docs: https://docs.oracle.com/javase/7/docs/api/java/lang/String.html
     *
     * @param in A string.
     * @return the pig latin form of in.
     */
    public String returnPigLatin(String in){
        StringBuilder result = new StringBuilder();
        for (int i = 1; i < in.length(); i++){
            result.append(in.charAt(i));
            if (i>=in.length()-1){
                result.append(in.charAt(0));
                result.append("ay");
            }
    }
        return result.toString();
    }
}
