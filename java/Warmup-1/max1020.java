public int max1020(int a, int b) {
  return 10 <= a && a <= 20 && 10 <= b && b <= 20 ? a > b ? a : b : 10 <= a && a <= 20 && (10 > b || b > 20) ? a : (10 > a || a > 20) && 10 <= b && b <= 20 ? b : 0;
}
