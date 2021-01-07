public int blueTicket(int a, int b, int c) {
  return a + b == 10 || b + c == 10 || c + a == 10 ? 10 : a + b == b + c + 10 || a + b == c + a + 10 ? 5 : 0;
}
