import 'dart:io';

void main() {
  double p, r, t, simple_interest;

  print("Enter the Moany: ");
  p = double.parse(stdin.readLineSync()!);
  print("Enter the Reat: ");
  r = double.parse(stdin.readLineSync()!);
  print("Enter the Time: ");
  t = double.parse(stdin.readLineSync()!);
  simple_interest = p * r * t / 100;

  print("simple_interest is $simple_interest");
}
