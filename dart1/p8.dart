import 'dart:io';

void main() {
  stdout.write("Enter the number: ");
  int? a = int.parse(stdin.readLineSync()!);
  int number = 1;

  for (int i = 1; i <= a; i++) {
    number =number * i;
  }
  print("$a factorial is $number");
}
