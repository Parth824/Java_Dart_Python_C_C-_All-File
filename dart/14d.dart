import 'dart:io';
void main() {
  int i;
  int? number;
  var l = [];
  print("Enter values of n: ");
  int n = int.parse(stdin.readLineSync()!);
  for (i = 0; i < n; i++) {
    stdout.write("Enter value ${i + 1} = ");
    number = int.parse(stdin.readLineSync()!);
    l.add(number);
  }

  print(l);

  print("Negative Number: ");
  l.forEach(
    (element) {
      if (element < 0) {
        print(element);
      }
    },
  );
}
