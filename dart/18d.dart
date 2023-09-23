import 'dart:io';

void main() {
  List? a = [];
  var x = [];
  int i, v, j;
  num sum = 0;
  int? e, like = 1;

  for (var i = 0; i < 3; i++) {
    x.clear();
    for (var j = 0; j < 3; j++) {
      stdout.write("a[$i][$j] : ");
      v = int.parse(stdin.readLineSync()!);
      x.add(v);
    }
    a.addAll([x.toList()]);
  }
  do {
    print("0). Exit of the Program!!!");
    print("1). Sum of All Elements!!!");
    print("2). Sum of Specific Row!!!");
    print("3). Sum of Specific Column!!!");
    print("4). Sum of Diagonal Elements!!!");
    print("5). Sum of AntiDiagonal Elements!!!");
    like = int.parse(stdin.readLineSync()!);

    switch (like) {
      case 0:
        like = 0;
        break;

      case 1:
        sum = 0;
        for (i = 0; i < 3; i++) {
          for (j = 0; j < 3; j++) {
            sum = sum + a[i][j];
          }
        }
        print("Sum of All Elements: $sum");
        break;
      case 2:
        for (i = 0; i < 3; i++) {
          sum = 0;
          for (j = 0; j < 3; j++) {
            sum = sum + a[i][j];
          }
          print("Sum of Row[${i + 1}] = $sum");
        }
        break;
      case 3:
        for (i = 0; i < 3; i++) {
          sum = 0;
          for (j = 0; j < 3; j++) {
            sum = sum + a[j][i];
          }
          print("Sum of Column[${i + 1}] = $sum");
        }
        break;
      case 4:
        sum = 0;
        for (i = 0; i < 3; i++) {
          for (j = 0; j < 3; j++) {
            if (i == j) {
              sum = sum + a[i][j];
            }
          }
        }
        print("Sum of Diagonal elements = $sum");
        break;
      case 5:
        sum = 0;
        for (i = 0; i < 3; i++) {
          for (j = 0; j < 3; j++) {
            if (i + j == 2) {
              sum = sum + a[i][j];
            }
          }
        }
        print("Sum of AntiDiagonal elements = $sum");
        break;
    }
  } while (e != 0);
}
