import 'dart:io';

void main() {
  stdout.write("Enter The number: ");
  int num = int.parse(stdin.readLineSync()!);
  int a = num;
  int n = 0;
  while (a > 0) {
    a = (a / 10).toInt();
    n++;
  }
  print("$num  number of digits is $n");
}
