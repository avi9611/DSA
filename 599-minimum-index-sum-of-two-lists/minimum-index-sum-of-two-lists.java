class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        Map<String, Integer> map = new HashMap<>();
        List<String> res = new ArrayList<>();
        int minValue = Integer.MAX_VALUE;

        for(int i = 0; i < list1.length; i++){
            map.put(list1[i], i);
        }

        for(int j = 0; j < list2.length; j++){
            String s = list2[j];
            if(map.containsKey(s)){
                int indexSum = j + map.get(s);
                if(indexSum < minValue){
                    res.clear();
                    res.add(s);
                    minValue = indexSum;
                } else if (indexSum == minValue){
                    res.add(s);
                }
            }
        }
        return res.toArray(new String[0]);
    }
}