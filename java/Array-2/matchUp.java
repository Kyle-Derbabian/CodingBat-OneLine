public int matchUp(int[] nums1, int[] nums2) {
  return nums1.length == 0 ? 0 : (Math.abs(nums1[0] - nums2[0]) < 3 && nums1[0] != nums2[0] ? 1 : 0) + matchUp(Arrays.copyOfRange(nums1, 1, nums1.length), Arrays.copyOfRange(nums2, 1, nums2.length));
}
