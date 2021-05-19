public String getSandwich(String str) {
  return str.lastIndexOf("bread") - str.indexOf("bread") > 0 ? str.substring(str.indexOf("bread") + 5, str.lastIndexOf("bread")) : "";
}
