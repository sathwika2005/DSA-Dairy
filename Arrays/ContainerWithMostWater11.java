package Arrays;

public class ContainerWithMostWater11 {
    public static int maxAreaOfWater(int[] heights) {
        int n = heights.length;
        int i = 0, j = n - 1;
        int maxArea = 0, area = 0, height = 1, width = 1;
        while (i < j) {
            height = Math.min(heights[i], heights[j]);
            width = j - i;
            area = width * height;
            maxArea = Math.max(maxArea, area);
            if (heights[i] < heights[j]) {
                i++;
            } else {
                j--;
            }
        }
        return maxArea;
    }

    public static void main(String[] args) {
        int[] heights = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
        System.out.println(maxAreaOfWater(heights));
    }
}
