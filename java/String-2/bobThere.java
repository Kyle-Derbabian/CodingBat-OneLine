public boolean bobThere(String str) {
  return str.replaceAll("[^b]", "?").contains("b?b") || str.contains("bbb");
}
