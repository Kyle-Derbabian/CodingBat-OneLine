public List<String> addStar(List<String> strings) {
  return strings.stream().map(n -> n + "*").collect(Collectors.toList());
}
