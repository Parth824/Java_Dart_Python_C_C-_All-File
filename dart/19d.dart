import 'dart:io';

class Student {
  int? a;
  int? b;
}

void main() {
  Student s = Student();
  stdout.write("Enter the values of a: ");
  s.a = int.parse(stdin.readLineSync()!);

  print("$s.a");
}
