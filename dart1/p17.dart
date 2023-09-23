import 'dart:io';

void main() {
  stdout.write("Enter the first number: ");
  int a = int.parse(stdin.readLineSync()!);

  stdout.write("Enter the Other number: ");
  int b = int.parse(stdin.readLineSync()!);

  int c = 0;
  for (int i = 1; i < 100; i++) {
    if (i % a == 0 && i % b == 0) {
      c = i;
      break;
    }
  }
  print("Least Common Multiple: $c");
}
