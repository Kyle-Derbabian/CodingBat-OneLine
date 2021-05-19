// Doens't work yet

public boolean twoTwo(int[] nums) {
  String arrString = Arrays.toString(nums);
  arrString = arrString.substring(1, arrString.length() - 1);
  arrString = arrString.replaceAll(",", "");


  String line = arrString;
  String pattern = ".";

  java.util.regex.Pattern r1 = java.util.regex.Pattern.compile(pattern + " 2 " + pattern);
  java.util.regex.Matcher m1 = r1.matcher(line.substring(1, line.length() - 1));

  return !m1.find();
  
}
