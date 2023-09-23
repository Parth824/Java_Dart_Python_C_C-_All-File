// 19. Write a program to convert a binary number to decimal using a loop.

import 'dart:io';

void main() {
  stdout.write("Enter the Binary number: ");
  String num = stdin.readLineSync()!;

  int dec = 0;
  int j = 1;
  for (int i = num.length - 1; i >= 0; i--) {
    if (num[i] == '1') {
      dec = dec + j;
    }
    if (j == 1) {
      j = 2;
    } else {
      j = j * 2;
    }
  }

  print(dec);
}
