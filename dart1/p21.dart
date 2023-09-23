import 'dart:io';
// Write a program to find the largest element in an array.

void main() {
  List data = [];
  stdout.write("Enter Lenght of List: ");
  int len = int.parse(stdin.readLineSync()!);
  int bignumber = 0;

  for (int i = 0; i < len; i++) {
    stdout.write("Enter Value of ${i + 1}: ");
    data.add(int.parse(stdin.readLineSync()!));
  }

  for (int i = 0; i < len; i++) {
    for (int j = i + 1; j < len; j++) {
      if (data[i] < data[j]) {
        bignumber = data[j];
      }
    }
  }

  print("largest Number of Arrya: $bignumber");
}
