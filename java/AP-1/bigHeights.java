public int bigHeights(int[] heights, int start, int end) {
  return heights.length == 1 || start == end ? 0 : (Math.abs(heights[start + 1] - heights[start]) >= 5 ? 1 : 0) + bigHeights(heights, start + 1, end);
}
