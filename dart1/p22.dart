// Write a program to find the sum of all elements in an array.

import 'dart:io';

void main() {
  stdout.write("Enter the Lenght of array: ");
  int n = int.parse(stdin.readLineSync()!);
  List k = [];
  int sum = 0;

  for (int i = 0; i < n; i++) {
    stdout.write("Enter value of no.${i + 1}: ");
    k.add(int.parse(stdin.readLineSync()!));
    sum += (k[i] as int);
  }

  print(sum);
}
