// read from a txt file 
#include <iostream>
#include <fstream>;
using namespace std;
int main(){
ifstream obj;
obj.open("abc.txt");
if(!obj){
    cout<<"file not created :D";
}
else {
    cout<< "file created"<<endl;
    char ch;
    while(!obj.eof()){
        obj>>ch;
        cout<<ch;
    }
    obj.close();
    }
return 0;   
}