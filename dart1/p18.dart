// Write a program to convert a decimal number to binary using a loop.
import 'dart:io';

void main() {
  stdout.write("Enter the Decimal number: ");
  int a = int.parse(stdin.readLineSync()!);

  List bin = [];

  for (int i = 1; a > 0; i++) {
    bin.add((a % 2).toString());
    a = (a / 2).toInt();
  }

  print("$a Conver into Binary ");

  Iterable j = bin.reversed;
  j.forEach((element) {
    stdout.write(element);
  });
}
