import 'dart:io';

void main() {
  int n1, n2, i, j;

  print("Enter the Number1 :");
  n1 = int.parse(stdin.readLineSync()!);
  print("Enter the Number1 :");
  n2 = int.parse(stdin.readLineSync()!);

  for (i = 1; i <= 10; i++) {
    for (j = n1; j <= n2; j++) {
      stdout.write("$j * $i = ${j * i}\t");
    }
    stdout.write("\n");
  }
}
