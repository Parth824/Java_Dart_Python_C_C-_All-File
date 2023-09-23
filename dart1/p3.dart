
import 'dart:io';

//0 1 1 2
void main() {
  stdout.write("Enter The Number: ");
  int? n = int.parse(stdin.readLineSync()!);
  int? a = 0;
  int? c;
  int? b = 1;
  for (int i = 0; i <n; i++) {
    if (i == 0) {
      print(i);
    } else if (i == 1) {
      print(i);
    } else {
      c = a! + b!;
      print(c);
      a = b;
      b = c;
    }
  }
}
