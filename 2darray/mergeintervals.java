import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

class mergeintervals {
    public int[][] merge(int[][] intervals) {
        if (intervals == null || intervals.length <= 1) {
            return intervals;
        }
        
        // Sort intervals based on start time
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        
        List<int[]> result = new ArrayList<>();
        int[] currentInterval = intervals[0];
        result.add(currentInterval);
        
        for (int i = 1; i < intervals.length; i++) {
            int currentEnd = currentInterval[1];
            int nextStart = intervals[i][0];
            int nextEnd = intervals[i][1];
            
         
            if (currentEnd >= nextStart) {
                currentInterval[1] = Math.max(currentEnd, nextEnd);
            } else {
                // No overlap, add the next interval to result
                currentInterval = intervals[i];
                result.add(currentInterval);
            }
        }
        
        return result.toArray(new int[result.size()][]);

        
    }
    public static void main(String[] args) {
        mergeintervals obj = new mergeintervals();
        int[][] intervals = {{1,3},{2,6},{8,10},{15,18}};
        int[][] merged = obj.merge(intervals);
        for (int[] interval : merged) {
            System.out.println("[" + interval[0] + ", " + interval[1] + "]");
        }
        


    }
}