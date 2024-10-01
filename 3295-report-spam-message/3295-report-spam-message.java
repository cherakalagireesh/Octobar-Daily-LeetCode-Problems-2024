class Solution {
    public boolean reportSpam(String[] message, String[] bannedWords) {

        Set<String> words = new HashSet<>(Arrays.asList(bannedWords));
        int count = 0;

        for(String msg : message)
        {
            if(words.contains(msg))
                count++;

            if(count == 2)
                return true;
        }

        return false;
    }
}