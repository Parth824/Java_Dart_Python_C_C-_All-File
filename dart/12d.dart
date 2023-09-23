import 'dart:io';

void main() {
  List l = [1, 1, 1, 2.2, 2.5, "parth", "Parth", true, true];

  Set a = l.toSet();
  List l1 = a.toList();

  print(l1);

  Map<dynamic, String> b = {
    "id": "102",
    "name": "Parth",
    "Salary": "2000",
  };
  print(b);
}
