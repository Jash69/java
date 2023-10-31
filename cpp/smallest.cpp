#include <iostream>
using namespace std;

int main() {
    int n;
    cout << "Enter the number of elements in the array: ";
    cin >> n;

    int numbers[n];
    cout << "Enter the elements of the array:" << endl;
    for (int i = 0; i < n; i++) {
        cin >> numbers[i];
    }

    int smallest = numbers[0];
    for (int i = 1; i < n; i++) {
        if (numbers[i] < smallest) {
            smallest = numbers[i];
        }
    }

    cout << "Smallest number in the array: " << smallest << endl;
    return 0;
}
