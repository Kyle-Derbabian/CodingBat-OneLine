public String wordAppend(String[] strings) {
  return String.join("", java.util.stream.IntStream.range(0, strings.length).mapToObj(n -> strings[n] + String.valueOf(Collections.frequency(Arrays.asList(strings).subList(0, n + 1), strings[n]))).collect(Collectors.toList()).stream().filter(n -> Integer.valueOf(n.substring(n.length() - 1)) % 2 == 0).map(n -> n.substring(0, n.length() - 1)).collect(Collectors.toList()));
}
