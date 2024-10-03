public class majorityVote {
        public List<Integer> findMajority(List<Integer> nums) {
            int n=nums.size();
            Map<Integer, Integer> frequencyMap=new HashMap<>();
            for(int num :nums){
                frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
            }
            List<Integer> result= new ArrayList<>();
            for(Map.Entry<Integer,Integer> entry: frequencyMap.entrySet()){
                if(entry.getValue()>n/3){
                    result.add(entry.getKey());
                }
            }
            if(result.isEmpty()){
                result.add(-1);
            }else{
                result.sort(null);
            }
            return result;
        }
}

