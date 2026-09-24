public class ContainerWithMostWater {
    public static void main (String [] args) {

        int[] height = {1,8,6,2,5,4,8,3,7} ;

        System.out.println("Max area: " + maxArea(height));
    }

    public static int maxArea(int[] heights) {
        int maxArea = 0;

        for (int i = 0; i < heights.length; i++) {
            for (int j = i + 1; j < heights.length; j++) {

                int width = j - i;

                int height = Math.min(heights[i], heights[j]);
                int area = width * height;

                maxArea = Math.max(area, maxArea);
            }
        }
        return maxArea;
    }
}