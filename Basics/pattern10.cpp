#include <iostream>
using namespace std;

void pattern10(int row){
    int p = row/2;
    for(int i = 1; i <= row; i++){
        for(int j = 1; j <= row; j++){
            
            if(i + j == p + 2 || i + j == p + 4 ){
                cout<<"*\t";
            }
            else if( i + j == row + 1 ){
                cout<<"*\t";
            }
            else{
                cout<<"\t";
            }
            
        }
        cout<<endl;
    }
}

int main(int argc, char **argv){
    int n;
    cin >> n;
    
    pattern10(n);

    //write your code here
    
}