import 'dart:io';

void main() {
  stdout.write("Enter the String: ");
  String str = stdin.readLineSync()!;
  String pstr = "";

  for (int i = str.length - 1; i >= 0; i--) {
    pstr = pstr + str[i];
  }

  if (str == pstr) {
    print("$str string is a palindrome");
  } else {
    print("$str string is not a palindrome");
  }
}
