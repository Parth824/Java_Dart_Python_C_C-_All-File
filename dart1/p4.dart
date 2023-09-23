import 'dart:io';

void main() {
  stdout.write("Enter the number: ");
  int? n = int.parse(stdin.readLineSync()!);
  int? a;
  int? k = 1;
  int? b = 0;
  int? i = n;
  String? num = "1";
  for(int j =1;j<n.toString().length;j++)
  {
      num = num! + "0";
  }
  while (i! > 0) {
    a = i % 10;
    b = (b! + ((int.parse(num!)/ k!) * a)).toInt();
    i = (i / 100 * 10).toInt();
    k = k * 10;
  }
  if (n == b) {
    print("$n is palindrome number..");
  } else {
    print("$n is not palindrome number");
  }
}
