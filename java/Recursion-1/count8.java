public int count8(int n) {
  return n < 8 ? 0 : n % 10 == 8 ? n / 10 % 10 == 8 ? 2 + count8(n / 10) : 1 + count8(n / 10) : count8(n / 10); 
}
