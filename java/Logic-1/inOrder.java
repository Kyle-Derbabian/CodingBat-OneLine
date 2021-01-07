public boolean inOrder(int a, int b, int c, boolean bOk) {
  return c > b && (bOk || b > a);
}
