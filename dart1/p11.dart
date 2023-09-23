import 'dart:io';

void main() {
  stdout.write("Enter the number: ");
  int num = int.parse(stdin.readLineSync()!);

  int r;
  int n = num;
  int sum = 0;
  while (n > 0) {
    r = n % 10;
    sum = sum + r;
    n = (n / 10).toInt();
  }
  print("$num sum of digits is $sum");
}
