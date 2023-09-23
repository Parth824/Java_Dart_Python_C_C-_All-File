import 'dart:io';

void main() {
  stdout.write("Enter the first number: ");
  int f = int.parse(stdin.readLineSync()!);
  stdout.write("Enter the List number: ");
  int l = int.parse(stdin.readLineSync()!);
  int number = 0;
  print("all prime numbers between $f to $l :");
  for (int i = f; i <= l; i++) {
    number = 0;
    for (int j = 1; j <= i; j++) {
      if (i % j == 0) {
        number++;
      }
    }
    if (number == 2) {
      stdout.write("$i ");
    }
  }
}
