public int sumHeights2(int[] heights, int start, int end) {
  return heights.length == 1 || start == end ? 0 : (heights[start + 1] > heights[start] ? 2 : 1) * Math.abs(heights[start + 1] - heights[start]) + sumHeights2(heights, start + 1, end);
}
