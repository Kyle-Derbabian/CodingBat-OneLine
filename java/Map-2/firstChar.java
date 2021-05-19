public Map<String, String> firstChar(String[] strings) {
  return Arrays.stream(strings).map(n -> n.substring(0, 1)).collect(Collectors.toSet()).stream().collect(Collectors.toMap(n -> n, n -> String.join("", Arrays.asList(strings).stream().filter(x -> x.substring(0, 1).equals(n)).collect(Collectors.toList()))));
}
