class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        //create new hashmap to store frequency of numss
        Map<Integer, Integer> map = new HashMap<>();
        //put num freqeuncies into hashmap
        for (int i : nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        //create new arrayList to store frequency of numbers
        List<Integer>[] freq = new ArrayList[nums.length +1];
        //intialize arrayLists in each position of freq
        for(int i = 0; i < freq.length; i++){
            freq[i] = new ArrayList<>();
        }
        
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            int frequency = entry.getValue();
            freq[frequency].add(entry.getKey());
        }

        int[] result = new int[k];
        int index = 0;
        for (int i = freq.length - 1; i >= 0; i--) {
            for (int num : freq[i]) {
                result[index++] = num;
                if (index == k) {
                    return result;
                }
            }
        }
        return new int[0];
    }
}