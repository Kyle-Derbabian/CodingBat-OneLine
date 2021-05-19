public List<String> lower(List<String> strings) {
  return strings.stream().map(n -> n.toLowerCase()).collect(Collectors.toList());
}
