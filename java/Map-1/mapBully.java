public Map<String, String> mapBully(Map<String, String> map) {
  return !map.containsKey("b") && map.containsKey("a") ? java.util.stream.Stream.concat(java.util.stream.Stream.of(new String[][]{{"b", map.get("a")}}).collect(Collectors.toMap(n -> n[0], n -> n[1])).entrySet().stream(), map.entrySet().stream().collect(Collectors.toMap(n -> n.getKey(), n -> n.getKey().equals("a") ? "" : n.getKey().equals("b") && map.containsKey("a") ? map.get("a") : n.getValue())).entrySet().stream()).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue)) : !map.containsKey("b") && !map.containsKey("a") ? map : map.entrySet().stream().collect(Collectors.toMap(n -> n.getKey(), n -> n.getKey().equals("a") ? "" : n.getKey().equals("b") && map.containsKey("a") ? map.get("a") : n.getValue()));
}
