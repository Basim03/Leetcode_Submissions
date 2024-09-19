class Solution {
    public String frequencySort(String s) {
        // Step 1: Count the frequency of each character
        Map<Character, Integer> frequencyMap = new HashMap<>();
        for (char c : s.toCharArray()) {
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }

        // Step 2: Convert the string to a list of characters
        List<Character> characters = new ArrayList<>();
        for (char c : s.toCharArray()) {
            characters.add(c);
        }

        // Step 3: Sort the characters based on frequency, then lexicographically for ties
        characters.sort((a, b) -> {
            int freqCompare = frequencyMap.get(b) - frequencyMap.get(a);
            if (freqCompare == 0) {
                return a - b;
            }
            return freqCompare;
        });

        // Step 4: Build the result string
        StringBuilder result = new StringBuilder();
        for (char c : characters) {
            result.append(c);
        }

        return result.toString();
    }
    }
