public int matchUp(String[] a, String[] b) {
  return a.length == 0 ? 0 : (!a[0].equals("") && !b[0].equals("") && a[0].substring(0, 1).equals(b[0].substring(0, 1)) ? 1 : 0) + matchUp(Arrays.copyOfRange(a, 1, a.length), Arrays.copyOfRange(b, 1, b.length));
}
