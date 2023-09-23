import 'dart:io';

void main() {
  stdout.write("Enter the length of List: ");
  int n = int.parse(stdin.readLineSync()!);

  List number = [];
  int temp;
  for (int i = 0; i < n; i++) {
    stdout.write("Enter Number[$i] is: ");
    int a = int.parse(stdin.readLineSync()!);

    number.add(a);
  }

  for (int i = 0; i < n; i++) {
    print("${number[i]}");
  }
  for (int i = 0; i < n; i++) {
    for (int j = i + 1; j < n; j++) {
      if (number[i] > number[j]) {
        temp = number[i];
        number[i] = number[j];
        number[j] = temp;
      }
    }
  }

  print("==========");
  print("ascending");
  print("==========");
  for (int i = 0; i < n; i++) {
    print("${number[i]}");
  }
}
