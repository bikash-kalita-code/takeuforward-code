#include<bits/stdc++.h>
using namespace std;

int main() {
	int n;
	cin >> n;

	for(int i = 1; i <= n; i++) {
		int spaces = n - i;
		int stars = i;
		for(int j=1; j <= spaces; j++) {
			cout << " ";
		}
		for(int j=1; j <= stars; j++) {
			cout << "* ";
		}
		cout << endl;
	}

	for(int i = 1; i <= n; i++) {
		int spaces = i - 1;
		int stars = n - i + 1;
		for(int j = 1; j <= spaces; j++) {
			cout << " ";
		}
		for(int j = 1; j <= stars; j++) {
			cout << "* ";
		}
		cout << endl;
	}
	return 0;
}
