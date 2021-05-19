public boolean hasOne(int n) {
  return n / 10 == 0 ? n == 1 : n % 10 == 1 || hasOne(n / 10);
}
