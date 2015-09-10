#include <iostream>
using namespace std;

int fib(int x, int y, int z) {
	if (z == 1) return x;
	return fib(y, (x+y), z-1);
}

int main() {
	int x, y, z;

	while(true) {
		system("cls");
		cout << "Please enter the first two numbers of the sequence: ";
		cin >> x >> y;
		cout << "Please enter which element you wish to find: ";
		cin >> z;
		cout << "\n" << fib(x, y, z) << "\n\n";
		system("pause");
	}
	return 0;
}