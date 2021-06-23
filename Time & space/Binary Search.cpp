#include<iostream.h>
#include<vector>

using namespace std;

int BinarySearch(vector<int> &arr, int data, int si, int ei){

    while(si <= ei){
        int mid = (si + ei) / 2;

        if(arr[mid] == data)
            return mid;
        else if(arr[mid] < data)
            si = mid + 1;
        else
        {
            ei = mid - 1;
        }
        
    }

    return - 1;
}

