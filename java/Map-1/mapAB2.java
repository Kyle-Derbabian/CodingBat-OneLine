public Map<String, String> mapAB2(Map<String, String> map) {
  return map.entrySet().stream().filter(map.containsKey("a") && map.containsKey("b") && map.get("a").equals(map.get("b")) ? n -> !n.getKey().equals("a") && !n.getKey().equals("b") : n -> n == n).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
}
