import 'dart:io';

void main() {
  int I, n;
  Map? x, y, z;
  print("How many EMP Enter: ");
  n = int.parse(stdin.readLineSync()!);

  for (I = 0; I < n; I++) {
    print("-----------------------------");
    print("Enter the EMP ${I + 1} Deteli: ");
    print("-----------------------------");
    stdout.write("Enter ID: ");
    int i = int.parse(stdin.readLineSync()!);
    stdout.write("Enter Name: ");
    String n = stdin.readLineSync()!;
    stdout.write("Enter age: ");
    int a = int.parse(stdin.readLineSync()!);
    stdout.write("Enter salary: ");
    int s = int.parse(stdin.readLineSync()!);

    if (I == 0) {
      x = {"id": i, "name": n, "age": a, "salary": s};
    } else if (I == 1) {
      y = {"id": i, "name": n, "age": a, "salary": s};
    } else if (I == 2) {
      z = {"id": i, "name": n, "age": a, "salary": s};
    }
  }
  stdout.write(x);
  stdout.write(y);
  stdout.write(z);
}
