class Solution {
    public int maxDistance(List<List<Integer>> arrays) {
        int min = arrays.get(0).get(0);
        int max = arrays.get(0).get(arrays.get(0).size() - 1);
        int maxDistance = 0;

        for (int i = 1; i < arrays.size(); i++) {
            List<Integer> currentArray = arrays.get(i);
            int currentMin = currentArray.get(0);
            int currentMax = currentArray.get(currentArray.size() - 1);

            // Calculate distances using current array's min and max with global max and min
            maxDistance = Math.max(maxDistance, Math.abs(currentMax - min));
            maxDistance = Math.max(maxDistance, Math.abs(max - currentMin));

            // Update global min and max
            min = Math.min(min, currentMin);
            max = Math.max(max, currentMax);
        }

        return maxDistance;
    }
}
