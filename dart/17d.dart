import 'dart:io';

void main() {
  List a = [];
  List b = [];
  List sum = [];
  List x = [];
  int v;
  for (var i = 0; i < 3; i++) {
    x.clear();
    for (var j = 0; j < 3; j++) {
      v = int.parse(stdin.readLineSync()!);
      x.add(v);
    }
    a.addAll([x.toList()]);
  }
  for (var i = 0; i < 3; i++) {
    x.clear();
    for (var j = 0; j < 3; j++) {
      v = int.parse(stdin.readLineSync()!);
      x.add(v);
    }
    b.addAll([x.toList()]);
  }

  // a.addAll([
  //   {10, 20, 33}.toList()
  // ]);
  for (var i = 0; i < 3; i++) {
    x.clear();
    for (var j = 0; j < 3; j++) {
      v = a[i][j] + b[i][j];
      x.add(v);
    }
    sum.addAll([x.toList()]);
  }

  print(a);
  print(b);
  print(sum);
}
