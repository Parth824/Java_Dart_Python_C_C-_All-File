import 'dart:io';

void main() {
  String fname, lname;

  fname = stdin.readLineSync()!;
  lname = stdin.readLineSync()!;

  stdout.write(fname);
  stdout.write(" $lname");
}
