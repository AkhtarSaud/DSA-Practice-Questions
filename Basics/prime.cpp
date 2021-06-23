#include<iostream>
using namespace std;

bool isprime_(int n) {
    bool prime = true;
    for (int i=2; i*i < n; i++) {
        if (n % i == 0) {
            prime = false;
            break;
        }
    }
    return prime;
}

void isprime(){
    int n;
    cin>>n;
    bool ans = isprime_(n);

    if (ans) cout << "prime" << endl;
    else cout << "not prime" << endl;
}

int main() {
    int t;
    cin >> t;

    while(t-- > 0){
        isprime();
    }
    return 0;

}