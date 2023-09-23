import 'dart:io';

void main() {
  stdout.write("Enter the Lenght of Array: ");
  int n = int.parse(stdin.readLineSync()!);

  List data = [];
  for (int i = 0; i < n; i++) {
    stdout.write("Enter itme ${i + 1} is: ");
    data.add(int.parse(stdin.readLineSync()!));
  }
  int temp = 0;
  for (int i = 0; i < n; i++) {
    for (int j = i + 1; j < n; j++) {
      if (data[i] < data[j]) {
        temp = data[i];
        data[i] = data[j];
        data[j] = temp;
      }
    }
  }

  print("second largest element in an array is ${data[1]}");
}
