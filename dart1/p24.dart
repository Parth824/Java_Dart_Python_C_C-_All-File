// Write a program to count the number of even and odd elements in an array.

import 'dart:io';

void main() {
  stdout.write("Enter the Lenght of array: ");
  int n = int.parse(stdin.readLineSync()!);

  List data = [];
  int evenCount = 0;
  int oddCount = 0;
  for (int i = 0; i < n; i++) {
    stdout.write("Enter the value of ${i + 1}no.: ");
    data.add(int.parse(stdin.readLineSync()!));
  }

  for (int i = 0; i < n; i++) {
    if (data[i] % 2 == 0) {
      evenCount++;
    } else {
      oddCount++;
    }
  }

  print("Number of Even is : $evenCount");
  print("Number of Odd is : $oddCount");

}
