public int sumHeights(int[] heights, int start, int end) {
  return heights.length == 1 || start == end ? 0 : Math.abs(heights[start + 1] - heights[start]) + sumHeights(heights, start + 1, end);
}
