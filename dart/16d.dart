import 'dart:io';

void main() {
  var l = [];
  int n, number, j = 1;
  int? pos, value, c;
  stdout.write("Enter Size of arrya: ");
  n = int.parse(stdin.readLineSync()!);

  for (var i = 0; i < n; i++) {
    number = int.parse(stdin.readLineSync()!);
    l.add(number);
  }
  do {
    print("1). Insert ");
    print("2). Delete ");
    print("3). Update ");
    print("4). View ");
    print("5). Exit ");
    c = int.parse(stdin.readLineSync()!);
    switch (c) {
      case 1:
        stdout.write("Enter Postion :");
        pos = int.parse(stdin.readLineSync()!);
        stdout.write("Enter values :");
        value = int.parse(stdin.readLineSync()!);
        l.insert(pos, value);
        n = n + 1;
        break;

      case 2:
        stdout.write("Which values are delect :");
        value = int.parse(stdin.readLineSync()!);
        l.remove(value);
        n--;
        break;

      case 3:
        stdout.write("Which postoin are you Update :");
        pos = int.parse(stdin.readLineSync()!);
        stdout.write("Enter values :");
        value = int.parse(stdin.readLineSync()!);

        l[pos] = value;
        break;

      case 4:
        for (var i = 0; i < n; i++) {
          print("l[$i] : ${l[i]}");
        }
        break;

      case 5:
        j = 0;
        break;
    }
  } while (j != 0);
}
