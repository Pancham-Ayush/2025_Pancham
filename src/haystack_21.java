public class haystack_21 {
    public int strStr(String haystack, String needle) {
    if(needle.length()==0)
        return 0;
        int n=needle.length();
        for (int i=0;i<haystack.length()-n;i++){
            if(haystack.substring(i,i+n).equals(needle))
                return i;

        }

        return -1;
    }
}
