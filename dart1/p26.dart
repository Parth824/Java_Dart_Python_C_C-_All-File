import 'dart:io';

void main() {
  stdout.write("Enter the Lenght of array?:");
  int n = int.parse(stdin.readLineSync()!);

  List data = [];

  for (int i = 0; i < n; i++) {
    stdout.write("Enter the Value of itme ${i + 1} is: ");
    data.add(int.parse(stdin.readLineSync()!));
  }
  int temp = 0;
  for (int i = 0; i < n; i++) {
    for (int j = i + 1; j < n; j++) {
      if (data[i] > data[j]) {
        temp = data[j];
        data[j] = data[i];
        data[i] = temp;
      }
    }
  }

  print("Asc ordering...");
  print(data);
}
