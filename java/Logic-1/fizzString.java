public String fizzString(String str) {
  return str.startsWith("f") && str.endsWith("b") ? "FizzBuzz" : str.startsWith("f") ? "Fizz" : str.endsWith("b") ? "Buzz" : str;
}
