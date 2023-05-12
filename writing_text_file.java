// Write to a txt file 
#include <iostream>
#include <fstream>;
using namespace std;
int main(){
ofstream obj;
obj.open("abc.txt");
if(!obj){
    cout<<"file not created :D";
}
else {
    cout<< "file created";
    obj<< "vighnesh";
    obj.close();
    }
return 0;   
}