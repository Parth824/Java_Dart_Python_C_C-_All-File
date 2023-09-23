// Write a program to generate a list of all possible combinations of the elements of an inputted list using a loop.

import 'dart:io';

void main() {
  List input = [];

  for (int i = 0; i < 5; i++) {
    stdout.write("Enter The item $i: ");
    input.add(stdin.readLineSync()!);
  }

  print(input);
}
