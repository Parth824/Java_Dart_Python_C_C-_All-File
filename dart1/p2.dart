import 'dart:io';

void main() {
  stdout.write("Enter The First number: ");
  int? a = int.parse(stdin.readLineSync()!);
  stdout.write("Enter The Last number: ");
  int? b = int.parse(stdin.readLineSync()!);
  int sum = 0;

  for (int i = a; i <= b; i++) {
    sum += i;
  }
  print("Sum of $a to $b is: $sum");
}
