class Solution {

    public void solve(int[] candidates,
                      int target,
                      int index,
                      List<Integer> curr,
                      List<List<Integer>> ans) {

        if (target == 0) {
            ans.add(new ArrayList<>(curr));
            return;
        }

        if (index == candidates.length || target < 0) {
            return;
        }

        // Take current element
        curr.add(candidates[index]);

        solve(candidates,
              target - candidates[index],
              index,
              curr,
              ans);

        curr.remove(curr.size() - 1);

        // Skip current element
        solve(candidates,
              target,
              index + 1,
              curr,
              ans);
    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {

        List<List<Integer>> ans = new ArrayList<>();

        solve(candidates,
              target,
              0,
              new ArrayList<>(),
              ans);

        return ans;
    }
}