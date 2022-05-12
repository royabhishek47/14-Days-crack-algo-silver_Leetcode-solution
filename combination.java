//combinations

class Solution {
    private static List<List<Integer>> allPossibles;
    private static Deque<Integer> Q;
    
    public List<List<Integer>> combine(int n, int k) {
        Q = new ArrayDeque<>();
        allPossibles = new ArrayList<>();
        generate(n, k, 1);
        return allPossibles;
    }
    
    private void generate(int n, int k, int start) {
        if(k==0) {
            List<Integer> l = new ArrayList<>(Q);
            allPossibles.add(l);
            return;
        }
        for(int i=start; i<= n-k+1; i++) {
            Q.addLast(i);
            generate(n, k-1, i+1);
            Q.removeLast();
        }
    }
}