import 'dart:io';

void main() {
  var l = [];
  int i, number, conut = 0;
  print("Enter the number: ");
  int n = int.parse(stdin.readLineSync()!);
  for (i = 0; i < n; i++) {
    print("Enter Number ${i + 1}: ");
    number = int.parse(stdin.readLineSync()!);
    l.add(number);
  }
  l.forEach((element) {
    conut++;
  });
  print("Legth of Arrya is $conut");
}
