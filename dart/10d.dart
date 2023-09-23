import 'dart:io';

void main() {
  int n;
  stdout.write("Enter the number: ");
  n = int.parse(stdin.readLineSync()!);

  if (n % 2 == 0) {
    print("Number is Even");
  } else {
    print("Number is obb");
  }
}
