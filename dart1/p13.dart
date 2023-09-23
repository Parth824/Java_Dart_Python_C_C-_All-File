import 'dart:io';

void main() {
  stdout.write("Enter the number: ");
  int a = int.parse(stdin.readLineSync()!);
  int r;
  int sum = 0;
  int i = a;

  while (i > 0) {
    sum = 0;
    while (i > 0) {
      r = i % 10;
      sum = sum + r;
      i = (i / 10).toInt();
    }
    if (sum > 9) {
      i = sum;
    }
  }
  print(sum);
}
