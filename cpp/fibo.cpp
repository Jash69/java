#include <iostream>
using namespace std;

int main() {
    int n;
    cout << "Enter the number of Fibonacci numbers to generate: ";
    cin >> n;

    int a = 0, b = 1, next;
    cout << "Fibonacci Series:" << endl;

    for (int i = 0; i < n; i++) {
        if (i <= 1) {
            next = i;
        } else {
            next = a + b;
            a = b;
            b = next;
        }
        cout << next << " ";
    }

    cout << endl;
    return 0;
}
