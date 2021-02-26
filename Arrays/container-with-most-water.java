class Solution {
    public int maxArea(int[] height) {
        int area = -1;
        int head = 0, tail = height.length -1;
        while (head < tail) {
            area = Math.max(area, Math.min(height[head],  height[tail]) * (tail - head));
            if (height[head] > height[tail]) tail--;
            else head++;
        }
        return area;
    } 
}