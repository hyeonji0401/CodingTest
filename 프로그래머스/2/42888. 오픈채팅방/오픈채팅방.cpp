#include <string>
#include <sstream>
#include <vector>
#include <iostream>
#include <unordered_map>

using namespace std;

vector<string> solution(vector<string> record) {
    vector<string> answer;
    unordered_map<string, string>user;
    
    for(int i=0; i<record.size(); i++)
    {
        stringstream ss(record[i]);
        string action, id, name;
        ss >> action >> id >> name;
        if(action=="Enter"||action=="Change")
        {
            user.erase(id);
            user.insert({id,name});
        }
    }
    
    for(int j=0; j<record.size(); j++)
    {
        stringstream ss(record[j]);
        string action, id, name;
        ss >> action >> id >> name;

        if(action=="Enter")
        {
            string enter = user[id]+"님이 들어왔습니다.";
            answer.push_back(enter);
        }
        else if(action=="Leave")
        {
            string leave = user[id]+"님이 나갔습니다.";
            answer.push_back(leave);
        }
    }
    
    return answer;
}