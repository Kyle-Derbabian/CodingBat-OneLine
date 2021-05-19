public Map<String, Integer> wordCount(String[] strings) {
  return java.util.stream.IntStream.range(0, (new HashSet<String>(Arrays.asList(strings))).size()).boxed().collect(Collectors.toMap(n -> (new HashSet<String>(Arrays.asList(strings))).toArray(new String[(new HashSet<String>(Arrays.asList(strings))).size()])[n], n -> Collections.frequency(Arrays.asList(strings), (new HashSet<String>(Arrays.asList(strings))).stream().collect(Collectors.toList()).get(n))));
}
