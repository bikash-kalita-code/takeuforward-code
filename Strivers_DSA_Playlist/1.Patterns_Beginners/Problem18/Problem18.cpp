#include<bits/stdc++.h>
using namespace std;

int main() {
	int n;
	cin >> n;

	int base = 64;
	for(int i = 1; i <= n; i++) {
		for(int j=n; j >= n-i+1; j--) cout << char(j+base) << " ";
		cout << endl;
	}
	return 0;
}
