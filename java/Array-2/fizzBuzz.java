public String[] fizzBuzz(int start, int end) {
  return start == end ? new String[0] : java.util.stream.Stream.concat((start % 3 == 0 && start % 5 == 0 ? Arrays.asList(new String[] {"FizzBuzz"}) : start % 3 == 0 ? Arrays.asList(new String[] {"Fizz"}) : start % 5 == 0 ? Arrays.asList(new String[] {"Buzz"}) : Arrays.asList(new String[] {String.valueOf(start)})).stream(), Arrays.asList(fizzBuzz(start + 1, end)).stream()).collect(Collectors.toList()).toArray(new String[0]);
}
