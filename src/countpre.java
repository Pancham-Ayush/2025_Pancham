public class countpre {

    public int prefixCount(String[] words, String pref) {
        int count=0;
        for (String x:words){
            if(x.startsWith(pref))
                count++;
        }
        return count;
    }
}