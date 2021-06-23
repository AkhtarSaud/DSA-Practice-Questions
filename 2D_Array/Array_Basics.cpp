#include<iostream>
using namespace std;

void input(vector<vector<int>> & arr){

    int n = arr.size();
    int m = arr[0].size();

    for(int i = 0; i < n; i++){
        for (int j = 0; j < m; j++)
        {
            cin >> arr[i][j];
        }
        
    }
}

void display(vector<vector<int>> & arr){

    int n = arr.size();
    int m = arr[0].size();

    for(int i = 0; i < n; i++){
        for (int j = 0; j < m; j++)
        {
            cout << arr[i][j] + " ";
        }
        cout << endl ;
    }
}

bool findData(vector<vector<int>> & arr, int data){

    for (int data : arr)
    {
        if( data == arr[i][j]){
            return true;
        }
        
    }
    return false;
}

void maxElement(vector<vector<int>> & arr){

    maxEle = -(int)1e9;
    
    for (int ele : arr[i][j])
    {
        if( ele > maxEle){
            maxEle = ele;
        }
        
    }
    return maxEle;
}

void minElement(vector<vector<int>> & arr){

    minEle = (int)1e9;
    
    for (int ele : arr[i][j])
    {
        if( ele < minEle){
            minEle = ele;
        }
        
    }
    return minEle;
}
