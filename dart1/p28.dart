import 'dart:io';

void main() {
  stdout.write("Enter The Lenght of array is ?: ");
  int n = int.parse(stdin.readLineSync()!);

  List data = [];
  List temp=[];
  for (int i = 0; i < n; i++) {
    stdout.write("Enter The value of No ${i + 1} is: ");
    data.add(int.parse(stdin.readLineSync()!));
  }
  print(data);
  for(int i =n-1;i>=0;i--)
  {
    temp.add(data[i]);
  }
  data = temp;

  print(data);

}


