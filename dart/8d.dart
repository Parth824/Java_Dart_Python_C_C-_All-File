import 'dart:io';

void main() {
  int? i = 1;
  int chois, a, b;
  do {
    print("1). Sum Calacution.");
    print("2). Sub Calacution.");
    print("3). Multipliction Calacution.");
    print("4). Divsoin Calacution.");
    print("5). Exite.");
    chois = int.parse(stdin.readLineSync()!);

    switch (chois) {
      case 1:
        stdout.write("Enter Num1: ");
        a = int.parse(stdin.readLineSync()!);
        stdout.write("Enter Num2: ");
        b = int.parse(stdin.readLineSync()!);
        print("$a + $b = ${a + b}");
        break;
      case 2:
        stdout.write("Enter Num1: ");
        a = int.parse(stdin.readLineSync()!);
        stdout.write("Enter Num2: ");
        b = int.parse(stdin.readLineSync()!);
        print("$a - $b = ${a - b}");
        break;
      case 3:
        stdout.write("Enter Num1: ");
        a = int.parse(stdin.readLineSync()!);
        stdout.write("Enter Num2: ");
        b = int.parse(stdin.readLineSync()!);
        print("$a * $b = ${a * b}");
        break;
      case 4:
        stdout.write("Enter Num1: ");
        a = int.parse(stdin.readLineSync()!);
        stdout.write("Enter Num2: ");
        b = int.parse(stdin.readLineSync()!);
        print("$a / $b = ${a / b}");
        break;
      case 5:
        i = 0;
        break;
    }
  } while (i != 0);
}
