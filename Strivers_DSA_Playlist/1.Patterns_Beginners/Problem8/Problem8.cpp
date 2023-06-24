#include<bits/stdc++.h>
using namespace std;

int main() {
	int n;
	cin >> n;

	for(int i = 1; i <= n; i++) {
		int stars = 2*n - 2*(i-1) - 1;
		int spaces = i - 1;
		for(int j = 1; j <= spaces; j++) {
			cout << " ";
		}
		for(int j = 1; j <= stars; j++) {
			cout << "*";
		}
		cout << endl;
	}

	return 0;
}
