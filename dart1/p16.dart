import 'dart:io';

void main() {
  stdout.write("Enter the first number: ");
  int a = int.parse(stdin.readLineSync()!);

  stdout.write("Enter the Other number: ");
  int b = int.parse(stdin.readLineSync()!);

  int c = 0;
  for (int i = 1; i < 100; i++) {
    if (a % i == 0 && b % i == 0) {
      c = i;
    }
  }
  int k = ((a * b) / c).toInt();
  print("Greatest Common Divisor: $k");
}
