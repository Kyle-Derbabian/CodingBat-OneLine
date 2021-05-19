public List<String> no34(List<String> strings) {
  return strings.stream().filter(n -> n.length() != 3 && n.length() != 4).collect(Collectors.toList());
}
