public boolean catDog(String str) {
  return str.replace("cat", "").length() == str.replace("dog", "").length();
}
