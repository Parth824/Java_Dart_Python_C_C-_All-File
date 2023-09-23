import 'dart:io';

void main() {
  int i, b, c;
  print("Enter num1: ");
  int n1 = int.parse(stdin.readLineSync()!);
  print("Enter num2: ");
  int n2 = int.parse(stdin.readLineSync()!);
  b = (n2 - n1) + 1;
  c = n1;
  List l = List.generate(b, ((i) => i + c));
  List l1 = List.generate(10, ((i) => i + 1));

  // l.forEach(
  //   (element) {
  //     print(element);
  //   },
  // );
  l1.forEach(
    (e) {
      l.forEach((el) {
        stdout.write("$el * $e = ${e * el}\t");
      });
      stdout.write("\n");
    },
  );
}
