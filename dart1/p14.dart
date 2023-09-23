import 'dart:io';

void main() {
  stdout.write("Enter Length of List: ");
  int n = int.parse(stdin.readLineSync()!);
  int? temp;
  List number = [];

  for (int i = 0; i < n; i++) {
    stdout.write("Enter the Number $i: ");
    int a = int.parse(stdin.readLineSync()!);
    number.add(a);
  }

  for (int i = 0; i < n; i++) {
    for (int j = i + 1; j < n; j++) {
      if (number[i] < number[j]) {
        temp = number[i];
        number[i] = number[j];
        number[j] = temp;
      }
    }
  }

  print("The largest is ${number[0]}");
  print("The smallest is ${number[n-1]}");
}
