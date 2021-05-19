// Doesn't work

public String[] allSwap(String[] strings) {

  String[] answer = new String[strings.length];
  
  for (int i = 0; i < strings.length; i++) {
    
    answer[i] = strings[i] + " matches " + matchIndex(strings[i], Arrays.copyOfRange(strings, i + 1, strings.length)).toString();
    
  }

  return answer;
  
}


public boolean matches(String str1, String str2) {
  
  String firstCharacter = str1.substring(0, 1);
  java.util.regex.Pattern pattern = 
  java.util.regex.Pattern.compile
  (java.util.regex.Pattern.quote(firstCharacter) + ".*");
  
  return pattern.matcher(str2).matches();
  
}

public List<String> matchIndex(String str, String[] strings) {
  
  String firstCharacter = str.substring(0, 1);
  
  java.util.regex.Pattern pattern = 
  java.util.regex.Pattern.compile
  (java.util.regex.Pattern.quote(firstCharacter) + ".*");
  
  
  List<String> list = Arrays.asList(strings);
  
  
  List<String> list2 = list.stream()
      .filter(n -> pattern.matcher(n).matches())
      .collect(Collectors.toList());
      
  return list2;
  
}











/*
public String[] allSwap(String[] strings) {
  String[] results = new String[strings.length];
  for (int i = 0; i < strings.length; i++) {
    for (int j = i + 1; j < strings.length; j++) {
      if (strings[i].charAt(0) == strings[j].charAt(0) & !strings[i].contains("*")) {
        String temp = strings[i];
        strings[i] = strings[j] + "*";
        strings[j] = temp + "*";
      }
    }
    results[i] = strings[i];
  }
  String[] result = new String[results.length];
  for (int i = 0; i < strings.length; i++) {
    String str = strings[i].replace("*", "");
    results[i] = str;
  }
  return results;
}
*/
