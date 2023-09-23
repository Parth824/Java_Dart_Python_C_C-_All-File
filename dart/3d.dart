
import 'dart:io';

void main() {
  int? a, b;
  stdout.write("Enter the Values of a: ");
  a = int.parse(stdin.readLineSync()!);
  stdout.write("Enter the Values of b: ");
  b = int.parse(stdin.readLineSync()!);

  print("Multiplication of $a and $b is :${a * b}");
}
