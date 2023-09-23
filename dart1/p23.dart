// Write a program to find the average of all elements in an array.

import 'dart:io';

void main() {
  stdout.write("Enter The Lenght of array: ");
  int n = int.parse(stdin.readLineSync()!);
  int sum = 0;
  List Data = [];
  for (int i = 0; i < n; i++) {
    stdout.write("Enter the Values ${i + 1} no.: ");
    Data.add(int.parse(stdin.readLineSync()!));
    sum += Data[i] as int;
  }
  
  print("Average of all elements is: ${sum / Data.length}");
}
