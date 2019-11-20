public class maxArea11 {
    public static void main(String[] args) {

    }
    public int maxArea(int[] height) {
        int begin=0;
        int end=height.length-1;
        int max=0;
        while (begin!=end)
        {
            int area=(end-begin)*Math.min(height[begin],height[end]);
            if (area>max)
            {
                max=area;
            }
            if(height[begin]<height[end])
            {
                begin++;
            }
            else end--;
        }
        return max;
    }


}
