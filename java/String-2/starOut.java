public String starOut(String str) {
  return str.replaceAll("([^*]{0,1})\\*+([^*]{0,1})", "");
}
