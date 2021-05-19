public int roundSum(int a, int b, int c) {
  return (a % 10 >= 5 ? a + 10 - a % 10 : a - a % 10) + (b % 10 >= 5 ? b + 10 - b % 10 : b - b % 10) + (c % 10 >= 5 ? c + 10 - c % 10 : c - c % 10); 
}
