// Doesn't work yet

public String[] firstSwap(String[] strings) {
  
  if (strings.length == 0) {
    return strings;
  }
  
  String longest = Arrays.stream(strings).max(Comparator.comparingInt(String::length)).get();
  int maxLength = longest.length();
  String marker = String.join("", Collections.nCopies(maxLength, "*"));
  
  String firstString = strings[0];
  String firstChar = firstString.substring(0, 1);
  
  List<String> list = Arrays.asList(strings);
  List<String> filtered = Arrays.stream(strings).filter(i -> i.substring(0, 1).equals(firstChar)).collect(Collectors.toList());
  
  if (filtered.size() == 1) {
    
    String[] first = new String[] {firstString};
    String[] second = firstSwap(Arrays.copyOfRange(strings, 1, strings.length));
    
    List<String> answer = java.util.stream.Stream.concat(Arrays.stream(first), Arrays.stream(second)).collect(Collectors.toList());
    return answer.toArray(new String[0]);
    
  } else {
    
    String match = filtered.get(1);
    int index = list.indexOf(match);
    
    String[] firstRecurrence = Arrays.copyOfRange(strings, 1, index);
    String[] secondRecurrence = Arrays.copyOfRange(strings, index + 1, strings.length);
    
    List<String> recurrenceList = java.util.stream.Stream.concat(Arrays.stream(firstRecurrence), Arrays.stream(secondRecurrence)).collect(Collectors.toList());
    recurrenceList = recurrenceList.stream().map(i -> i.substring(0, 1).equals(firstChar) ? marker + i : i).collect(Collectors.toList());
    
    String[] recurrence = recurrenceList.toArray(new String[0]);
    
    String[] output = firstSwap(recurrence);
    
    String[] first = new String[] {match};
    String[] second = Arrays.copyOfRange(output, 0, index - 1);
    String[] third = new String[] {firstString};
    String[] fourth = Arrays.copyOfRange(output, index - 1, output.length);
    
    List<String> answer = java.util.stream.Stream.concat(Arrays.stream(first), Arrays.stream(second)).collect(Collectors.toList());
    answer = java.util.stream.Stream.concat(answer.stream(), Arrays.stream(third)).collect(Collectors.toList());
    answer = java.util.stream.Stream.concat(answer.stream(), Arrays.stream(fourth)).collect(Collectors.toList());
    
    return answer.toArray(new String[0]);
    
  }
}


// public String[] firstSwap(String[] strings) {
  

//   String longest = Arrays.stream(strings).max(Comparator.comparingInt(String::length)).get();
//   int maxLength = longest.length();
  
//   String marker = "*".repeat(maxLength);
  

// }
