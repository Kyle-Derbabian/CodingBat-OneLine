public List<String> noLong(List<String> strings) {
  return strings.stream().filter(n -> n.length() < 4).collect(Collectors.toList());
}
