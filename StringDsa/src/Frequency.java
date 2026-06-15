public class Frequency {

        public static void main(String[] args) {

            String s = "abbbaaccc";

            int[] freq = new int[26];

            for (int i = 0; i < s.length(); i++) {
                char ch = s.charAt(i);
                freq[ch - 'a']++;
            }
            // print only existing characters
            /*for (int i = 0; i < 26; i++) {
                if (freq[i] > 0) {
                    System.out.println((char)(i + 'a') + " -> " + freq[i]);
                }
            }
            for (int j = 0; j < 26; j++) {

                    System.out.println((char) (j + 'a') + " -> " + freq[j]);
            }*/
            }

}
