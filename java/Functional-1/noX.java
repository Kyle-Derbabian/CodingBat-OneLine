public List<String> noX(List<String> strings) {
  return strings.stream().map(n -> n.replaceAll("x", "")).collect(Collectors.toList());
}
