#include <iostream>
using namespace std;

void printpattern1(int row){
    
    int nst = 1;
    //int nsp= row - 1;
    for (int r =1; r<= row ; r++){
        for( int csp = 1; csp <= nst; csp++){
            cout<<"*\t";
        }
        //for (int cst = 1; cst<= nst; cst++){
           // cout<<"*";
        //}
        nst++;
        //nsp--;
        cout<<endl;
    }
}

void printpattern2(int row){
    
    int nst = row;
    //int nsp= row - 1;
    for (int r =1; r<= row ; r++){
        for( int csp = 1; csp <= nst; csp++){
            cout<<"*\t";
        }
        //for (int cst = 1; cst<= nst; cst++){
           // cout<<"*";
        //}
        nst--;
        //nsp--;
        cout<<endl;
    }
}

void printpattern3(int row){
    int nst = 1;
    int nsp= row - 1;
    for (int r =1; r<= row ; r++){
        for( int csp = 1; csp <= nsp; csp++){
            cout<<"\t";
        }
        for (int cst = 1; cst<= nst; cst++){
            cout<<"*\t";
        }
        nst++;
        nsp--;
        cout<<endl;
    }
}

void printpattern4(int row){
    int nst = row;
    int nsp= 0;
    for (int r =1; r<= row ; r++){
        for( int csp = 1; csp <= nsp; csp++){
            cout<<"\t";
        }
        for (int cst = 1; cst<= nst; cst++){
            cout<<"*\t";
        }
        nst--;
        nsp++;
        cout<<endl;
    }
}

void printpattern5(int row){
    int nst = 1;
    int nsp= row/2 ;
    for (int r =1; r<= row ; r++){
        for( int csp = 1; csp <= nsp; csp++){
            cout<<"\t";
        }
        for (int cst = 1; cst<= nst; cst++){
            cout<<"*\t";
        }
        if(r <= row/2){
            nsp--;
            nst+=2;
        }else{
            nsp++;
            nst-=2;
        }
        
        cout<<endl;
    }
}

void printpattern6(int row){
    int nst = (row+1)/2;
    int nsp= 1 ;
    for (int r =1; r<= row ; r++){
        
        for (int cst = 1; cst<= nst; cst++){
            cout<<"*\t";
        }
        for( int csp = 1; csp <= nsp; csp++){
            cout<<"\t";
        }
        for (int cst = 1; cst<= nst; cst++){
            cout<<"*\t";
        }
        if(r <= row/2){
            nsp+=2;
            nst-=1;
        }else{
            nsp-=2;
            nst+=1;
        }
        
        cout<<endl;
    }
}

void pattern7(int row){
        
    for(int i = 1; i <= row; i++){
        for(int j = 1; j <= row; j++){
            if(i == j)
                cout<<"*\t";
            else 
                cout<<"\t";
            }
            
            cout<<endl;
        }
    }

void pattern9(int row){
        
    for(int i = 1; i <= row; i++){
        for(int j = 1; j <= row; j++){
            if(i == j)
                cout<<"*\t";
            else if(i + j == row + 1)
                cout<<"*\t";
            else
                cout<<"\t";
            }
        cout<<endl;
        }
    }

void extra_pattern(int row){
'''    *   		*			
	*		*		
*		*		*	
	*		*		
*		*			
'''
    int p = row/2;
    for(int i = 1; i <= row; i++){
        for(int j = 1; j <= row; j++){
            if(i + j == row + 1)
                cout<<"*\t";
            else if(i + j == p + 2 || i + j == p + 4 || i + j == p + 6)
                cout<<"*\t";
            else 
                cout<<"\t";
        }
            
            cout<<endl;
        }
    }

void extra_pattern2(int row){
    int p = row/2;
    for(int i = 1; i <= row; i++){
        for(int j = 1; j <= row; j++){
            if(i + j == row + 1)
                cout<<"*\t";
            else if(i + j == p + 2 || i + j == p + 6)
                cout<<"*\t";
            else 
                cout<<"\t";
        }
            
            cout<<endl;
        }
}


void printpattern(int row){
    int nst = 1;
    int nsp= row - 1;
    for (int r =1; r<= row ; r++){
        for( int csp = 1; csp <= nsp; csp++){
            cout<<" ";
        }
        for (int cst = 1; cst<= nst; cst++){
            cout<<"*";
        }
        nst++;
        nsp--;
        cout<<endl;
    }
}

int main(int argc, char **argv){
    int n;
    cin >> n;
    // printpattern(n);
    extra_pattern2(n);
   //write your code here
   
}