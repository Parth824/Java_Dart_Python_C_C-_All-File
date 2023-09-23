import 'dart:io';

void main() {
  int a,i;

  print("Enter the number: ");
  a = int.parse(stdin.readLineSync()!);

  for (i = 1; i <=10; i++) {
    print("$a * $i = ${a * i}");
  }
}
