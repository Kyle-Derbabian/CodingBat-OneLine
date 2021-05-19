public List<String> copies3(List<String> c) {
  return c.stream().map(n -> n + n + n).collect(Collectors.toList());
}
