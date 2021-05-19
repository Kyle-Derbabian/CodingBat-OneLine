public Map<String, Boolean> wordMultiple(String[] strings) {
  return (new HashSet<String>(Arrays.asList(strings))).stream().collect(Collectors.toMap(n -> n, n -> Collections.frequency(Arrays.asList(strings), n) >= 2));
}
