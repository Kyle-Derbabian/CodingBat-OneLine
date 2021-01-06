public String delDel(String str) {
  return str.indexOf("del") == 1 ? str.substring(0, str.indexOf("del")) + str.substring(str.indexOf("del") + 3) : str; 
}
