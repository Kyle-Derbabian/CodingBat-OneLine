public Map<String, String> topping3(Map<String, String> map) {
  return map.containsKey("potato") && map.containsKey("salad") ? java.util.stream.Stream.concat(java.util.stream.Stream.of(map.containsKey("fries") && map.containsKey("spinach") ? new String[0][0] : map.containsKey("fries") ? new String[][] {{"spinach", map.get("salad")}} : map.containsKey("spinach") ? new String[][] {{"fries", map.get("potato")}} : new String[][] {{"fries", map.get("potato")}, {"spinach", map.get("salad")}}).collect(Collectors.toMap(n -> n[0], n -> n[1])).entrySet().stream(), map.entrySet().stream().collect(Collectors.toMap(n -> n.getKey(), n -> n.getKey().equals("fries") ? map.get("potato") : n.getKey().equals("spinach") ? map.get("salad") : n.getValue())).entrySet().stream()).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue)) : map.containsKey("potato") ? java.util.stream.Stream.concat(java.util.stream.Stream.of(map.containsKey("fries") && map.containsKey("spinach") ? new String[0][0] : new String[][] {{"fries", map.get("potato")}}).collect(Collectors.toMap(n -> n[0], n -> n[1])).entrySet().stream(), map.entrySet().stream().collect(Collectors.toMap(n -> n.getKey(), n -> n.getKey().equals("fries") ? map.get("potato") : n.getValue())).entrySet().stream()).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue)) : map.containsKey("salad") ? java.util.stream.Stream.concat(java.util.stream.Stream.of(map.containsKey("fries") && map.containsKey("spinach") ? new String[0][0] : new String[][] {{"spinach", map.get("salad")}}).collect(Collectors.toMap(n -> n[0], n -> n[1])).entrySet().stream(), map.entrySet().stream().collect(Collectors.toMap(n -> n.getKey(), n -> n.getKey().equals("spinach") ? map.get("salad") : n.getValue())).entrySet().stream()).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue)) : java.util.stream.Stream.concat(map.entrySet().stream(), (new HashMap<String, String>()).entrySet().stream()).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
}
