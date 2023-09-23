import 'dart:io';

void main() {
  stdout.write("Eneter the Number: ");
  int a = int.parse(stdin.readLineSync()!);
  int i = a;
  int b = 0;
  int len = a.toString().length;
  String k = "1";
  int? r;
  for (int j = 1; j < len; j++) {
    k = k + "0";
  }
  int m = 1;
  while (i > 0) {
    r = i % 10;
    b = (b + ((int.parse(k) / m) * r)).toInt();
    i = (i / 10).toInt();
    m = m * 10;
  }
  print("$a is reverse  $b");
}
