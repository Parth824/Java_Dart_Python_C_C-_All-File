import 'dart:io';

void main() {
  int n;

  stdout.write("What number Your Cube: ");
  n = int.parse(stdin.readLineSync()!);

  print("$n Cube is: ${n * n * n}");
}
