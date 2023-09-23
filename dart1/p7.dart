import 'dart:io';

void main() {
  stdout.write("Enter the number: ");
  int a = int.parse(stdin.readLineSync()!);
  int num = 0;
  for (int i = 1; i <= a; i++) {
    if (a % i == 0) {
      num++;
    }
  }
  if (num == 2) {
    print("$a is prime number");
  } else {
    print("$a is not prime number");
  }  
}
