class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(candidates);
        combinationSumHelper(candidates, target, new ArrayList<>(), result, 0);
        return result;
    }

    private void combinationSumHelper(int[] candidates, int target, List<Integer> current, List<List<Integer>> result, int start) {
        if (target == 0) {
            result.add(new ArrayList<>(current));
            return;
        }

        for (int i = start; i < candidates.length; i++) {
            if(i>start && candidates[i]==candidates[i-1]){
            continue;
            }
        
        
            if (target - candidates[i] >= 0) {
                current.add(candidates[i]);
                combinationSumHelper(candidates, target - candidates[i], current, result, i+1);
                current.remove(current.size() - 1);
            }
        }
    }}
    