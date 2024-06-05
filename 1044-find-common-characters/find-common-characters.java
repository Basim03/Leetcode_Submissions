class Solution {
    public List<String> commonChars(String[] words) {
          // Initialize the counter with the first word
        int[] commonCounter = new int[26];
        Arrays.fill(commonCounter, Integer.MAX_VALUE);
        
        for (String word : words) {
            int[] wordCounter = new int[26];
            for (char c : word.toCharArray()) {
                wordCounter[c - 'a']++;
            }
            for (int i = 0; i < 26; i++) {
                commonCounter[i] = Math.min(commonCounter[i], wordCounter[i]);
            }
        }

        // Prepare the result list
        List<String> result = new ArrayList<>();
        for (int i = 0; i < 26; i++) {
            for (int j = 0; j < commonCounter[i]; j++) {
                result.add(String.valueOf((char) (i + 'a')));
            }
        }

        return result;
    }
    }
